<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div align="center">
	<div>
		<h1>N O T I C E</h1>
	</div>
	<hr />
	<div>
		<table>
			<thead>
				<tr>
					<th>NUM</th>
					<th width="100">TITLE</th>
					<th width="200">CONTENT</th>
					<th width="300">DATE</th>
					<th>HIT</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach items="${notices }" var="n">
					<tr>
						<td>${n.id }</td>
						<td>${n.title }</td>
						<td>${n.content }</td>
						<td>${n.wdate }</td>
						<td>${n.hit }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br />
	<div>
		<a href="home.do">HOME</a>
		<a href="noticeInputForm.do">Registration</a>
	</div>
</div>