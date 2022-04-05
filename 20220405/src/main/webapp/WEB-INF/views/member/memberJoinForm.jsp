<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<style>
th {
	float: right;
}

td {
	width: 300px;
}
</style>

<div align="center">
	<div>
		<h1>회원가입</h1>
	</div>
	<hr/>
	<div>
		<form id="frm" action="memberJoin.do" method="post">
			<div>
				<table>
					<tr>
						<th>아이디</th>
						<td>
							<input type="email" id="id" name="id">
							<span>
								<button type="button" onclick="idCheck()">중복체크</button>
							</span>
						</td>
					</tr>
					<tr>
						<th>패스워드</th>
						<td width="200"><input type="password" id="password"
							name="password"></td>
					</tr>
					<tr>
						<th>패스워드 확인</th>
						<td width="200"><input type="password" id="password1"
							name="password1"></td>
					</tr>
					<tr>
						<th>이름</th>
						<td width="200"><input type="text" id="name" name="name">
						</td>
					</tr>
					<tr>
						<th>주소</th>
						<td width="200"><input type="text" id="address"
							name="address"></td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td width="200"><input type="text" id="tel" name="tel">
						</td>
					</tr>
				</table>
			</div>
			<br />
			<div>
				<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취   소">&nbsp;&nbsp;&nbsp;
				<input type="button" value="홈 가기" onclick="location.href='home.do'">
			</div>
		</form>
	</div>
</div>

<script type="text/javascript">
//	전통적인 ajax
// 	function idCheck(){
// 		const id = frm.id.value;
// 		const xhttp = new XMLHttpRequest(); // ajax 객체 생성
// 		콜백함수
// 		xhttp.onreadystatechange = function(){
// 			if (this.readyState == 4 && this.status == 200){
// 				alert(this.responseText);
// 			}
// 		}
// 		xhttp.open("GET", "ajaxidCheck.do?id="+id);
// 		xhttp.send();
// 	}

	function idCheck(){
		var id = frm.id.value;
		var url = "ajaxIdCheck.do?id="+id;
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(){
			if (this.readyState == 4 && this.status == 200){
				if(this.responseText == 'Yes'){
					idCheckSuccess(); // 이미 존재
				} else {
					idCheckFail(); // 사용 가능
				}
			}
		}
		xhr.open("GET", url);
		xhr.send();
	}
	
	function idCheckSuccess(){
		alert("이미 존재하는 아이디입니다.");
		frm.id.value="";
		frm.id.focus();
	}

	function idCheckFail(){
		alert("사용 가능한 아이디입니다.");
		frm.password.focus();
	}
	
//	fetch 함수를 이용한 ajax
// 	function idCheck(){
// 		var id = frm.id.value;
// 		var url = "ajaxIdCheck.do";
// 		fetch(url, {
// 			method : 'post',
// 			headers : {
// 				'Content-Type' : 'application/x-www-form-urlencoded',
// 			},
// 			body : 'id='+id
// 		})
// 		.then(response => response.text())
//		.then(successFunction(response)) // 함수를 이용해서 처리하는 경우
// 		.then(text=>alert(text))
// 	}
</script>