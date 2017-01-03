<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
    <title>Registration</title>
</head>


<input type="hidden" name="csrf_name"
       value="${_csrf.parameterName}" />
<input type="hidden" name="csrf_value"
       value="${_csrf.token}" />



<form:form modelAttribute="user" action="saveUser" method="post" cssClass="form-control form-group-sm">
    <div id="form-main">
    <div id="form-div">
        <form class="form" id="form1">

            <p class="firstName">
                <form:input path="firstName" type="text"
                            class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
                            placeholder="Name" id="name" />
            </p>
            <p class="secondName">
                <form:input path="secondName" type="text"
                            class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
                            placeholder="Name" id="name" />
            </p>

            <p class="email">
                <form:input path="email" type="text"
                            class="validate[required,custom[email]] feedback-input"
                            id="email" placeholder="Email" />
            </p>

            <p class="password">
                <form:input path="password" type="text"
                            class="validate[required,custom[email]] feedback-input"
                            id="email" placeholder="password" />
            </p>

            <div class="submit">
                <input type="submit" value="register" id="button-blue" />
                <div class="ease"></div>
            </div>

        </form>
    </div>
</form:form>

