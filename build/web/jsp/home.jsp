<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clinic Management</title>
        <link href="./assets/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.2/css/all.css" />
        <link href="./assets/themes/krajee-fas/theme.css" media="all" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="./assets/css/select2.min.css" />
        <link rel="stylesheet" href="./assets/css/select2-bootstrap-5-theme.min.css" />
        <link rel="stylesheet" href="./assets/css/custom.css" />
        <link href="./assets/css/header.css" rel="stylesheet" type="text/css"/>
    </head>
    <style>
        .content {
            background-image: url("https://isofhcare.com/_next/static/banner.png");
            height: 482px;
            text-align: center;
            padding-top: 160px;
        }

        .content input {
            width: 700px;
            height: 50px;
            boder: 3px;
            border-color: #00ba99;
            border-style: solid;
            border-radius: 10px;
            padding: 10px;
            text-color: #00ba99;
        }

        .card {
            padding: 20px;
        }

        #images {
            border-radius: 50%;
            width: 140px;
            height: 140px;
            margin: 0 auto;
        }

        .card {
            text-align: center;
        }

        h5 {
            margin-left: 45px;
        }

        .content-page img {
            width: 100%;
            margin-top: 20px;
        }

        .content-infor {
            margin-left: 200px;
            margin-right: 200px;
        }

        .col-4 img {
            height: 400px;
        }
    </style>
    <body>
        <%@include file="components/customerHeader.jsp" %>
        <div class="container-fluid m-0 p-0">
            <div id="layoutSidenav_content">
                <div class="row-fluid mb-3">
                    <img class="col-lg-12 p-0" src="./assets/images/banner.jpg" alt="Banner" />
                </div>
                <div class="container-fluid mt-3">
                    <div>
                        <h5 >Dịch vụ của chúng tôi</h5>
                    </div>
                    <div class="d-flex justify-content-around mt-3">
                        <div class="card" style="width: 18rem;">
                            <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">Bác sĩ</h5>
                                <p class="card-text">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có
                                    trình độ
                                    chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn
                                    chủ động lựa
                                    chọn thời gian khám.</p>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/benh-vien_3af5757b_be9b_4a39_9948_6d2062b72316.png" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">Bệnh viện</h5>
                                <p class="card-text">Đặt khám theo gói dịch vụ chất lượng, dịch vụ xét
                                    nghiệm và chuẩn
                                    đoán hình ảnh hiện đại tới từ các đối tác bệnh viện hàng đầu ,tuyến
                                    Trung Ương của
                                    ISOFTCARE.</p>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/cam-nang_9ec6df99_ba08_4015_b679_2459308c5e26.png" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">Cẩm nang</h5>
                                <p class="card-text">Với lượng bài đăng phong phú, chuyên mục Cẩm nang y tế
                                    cung cấp cho
                                    bạn nhiều kiến thức bổ ích về sức khỏe, mang tính thực tiễn áp dụng vào.
                                </p>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/cong-dong_15c2ee3e_0448_4635_ac97_645a84969848.png" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">Cộng đồng</h5>
                                <p class="card-text">Cộng đồng y tế đông đảo với sự tham gia của các bác sĩ
                                    đầu ngành
                                    tới từ nhiều lĩnh vực, hỗ trợ giải đáp các thắc mắc của bạn trong mọi
                                    khía cạnh sức
                                    khỏe.</p>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png" alt="Card image cap">
                            <div class="card-body">
                                <h5 class="card-title">Bác sĩ</h5>
                                <p class="card-text">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có
                                    trình độ
                                    chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn
                                    chủ động lựa
                                    chọn thời gian khám.</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="content-page">
                    <img
                        src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/kit-test-nhanh-covid-tai-nha-isofhcare-jpg_99fa2328_f5d7_4eb8_8561_ae5a4c49c9be.png" />
                </div>
                <div class="content-infor mt-5">
                    <div class="row container-fluid">
                        <div class="col-4">
                            <h3>Bác sĩ nổi bật</h3>
                            <br/>
                            <p>Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFHCARE có trình độ chuyên môn cao, nhiều
                                năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám</p>
                            <img
                                src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si-noi-bat_3aafb5a5_e84b_4be0_bf87_4689b981e5d7.png">
                        </div>
                        <div class="col-8 d-flex justify-content-around">
                            <div class="card" style="width: 18rem;">
                                <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png" alt="Card image cap">
                                <div class="card-body">
                                    <h5 class="card-title">Bác sĩ</h5>
                                    <p class="card-text">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có trình độ chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám.</p>
                                </div>
                            </div>
                            <div class="card" style="width: 18rem;">
                                <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png" alt="Card image cap">
                                <div class="card-body">
                                    <h5 class="card-title">Bác sĩ</h5>
                                    <p class="card-text">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có trình độ chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám.</p>
                                </div>
                            </div>
                            <div class="card" style="width: 18rem;">
                                <img id="images" class="card-img-top" src="https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png" alt="Card image cap">
                                <div class="card-body">
                                    <h5 class="card-title">Bác sĩ</h5>
                                    <p class="card-text">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có trình độ chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row-fluid my-5">
                        <h1>Tin Tức</h1>
                        <div class="row border-bottom my-1"></div>
                        <form action="SearchPostController" method="get">
                            <div class="row col-lg-6 mx-auto my-1">
                                <input type="text" name="search" value="${search}" class="form-control col-md-8" id="searchKeyword" maxlength="20">
                                <button type="submit" class="btn btn-primary col-md-4" >Tìm kiếm</button>
                            </div>
                        </form>
                        <div class="row d-flex justify-content-center">
                            <c:forEach items="${posts}" var="p">
                                <div class="col-md-4 my-1">
                                    <div class="card" style="width: 18rem;">
                                        <img class="card-img-top" src="./assets/images/${p.postImage}" alt="Card image cap">
                                        <div class="card-body">
                                            <h5 class="card-title">${p.title}</h5>
                                            <p class="card-text">${p.summary}</p>
                                            <a href="PostDetailController?id=${p.id}"
                                               class="btn btn-primary">View Post Detail</a>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="./components/footer.jsp" />
        <script src="./assets/js/jquery-3.6.0.min.js" crossorigin="anonymous"></script>
        <script src="./assets/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="./assets/js/star-rating.js" type="text/javascript"></script>
        <script src="./assets/themes/krajee-fas/theme.js" type="text/javascript"></script>
        <script src="./assets/js/select2.full.min.js"></script>
        <script src="./assets/js/custom.js"></script>
    </body>
</html>