<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<style>
th {
	width: 200px;
}
td {
	width: 300px;
}
</style>

<div align="center">
	<div>
		<h1>NOTICE REGISTRATION</h1>
	</div>
	<hr />
	<div>
		<form id="frm" action="noticeInsert.do" method="post" enctype="multipart/form-data">
			<div>
				<table>
					<tr>
						<th>TITLE</th>
						<td>
							<input size="70" type="text" id="title" name="title">
						</td>
					</tr>
					<tr>
						<th>CONTENT</th>
						<td>
							<textarea rows="10" cols="70" name="content"></textarea>
						</td>
					</tr>
					<tr>
						<th>DATE</th>
						<td>
							<input type="date" id="wdate" name="wdate">
						</td>
					</tr>
					<tr>
						<th>ATTACHMENTS FILE</th>
						<td>
							<input type="file" id="file" name="file">
						</td>
					</tr>
				</table>
			</div><br />
			<div>
				<input type="submit" value="Registration">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="Cancel">&nbsp;&nbsp;&nbsp;
				<input type="button" value="Notice List" onclick="location.href='noticeList.do'">
				<input type="button" value="HOME" onclick="location.href='home.do'">
			</div>
		</form>
	</div>		
</div>