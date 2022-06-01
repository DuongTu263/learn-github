<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <!--Start header-->
        <header class="navbar navbar-expand-lg navbar-light navbar-floating navbar-sticky">
            <div class="p-2">
                <a href="#">
                    <img src="./assets/images/logo.png" alt="" width="30" height="30">
                </a>
            </div>
            <div>
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link py-3" href="/viewAllReservation">Xem tất danh sách đặt chỗ<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link py-3" href="#">Xác nhận lịch đặt chỗ</a>
                    </li>
                    <li class=nav-item">
                        <a class="nav-link py-3" href="#">Quản lý dịch vụ</a>
                    </li>
                    <li class=nav-item">
                        <a class="nav-link py-3" href="#">Quản lý Phản hồi</a>
                    </li>
                    <li class=nav-item">
                        <a class="nav-link py-3" href="#">Duyệt lịch đặt chỗ</a>
                    </li>
                </ul>
            </div>
            <!--End header-->
        </header>
    </body>
</html>