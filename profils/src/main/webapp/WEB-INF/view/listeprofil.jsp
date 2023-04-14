<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste profil</title>
</head>
<body>
<div class="container mt-5">
<div class="card">
 <div class="card-header">
 Liste des profils
 </div>
 <div class="card-body">
 
 <table class="table table-striped">
 <tr>
<th>ID</th><th>Nom profil</th><th>Prix</th><th>Date Creation</th><th>Suppression<th>Edition</th>
 </tr>
 <c:forEach items="${profils}" var="p">
 <tr>
 <td>${p.idprofil}</td>
 <td>${p.nomprofil}</td>
 <td>${p.prixprofil}</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${p.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous sur ?')"
href="supprimerprofil?id=${p.idprofil }">Supprimer</a></td>
 <td><a href="modifierprofil?id=${p.idprofil }">Edit</a></td>
 </tr>
 </c:forEach> 
 </table>
 </div>
</div>
</div>
</body>
</html>
