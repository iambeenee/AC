<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>공지사항</h1>
<br />
<table>
	<thead>
		<tr>
			<th>TITLE</th>
			<th>CONTENT</th>
			<th>DATE</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="notices" var="n">
			<tr>
				<td>${n.title }</td>
				<td>${n.content }</td>
				<td>${n.wdate }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>