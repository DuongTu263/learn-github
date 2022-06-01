<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%
            User user = (User) request.getSession().getAttribute("user");
            if (user != null) {
                String username = user.getUsername();
                String ava = user.getAvatarImage();
                String email = user.getAvatarImage();
            }
        %>
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
                        <a class="nav-link py-3" href="#">Quản lý tài khoản<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
            <div class="dropdown ml-auto">
                <a class="avatar avatar-md p-0 show" href="">
                    <img height="45" class="avatar-img rounded-circle" src="./assets/images/${user.avatarImage}" alt="avatar">
                </a>
            </div>
            <!--End header-->
        </header>
    </body>
</html>
