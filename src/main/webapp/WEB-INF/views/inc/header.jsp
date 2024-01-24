 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>SIMPLE</title>

    <!--구글웹 font -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Calistoga&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Gowun+Batang&family=Nanum+Gothic+Coding&display=swap"
        rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
    		rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        button#dropdownMenuButton2 {
            margin-right: 33px;
        }

        .dropdown:hover>.dropdown-menu {
            display: block;
        }

        .dropdown>.dropdown-toggle:active {
            pointer-events: none;
        }

        img#logoSimple {
            width: 190px;
        }

        .logosimple {
            margin-left: 100px;
        }

        .links {
            padding: 0;
            margin: 0;
        }

        .navbar {
            height: 100px;
            color: #fff;
            padding: 15px;
            width: 100%;
            background-color: white;
            display: flex;
            align-items: center;
            box-shadow: 1px 3px 5px rgba(0, 0, 0, 0.07);
        }

        .navbar .logosimple {
            cursor: pointer;
        }

        .navbar ul.links {
            margin-left: auto;
            margin-right: 140px;
            list-style: none;
            display: flex;
            align-items: center;
            transition: 0.4s ease all, 0s ease background;
        }

        .mini {
            margin-right: 55px;
            text-transform: uppercase;
            padding: 0 18px;
            display: flex;
            justify-content: center;
            align-items: center;
            transition: 0.4s ease all, 0s ease margin;
        }

        .cols-course,
        .cols-place,
        .cols-review {
            text-decoration: none;
            font-weight: 250;
            font-family: 'Gowun Batang', serif;
            color: #000;
            transition: color 0.2s ease;
        }

        .cols-course:hover,
        .cols-place:hover,
        .cols-review:hover {
            color: #4a8f4c;
        }

        .info-menu,
        .place-menu {
            display: none;
            position: relative;
            position: absolute;
            background-color: #ffffff;
            min-width: 100px;

            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            z-index: 1;

        }

        .place-menu {
            width: 140px;
            top: 100px;
            height: 100px;
        }

        .info-menu {
            width: 100px;
            top: 100px;
            right: 80px;
            height: 200px;
            margin: auto;
        }

        .mini:hover .place-menu,
        .info-icon:hover .info-menu {
            display: block;
        }

        #info-icon {
            width: 30px;
            height: 30px;
        }

        body {
            margin: 0;
            font-family: '맑은고딕', sans-serif;

        }

        footer {
            border-top: 1px solid #e4e4e4;
            background-color: #dee0dd;
            padding: 32px;
            height: 100px;
            bottom: 0;
            left: 0;
            width: 100%;
            font-size: 12px;
            color: #495151;
        }

        .footer-message {
            font-weight: bold;
            margin: 0 0 0 10px;
            margin-left: 30px;
        }

        .footer-contact {
            margin: 10px;
            margin-left: 30px;
        }

        .footer-copyright {

            text-align: center;
        }
    </style>
</head>

<body>
    <div id="hdtop">
        <div class="navbar">
            <div class="logosimple">
                <a><img src="${pageContext.request.contextPath }/resources/images/logo.png" alt="심플로고" id="logoSimple"></a>
            </div>
            <ul class="links">
                <li class="mini">
                    <a class="cols-course" href="#">데이트 코스</a>
                </li>
                <div class="dropdown">
                    <button class="btn btn-white dropdown-toggle" type="button" id="dropdownMenuButton2"
                        data-mdb-toggle="dropdown" aria-expanded="false">
                        <a class="cols-place" href="#">데이트 장소</a>
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <li><a class="dropdown-item" href="#">데이트장소 추가</a></li>
                        <li><a class="dropdown-item" href="#">가맹점 문의</a></li>
                    </ul>
                </div>
                <li class="mini">
                    <a class="cols-review" href="#">코스후기</a>
                </li>


                <div class="dropdown">
                    <button class="btn btn-white dropdown-toggle" type="button" id="dropdownMenuButton"
                        data-mdb-toggle="dropdown" aria-expanded="false">
                        <a href="#"><img src="${pageContext.request.contextPath }/resources/images/mypage.png" alt="정보서랍" id="info-icon"></a>
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <li><a class="dropdown-item" href="#">로그인</a></li>
                        <li><a class="dropdown-item" href="#">회원가입</a></li>
                        <li><a class="dropdown-item" href="#">나의 게시글 조회</a></li>
                        <li><a class="dropdown-item" href="#">나의 정보 조회</a></li>
                    </ul>
                </div>

            </ul>
        </div>
    </div>