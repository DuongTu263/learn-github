<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="./assets/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.2/css/all.css" />
        <link href="./assets/themes/krajee-fas/theme.css" media="all" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="./assets/css/select2.min.css" />
        <link rel="stylesheet" href="./assets/css/select2-bootstrap-5-theme.min.css" />
        <link rel="stylesheet" href="./assets/css/custom.css" />
        <link href="../assets/css/header.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <!-- Bootstrap Icon -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <link rel="stylesheet" href="./assets/service/style.css">
    </head>

    <header>
        <jsp:include page="./components/managerHeader.jsp" />
    </header>

    <body>
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <div class="non-block"></div>
                    <h5 class="modal-title" id="staticBackdropLabel">Chi tiết dịch vụ</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="container-fluid">
                        <form class="row g-3">
                            <div class="pe-5 col-6">
                                <div class="row mb-3">
                                    <label for="serviceCode" class="col-4 col-form-label">Mã dịch vụ</label>
                                    <div class="col-8">
                                        <span class="form-control-plaintext">
                                            ${service.serviceId}
                                        </span>
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="serviceName" class="col-4 col-form-label">Tên dịch vụ</label>
                                    <div class="col-8">
                                        <span class="desc-text form-control-plaintext">
                                            ${service.serviceName}
                                        </span>
                                    </div>
                                </div>
                                <div class="row">
                                    <label for="serviceDesc" class="col-4 col-form-label">Mô tả</label>
                                    <div class="col-8">
                                        <span class="form-control-plaintext">
                                            ${service.serviceDescription}
                                        </span>
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

                                        <c:forEach var="doctor" items="${doctors}">
                                            <div class="doctor-card px-0">
                                                <div class="img-cover">
                                                    <img src="${doctor.image}" alt="">
                                                </div>
                                                <div class="d-flex flex-column my-2 mx-4">
                                                    ${doctor.name}
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="./assets/js/jquery-3.6.0.min.js" crossorigin="anonymous"></script>
        <script src="./assets/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="./assets/js/star-rating.js" type="text/javascript"></script>
        <script src="./assets/themes/krajee-fas/theme.js" type="text/javascript"></script>
        <script src="./assets/js/select2.full.min.js"></script>
        <script src="./assets/js/custom.js"></script>
    </body>
    <footer>
        <jsp:include page="./components/footer.jsp" />
    </footer>
</html>
