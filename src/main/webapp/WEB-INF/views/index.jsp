<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Ace underwear</title>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://kit.fontawesome.com/33fd3056a5.js" crossorigin="anonymous"></script>

        <%--CSS--%>
        <link href="<c:url value="/resources/bootstrap5/css/bootstrap.min.css" />" rel="stylesheet">

        <%--JS--%>
        <script src="<c:url value="/resources/bootstrap5/js/bootstrap.min.js" />"></script>
</head>

<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg bg-light navbar-light ">
    <!-- Container wrapper -->
    <div class="container-fluid">

            <!-- Home -->
            <ul class="navbar-nav d-flex flex-row me-1">

            </ul>

            <ul class="navbar-nav d-flex flex-row me-1">

                <li class="nav-item me-3 me-lg-0">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>

                <li class="nav-item me-3 me-lg-0">
                    <a class="nav-link active" aria-current="page" href="#">Contacts</a>
                </li>

                <li class="nav-item me-3 me-lg-0">
                <select class="form-select" aria-label="Default select example">
                        <option selected>lang</option>
                        <option value="1">english</option>
                        <option value="2">russian</option>
                    </select>
                </li>

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


</body>
</html>
