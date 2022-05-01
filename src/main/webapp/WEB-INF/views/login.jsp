<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <style>

    </style>
    <%--   CSS   --%>

    <%--bootstrap--%>
    <link href="<c:url value="/resources/bootstrap5/css/bootstrap.min.css" />" rel="stylesheet">

    <link href="<c:url value="/resources/form/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/form/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css" />"
          rel="stylesheet">


    <%--   JS   --%>

    <%--bootstrap--%>
    <script src="<c:url value="/resources/bootstrap5/js/bootstrap.min.js" />"></script>

    <%--kit--%>
    <script src="https://kit.fontawesome.com/33fd3056a5.js" crossorigin="anonymous"></script>


</head>

<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: ghostwhite">
        <!-- Container wrapper -->
        <div class="container-fluid">

            <!-- Home -->
            <ul class="navbar-nav d-flex flex-row me-1">
            </ul>

            <ul class="navbar-nav d-flex flex-row me-1">

                <li class="nav-item me-3 me-lg-0">
                    <a class="nav-link active" aria-current="page" href="#"><spring:message code="home.page"/></a>
                </li>

<%--                <li>--%>
<%--                    <a class="nav-link" href="${pageContext.request.contextPath }/login?lang=ru" style="display: inline-block">RU</a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a class="nav-link" href="${pageContext.request.contextPath }/login?lang=en" style="display: inline-block">EN</a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a class="nav-link" href="${pageContext.request.contextPath }/login?lang=by" style="display: inline-block">BY</a>--%>
<%--                </li>--%>

                <li class="nav-item me-3 me-lg-0">
                    <a class="nav-link" href="#"><i class="fa-solid fa-user"></i></a>
                </li>

                <li class="nav-item me-3 me-lg-0">
                    <a class="nav-link" href="#"><i class="fas fa-shopping-cart"></i></a>
                </li>

            </ul>

        </div>
        </div>
        <!-- Container wrapper -->
    </nav>
</header>
<!-- Navbar -->


<div class="myform">
    <div class="wrapper">
        <div class="inner">
            <div class="image-holder">
                <img src="/resources/form/images/IMG_5758.JPG" alt="">
            </div>
            <form action="">
                <h3><spring:message code="form.login"/></h3>
                <div class="form-wrapper">
                    <input type="text" placeholder="<spring:message code="form.email"/>" class="form-control" name="email" style="box-shadow: none; border-color: #1a1e21;">
                    <i class="zmdi zmdi-email"></i>
                </div>
                <div class="form-wrapper">
                    <input type="password" placeholder="<spring:message code="form.password"/>" class="form-control" name="password" style="box-shadow: none; border-color: #1a1e21">
                    <i class="zmdi zmdi-lock"></i>
                </div>

                <div>
                    <a href="#" class="txt3">
                        <spring:message code="form.password.forgot"/>?
                    </a>
                </div>

                <br/>
                <div>
                    <button><spring:message code="form.login"/>
                        <i class="zmdi zmdi-arrow-right"></i>
                    </button>
                </div>
                <br/>
                <div><p><spring:message code="form.no.account"/>? <a href="/signup" class="signup"><spring:message code="form.signup"/></a></p></div>
            </form>
        </div>
    </div>
</div>


</body>
</html>
