<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="./assets/css/style.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <style>
        .h-custom{
            height:  960px;
        }
    </style>
    <body>
        <section class=" h-custom" style="background-color: #8fc4b7;">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-8 col-xl-6">
                        <div class="card rounded-3">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Quên mật khẩu</h3>

                                <form class="px-md-2" action="" method="get">

                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="form3Example1q">Email<span class="text-danger"> *</span></label>

                                        <input type="text" id="form3Example1q" class="form-control"  maxlength="30" required />
                                    </div>
                                   
                                    

                                    <button type="submit" class="btn btn-success btn-lg mb-1">Đổi mật khẩu</button>
                                </form>
                                <div style="color: red"> ${message}</div>
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
