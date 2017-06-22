<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri=http://java.sun.com/jsp/jstl/core %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Books</title>
</head>
<style>
body {background-color: Moccasin; text-align: center}
h2{color: MidnightBlue; text-align: center}
th{color: MidnightBlue; text-align: center}
</style>
<h2>Welcome to book Management - List of Books Available</h2>
<body>
<table border=1>
<tr>
<th>isbn13</th>
<th>Title</th>
<th>Author</th>
<th>PublishDate</th>
<th>Content</th>
<th>Price</th>
<th>Status</th>

</tr>
<c:forEach items="${BOOK_LIST}" var="book">
<tr>
<td>${book.isbn13 }</td>
<td>${book.title}</td>
<td>${book.author }</td>
<td>${book.publishDate}</td>
<td>${book.content }</td>
<td>${book.price }</td>
<td>${book.status }</td>
<td><a href="../book/${book.isbn13}">View</a></td>
</tr>
</c:forEach>


</table>
</body>
</html>