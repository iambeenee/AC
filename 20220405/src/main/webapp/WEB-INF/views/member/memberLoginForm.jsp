<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div align="center">
	<div>
		<h1>로 그 인</h1>
	</div>
	<hr/>
	<div>
		<form id="frm" action="memberLogin.do" method="post">
			<div>
				<table>
					<tr>
						<th width="150">아 이 디</th>
						<td width="200">
							<input type="email" id="id" name="id" placeholder="Enter Your Email...">
						</td>
					</tr>
					<tr>
						<th width="150">패스워드</th>
						<td width="200">
							<input type="password" id="password" name="password" placeholder="Enter Your Password...">
						</td>
					</tr>
				</table>
			</div><br />
			<div>
				<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</div>
		</form>
	</div>
</div>