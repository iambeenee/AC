<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="main.do">
<input type="submit">
</form> -->
이름: <input type="text" name="first_name"><br/>
나이: <input type="number" name="salary"><br/>
<button onclick="save_emp()">저장</button>


<div id="show"></div>

<script>
	function save_emp(){
		var fnElem = document.querySelector('input[name="first_name"]');
		var saElem = document.querySelector('input[name="salary"]');
		
		var fnv = fnElem.value;
		var sav = saElem.value;
		
		var xhtp = new XMLHttpRequest();
		xhtp.open('post', 'DataServlet.do');
		xhtp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		xhtp.send('firstName=' + fnv + '&salary=' + sav); // firstName=Park&salary=1000
		xhtp.onload = function(){
			console.log(xhtp.responseText);
			var result = JSON.parse(xhtp.responseText);
			var show = document.querySelector('#show>ul');
			
			var liTag = document.createElement('li');
			liTag.innerText = '이름: ' + result.name + ', 나이: ' + result.age;
			
			show.prepend(liTag);
		}
		
	}

	var xhtp = new XMLHttpRequest(); // ajax: 비동기방식으로 데이터를 요청하고 처리
	xhtp.open('get', 'DataServlet.do');
	xhtp.send();
	xhtp.onload = function(){
		var result = xhtp.responseText;
		result = JSON.parse(result); // json -> object타입으로 변경
		console.log(result);
		var show = document.getElementById("show");
		var tag = "<ul>"; 
		for(let i=0; i<result.length; i++){
			console.log('이름: ' + result[i].name + ', 나이: ' + result[i].age);
			tag += '<li>이름: ' + result[i].name + ', 나이: ' + result[i].age + '</li>';
		}
		tag += "</ul>";
		show.innerHTML = tag;
	}
</script>
</body>
</html>