<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form class="form-signin" action="loginprocesing" method="post" >
    <h2 class="form-signin-heading"> Please Login </h2>
    <input name="username" type="text" placeholder="login"/>
    <input name="password" type="password" placeholder="password"/>
    <button class="btn btn-lg btn-block btn-primary" type="submit"> Login </button>
</form:form>