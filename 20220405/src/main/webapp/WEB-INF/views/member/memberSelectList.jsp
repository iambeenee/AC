<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div align="center">
	<div>
		<h1>회원목록</h1>
	</div>
	<hr/>
	<div>
		<table>
			<thead>
				<tr>
					<th width="150">아 이 디</th>
					<th width="150">이 름</th>
					<th width="150">전화번호</th>
					<th width="150">주 소</th>
					<th width="150">권 한</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach items="${members }" var="m">
					<tr>
						<td>${m.id }</td>
						<td>${m.name }</td>
						<td>${m.tel }</td>
						<td>${m.address }</td>
						<td>${m.author }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br />
	<div>
		<button type="button" onclick="location.href='home.do'">홈</button>
	</div>
</div>