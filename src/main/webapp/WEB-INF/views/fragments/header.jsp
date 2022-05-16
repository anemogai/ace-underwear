<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <%--   CSS   --%>

    <%--bootstrap--%>
    <link href="<c:url value="/bootstrap5/css/bootstrap.min.css" />" rel="stylesheet">

    <link href="<c:url value="/form/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/form/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css" />"
          rel="stylesheet">


    <%--   JS   --%>

    <%--bootstrap--%>
    <script src="<c:url value="/bootstrap5/js/bootstrap.min.js" />"></script>

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

</body>
</html>
