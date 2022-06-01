<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<style>
    .dropdown-menu{
        left: -180px !important;
    }
</style>
<html>
    <body class="m-0 p-0">
        <!--Start header-->
        <header class="navbar navbar-expand-lg navbar-light navbar-floating navbar-sticky ">
            <div class="p-2">
                <a href="./HomeController">
                    <img src="./assets/images/logo.png" alt="" width="30" height="30">
                </a>
            </div>
            <div>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link py-3" href="./ServiceController">Dịch vụ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link py-3" href="./ViewFeedBackListController">Phản hồi</a>
                    </li>
                </ul>
            </div>
            <div class="dropdown ml-auto">
                <a class="avatar avatar-md p-0" href="#" id="profileDropdown" role="button" data-bs-auto-close="outside" data-bs-display="static" data-bs-toggle="dropdown" aria-expanded="true">
                    <%
                        User user = (User) request.getSession().getAttribute("user");
                    %>
                    <img height="45" class="avatar-img rounded-circle" src="./assets/images/${user.avatarImage}" alt="avatar">
                </a>
                <ul class="dropdown-menu dropdown-animation shadow pt-3 dropdown-menu-right" aria-labelledby="profileDropdown" data-bs-popper="none" style="">
                    <!-- Profile info -->
                    <li class="px-3">
                        <div class="d-flex align-items-center">
                            <!-- Avatar -->
                            <div class="avatar me-3">
                                <img height="40" class="avatar-img rounded-circle shadow" href="./jsp/user_profile.jsp" src="./assets/images/${user.avatarImage}" alt="avatar">
                            </div>
                            <div>
                                <a class="h6" href="./jsp/user_profile.jsp">${user.fullName}</a>
                                <p class="small m-0">${user.email}</p>
                            </div>
                        </div>
                        <hr>
                    </li>
                    <!-- Links -->
                    <li><a class="dropdown-item" href="./jsp/user_profile.jsp"><i class="bi bi-person fa-fw me-2"></i>Xem thông tin cá nhân</a></li>
                        <c:if test = "${role == 1}">
                        <li><a class="dropdown-item bg-danger-soft-hover" href="./ViewCustomerReservationsList"><i class="bi bi-power fa-fw me-2"></i>Xem danh sách đặt chỗ</a></li>
                        </c:if>
                    <li><a class="dropdown-item" href="./jsp/changePass.jsp"><i class="bi bi-person fa-fw me-2"></i>Đổi mật khẩu</a></li>
                    <li><a class="dropdown-item bg-danger-soft-hover" href="./LogoutController"><i class="bi bi-power fa-fw me-2"></i>Đăng xuất</a></li>
                    <li> <hr class="dropdown-divider"></li>
                    <!-- Dark mode switch END -->
                </ul>
            </div>
            <!--End header-->
        </header>
    </body>
</html>