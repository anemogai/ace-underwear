<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>RegistrationForm_v1 by Colorlib</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- MATERIAL DESIGN ICONIC FONT -->
    <link rel="stylesheet" href="/resources/form/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

    <!-- STYLE CSS -->
    <link rel="stylesheet" href="/resources/form/css/style.css">

    <script src="https://kit.fontawesome.com/33fd3056a5.js" crossorigin="anonymous"></script>

    <%--CSS--%>
    <link href="<c:url value="/resources/bootstrap5/css/bootstrap.min.css" />" rel="stylesheet">

    <%--JS--%>
    <script src="<c:url value="/resources/bootstrap5/js/bootstrap.min.js" />"></script>
</head>

<body>

<header>
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
</header>
<!-- Navbar -->
<div class="wrapper">
    <div class="inner">
        <div class="image-holder">
            <img src="/resources/form/images/IMG_5745.JPG" alt="">
        </div>
        <form action="">
            <h3>Sign up</h3>
            <div class="form-wrapper">
                <input type="text" placeholder="Username" class="form-control" name="name">
                <i class="zmdi zmdi-account"></i>
            </div>
            <div class="form-wrapper">
                <input type="text" placeholder="Phone number" class="form-control" name="number">
            </div>
            <div class="form-wrapper">
                <input type="text" placeholder="Email Address" class="form-control" name="email">
                <i class="zmdi zmdi-email"></i>
            </div>
            <div class="form-wrapper">
                <select name="" id="" class="form-control">
                    <option value="" disabled selected>Gender</option>
                    <option value="male" name="male">Male</option>
                    <option value="female" name="female">Female</option>
                    <option value="other" name="other">Other</option>
                </select>
                <i class="zmdi zmdi-caret-down" style="font-size: 17px"></i>
            </div>
            <div class="form-wrapper">
                <input type="password" placeholder="Password" class="form-control">
                <i class="zmdi zmdi-lock"></i>
            </div>
            <div class="form-wrapper">
                <input type="password" placeholder="Confirm Password" class="form-control">
                <i class="zmdi zmdi-lock"></i>
            </div>

            <div class="flex-sb-m w-full p-b-48">
                <div class="contact100-form-checkbox">
                    <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
                    <label class="label-checkbox100" for="ckb1">
                        Remember me
                    </label>
                </div>
            </div>
            <br/>

            <div>
                <button>Sign up
                    <i class="zmdi zmdi-arrow-right"></i>
                </button>
            </div>
            <br/>
            <div><p>Already have an account? <a href="#" class="signin">Log in</a></p></div>

        </form>
    </div>
</div>

</body>
</html>
