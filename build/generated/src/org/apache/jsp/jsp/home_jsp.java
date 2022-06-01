package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.User;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/components/customerHeader.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Clinic Management</title>\n");
      out.write("        <link href=\"./assets/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.15.2/css/all.css\" />\n");
      out.write("        <link href=\"./assets/themes/krajee-fas/theme.css\" media=\"all\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/select2.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/select2-bootstrap-5-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/custom.css\" />\n");
      out.write("        <link href=\"./assets/css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .content {\n");
      out.write("            background-image: url(\"https://isofhcare.com/_next/static/banner.png\");\n");
      out.write("            height: 482px;\n");
      out.write("            text-align: center;\n");
      out.write("            padding-top: 160px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content input {\n");
      out.write("            width: 700px;\n");
      out.write("            height: 50px;\n");
      out.write("            boder: 3px;\n");
      out.write("            border-color: #00ba99;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-color: #00ba99;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #images {\n");
      out.write("            border-radius: 50%;\n");
      out.write("            width: 140px;\n");
      out.write("            height: 140px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h5 {\n");
      out.write("            margin-left: 45px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content-page img {\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content-infor {\n");
      out.write("            margin-left: 200px;\n");
      out.write("            margin-right: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .col-4 img {\n");
      out.write("            height: 400px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<style>\n");
      out.write("    .dropdown-menu{\n");
      out.write("        left: -180px !important;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<html>\n");
      out.write("    <body class=\"m-0 p-0\">\n");
      out.write("        <!--Start header-->\n");
      out.write("        <header class=\"navbar navbar-expand-lg navbar-light navbar-floating navbar-sticky \">\n");
      out.write("            <div class=\"p-2\">\n");
      out.write("                <a href=\"./HomeController\">\n");
      out.write("                    <img src=\"./assets/images/logo.png\" alt=\"\" width=\"30\" height=\"30\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link py-3\" href=\"./ServiceController\">Dịch vụ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link py-3\" href=\"./ViewFeedBackListController\">Phản hồi</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dropdown ml-auto\">\n");
      out.write("                <a class=\"avatar avatar-md p-0\" href=\"#\" id=\"profileDropdown\" role=\"button\" data-bs-auto-close=\"outside\" data-bs-display=\"static\" data-bs-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                    ");

                        User user = (User) request.getSession().getAttribute("user");
                    
      out.write("\n");
      out.write("                    <img height=\"45\" class=\"avatar-img rounded-circle\" src=\"./assets/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatarImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"avatar\">\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"dropdown-menu dropdown-animation shadow pt-3 dropdown-menu-right\" aria-labelledby=\"profileDropdown\" data-bs-popper=\"none\" style=\"\">\n");
      out.write("                    <!-- Profile info -->\n");
      out.write("                    <li class=\"px-3\">\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <!-- Avatar -->\n");
      out.write("                            <div class=\"avatar me-3\">\n");
      out.write("                                <img height=\"40\" class=\"avatar-img rounded-circle shadow\" href=\"./jsp/user_profile.jsp\" src=\"./assets/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatarImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"avatar\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <a class=\"h6\" href=\"./jsp/user_profile.jsp\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                <p class=\"small m-0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Links -->\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"./jsp/user_profile.jsp\"><i class=\"bi bi-person fa-fw me-2\"></i>Xem thông tin cá nhân</a></li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"./jsp/changePass.jsp\"><i class=\"bi bi-person fa-fw me-2\"></i>Đổi mật khẩu</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item bg-danger-soft-hover\" href=\"./LogoutController\"><i class=\"bi bi-power fa-fw me-2\"></i>Đăng xuất</a></li>\n");
      out.write("                    <li> <hr class=\"dropdown-divider\"></li>\n");
      out.write("                    <!-- Dark mode switch END -->\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--End header-->\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div class=\"container-fluid m-0 p-0\">\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <div class=\"row-fluid mb-3\">\n");
      out.write("                    <img class=\"col-lg-12 p-0\" src=\"./assets/images/banner.jpg\" alt=\"Banner\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container-fluid mt-3\">\n");
      out.write("                    <div>\n");
      out.write("                        <h5 >Dịch vụ của chúng tôi</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex justify-content-around mt-3\">\n");
      out.write("                        <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                            <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Bác sĩ</h5>\n");
      out.write("                                <p class=\"card-text\">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có\n");
      out.write("                                    trình độ\n");
      out.write("                                    chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn\n");
      out.write("                                    chủ động lựa\n");
      out.write("                                    chọn thời gian khám.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                            <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/benh-vien_3af5757b_be9b_4a39_9948_6d2062b72316.png\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Bệnh viện</h5>\n");
      out.write("                                <p class=\"card-text\">Đặt khám theo gói dịch vụ chất lượng, dịch vụ xét\n");
      out.write("                                    nghiệm và chuẩn\n");
      out.write("                                    đoán hình ảnh hiện đại tới từ các đối tác bệnh viện hàng đầu ,tuyến\n");
      out.write("                                    Trung Ương của\n");
      out.write("                                    ISOFTCARE.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                            <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/cam-nang_9ec6df99_ba08_4015_b679_2459308c5e26.png\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Cẩm nang</h5>\n");
      out.write("                                <p class=\"card-text\">Với lượng bài đăng phong phú, chuyên mục Cẩm nang y tế\n");
      out.write("                                    cung cấp cho\n");
      out.write("                                    bạn nhiều kiến thức bổ ích về sức khỏe, mang tính thực tiễn áp dụng vào.\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                            <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/cong-dong_15c2ee3e_0448_4635_ac97_645a84969848.png\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Cộng đồng</h5>\n");
      out.write("                                <p class=\"card-text\">Cộng đồng y tế đông đảo với sự tham gia của các bác sĩ\n");
      out.write("                                    đầu ngành\n");
      out.write("                                    tới từ nhiều lĩnh vực, hỗ trợ giải đáp các thắc mắc của bạn trong mọi\n");
      out.write("                                    khía cạnh sức\n");
      out.write("                                    khỏe.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                            <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png\" alt=\"Card image cap\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Bác sĩ</h5>\n");
      out.write("                                <p class=\"card-text\">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có\n");
      out.write("                                    trình độ\n");
      out.write("                                    chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn\n");
      out.write("                                    chủ động lựa\n");
      out.write("                                    chọn thời gian khám.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-page\">\n");
      out.write("                    <img\n");
      out.write("                        src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/kit-test-nhanh-covid-tai-nha-isofhcare-jpg_99fa2328_f5d7_4eb8_8561_ae5a4c49c9be.png\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-infor mt-5\">\n");
      out.write("                    <div class=\"row container-fluid\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <h3>Bác sĩ nổi bật</h3>\n");
      out.write("                            <br/>\n");
      out.write("                            <p>Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFHCARE có trình độ chuyên môn cao, nhiều\n");
      out.write("                                năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám</p>\n");
      out.write("                            <img\n");
      out.write("                                src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si-noi-bat_3aafb5a5_e84b_4be0_bf87_4689b981e5d7.png\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 d-flex justify-content-around\">\n");
      out.write("                            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                                <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png\" alt=\"Card image cap\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\">Bác sĩ</h5>\n");
      out.write("                                    <p class=\"card-text\">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có trình độ chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                                <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png\" alt=\"Card image cap\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\">Bác sĩ</h5>\n");
      out.write("                                    <p class=\"card-text\">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có trình độ chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                                <img id=\"images\" class=\"card-img-top\" src=\"https://isofhcare-backup.s3-ap-southeast-1.amazonaws.com/images/bac-si_02156a3d_6d43_476f_8d12_7d10e6d3795e.png\" alt=\"Card image cap\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\">Bác sĩ</h5>\n");
      out.write("                                    <p class=\"card-text\">Đặt khám trực tiếp tới đội ngũ bác sĩ của ISOFTCARE có trình độ chuyên môn cao, nhiều năm kinh nghiệm, giàu y đức, giúp bạn hoàn toàn chủ động lựa chọn thời gian khám.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row-fluid my-5\">\n");
      out.write("                        <h1>Tin Tức</h1>\n");
      out.write("                        <div class=\"row border-bottom my-1\"></div>\n");
      out.write("                        <form action=\"SearchPostController\" method=\"get\">\n");
      out.write("                            <div class=\"row col-lg-6 mx-auto my-1\">\n");
      out.write("                                <input type=\"text\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control col-md-8\" id=\"searchKeyword\" maxlength=\"20\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary col-md-4\" >Tìm kiếm</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"row d-flex justify-content-center\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./components/footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"./assets/js/jquery-3.6.0.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"./assets/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"./assets/js/star-rating.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./assets/themes/krajee-fas/theme.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"./assets/js/select2.full.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li><a class=\"dropdown-item bg-danger-soft-hover\" href=\"./ViewCustomerReservationsList\"><i class=\"bi bi-power fa-fw me-2\"></i>Xem danh sách đặt chỗ</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${posts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-md-4 my-1\">\n");
          out.write("                                    <div class=\"card\" style=\"width: 18rem;\">\n");
          out.write("                                        <img class=\"card-img-top\" src=\"./assets/images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.postImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\">\n");
          out.write("                                        <div class=\"card-body\">\n");
          out.write("                                            <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                            <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.summary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <a href=\"PostDetailController?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                               class=\"btn btn-primary\">View Post Detail</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
