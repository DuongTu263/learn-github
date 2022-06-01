<%-- 
    Document   : viewService
    Created on : May 23, 2022, 2:50:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <!-- Bootstrap Icon -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">

        <link rel="stylesheet" href="./assets/service/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="modal-dialog modal-lg" id="editServiceModal">
            <div class="modal-content">
                <div class="modal-header">
                    <div class="non-block"></div>
                    <h5 class="modal-title" id="staticBackdropLabel">Xem chi tiết dịch vụ</h5>

                    <a href="../ClinicManagement/ServiceManagementController?page=${page}">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">
                        </button>
                    </a>
                </div>
                <div class="modal-body">
                    <div class="container-fluid">
                        <form class="row g-3" >
                            <div class="pe-5 col-6">
                                <div class="row mb-3">
                                    <label for="serviceCode" class="col-4 col-form-label">Mã dịch vụ</label>
                                    <div class="col-8">
                                        <input type="text" class="form-control" name="service_code" readonly
                                               id="serviceCode" value="${service.serviceId}" required maxlength="50">
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="serviceName" class="col-4 col-form-label">Tên dịch vụ</label>
                                    <div class="col-8">
                                        <input type="text" class="form-control" name="service_name"  required maxlength="50" readonly
                                               id="serviceName" value="${service.serviceName}">
                                    </div>
                                </div>
                                <div class="row">
                                    <label for="serviceDesc" class="col-4 col-form-label">Mô tả</label>
                                    <div class="col-8">
                                        <textarea class="form-control" name="service_desc" id="serviceDesc"  required maxlength="50" readonly
                                                  rows="3">${service.serviceDescription}</textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="ps-5 col-6">
                                <div class="row">
                                    <div class="col-7 col-form-label">
                                        Bác sĩ
                                    </div>
                                </div>
                                <div class="row list-doctors">
                                    <div class="list-doctors-scroll">
                                    </div>
                                </div>
                            </div>
                            <div class="col-auto mx-auto text-center">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Select Doctor Modal -->
        <div class="modal fade" id="selectDoctorModal" data-bs-keyboard="false" tabindex="-1"
             aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-doctor">
                <div class="modal-content">
                    <div class="modal-header">
                        <div class="non-block"></div>
                        <h5 class="modal-title" id="staticBackdropLabel">Chọn bác sĩ</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="list-doctors">
                            <div class="list-doctors-scroll">
                            </div>
                        </div>
                        <div class="col-auto mx-auto text-center">
                            <button id="addDoc" type="button" class="btn btn-primary">Thêm</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Delete Doctor Modal -->
        <div class="modal fade" id="deleteDoctorModal" data-bs-keyboard="false" tabindex="-1"
             aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered modal-delete">
                <div class="modal-content">
                    <div class="modal-header justify-content-center">
                        <h5 class="modal-title" id="staticBackdropLabel">Thông báo</h5>
                    </div>
                    <div class="modal-body text-center">
                        Bạn có muốn xóa "<span class="doctor-name"></span>" không?
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-light" data-bs-dismiss="modal">
                            Không</button>
                        <button class="btn btn-primary btn-confirm" data-bs-dismiss="modal">
                            Có</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap Bundle -->
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.0/jquery.min.js" integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=" crossorigin="anonymous"></script>

        <script>
                                        $(document).ready(function(){
                                        let doctors = [];
            <c:forEach items="${doctors}" var="doctor"  varStatus="counter" >
                                        doctors.push({
                                        name: '${doctor.name}',
                                                username: '${doctor.id}',
                                                image: '${doctor.image}'
                                        });
            </c:forEach>
   
    </body>
</html>
