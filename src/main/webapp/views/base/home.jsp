<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<section id="banner">
    <ul class="actions">

        <sec:authorize access="!isAuthenticated()"><li>
            <a href="/registration" class="button big">Register</a>
        </li></sec:authorize>

            <sec:authorize access="!isAuthenticated()"> <li>
                <a href="/loginpage">Sign in</a>
            </li>
        </sec:authorize>

        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <a href="/admin" class="button big">Admin</a>
        </sec:authorize>

    </ul>

</section>