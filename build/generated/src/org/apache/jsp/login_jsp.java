package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!--=============================================== \n");
      out.write("    Template Design By WpFreeware Team.\n");
      out.write("    Author URI : http://www.wpfreeware.com/\n");
      out.write("    ====================================================-->\n");
      out.write("    <!-- Basic Page Needs\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("     <title>Login to Rig The Market</title>\n");
      out.write("\n");
      out.write("    <!-- Mobile Specific Metas\n");
      out.write("    ================================================== -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/icon\" href=\"img/wpf-favicon.png\"/>\n");
      out.write("\n");
      out.write("    <!-- CSS\n");
      out.write("    ================================================== -->       \n");
      out.write("    <!-- Bootstrap css file-->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font awesome css file-->\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Superslide css file-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/superslides.css\">\n");
      out.write("    <!-- Slick slider css file -->\n");
      out.write("    <link href=\"css/slick.css\" rel=\"stylesheet\"> \n");
      out.write("    <!-- Circle counter cdn css file -->\n");
      out.write("    <link rel='stylesheet prefetch' href='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/css/jquery.circliful.css'>  \n");
      out.write("    <!-- smooth animate css file -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\"> \n");
      out.write("    <!-- preloader -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/queryLoader.css\" type=\"text/css\" />\n");
      out.write("    <!-- gallery slider css -->\n");
      out.write("    <link type=\"text/css\" media=\"all\" rel=\"stylesheet\" href=\"css/jquery.tosrus.all.css\" />    \n");
      out.write("    <!-- Default Theme css file -->\n");
      out.write("    <link id=\"switcher\" href=\"css/themes/default-theme.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Main structure css file -->\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("    <!-- Google fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Merriweather' rel='stylesheet' type='text/css'>   \n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Varela' rel='stylesheet' type='text/css'>    \n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body> \n");
      out.write("\n");
      out.write("    <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"></a>\n");
      out.write("    <!-- END SCROLL TOP BUTTON -->\n");
      out.write("\n");
      out.write("    <!--=========== BEGIN HEADER SECTION ================-->\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <!-- BEGIN MENU -->\n");
      out.write("      <div class=\"menu_area\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <!-- LOGO -->\n");
      out.write("              <!-- TEXT BASED LOGO -->\n");
      out.write("              <a class=\"navbar-brand\" href=\"index.jsp\">Rig <span> The Market </span></a>            \n");
      out.write("              <!-- IMG BASED LOGO  -->\n");
      out.write("               <!-- <a class=\"navbar-brand\" href=\"index.html\"><img src=\"img/logo.png\" alt=\"logo\"></a>  -->          \n");
      out.write("                     \n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right main-nav\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"login.jsp\">Login!</a></li>\n");
      out.write("                <li><a href=\"howtoplay.jsp\">How to play?</a></li>             \n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("              </ul>           \n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("          </div>     \n");
      out.write("        </nav>  \n");
      out.write("      </div>\n");
      out.write("      <!-- END MENU -->    \n");
      out.write("    </header>\n");
      out.write("    <!--=========== END HEADER SECTION ================--> \n");
      out.write("\n");
      out.write("    <!--=========== BEGIN COURSE BANNER SECTION ================-->\n");
      out.write("    <section id=\"imgBanner\">\n");
      out.write("        <h2>Login to Rig The <span style=\"color:black\"> Market</span></h2>\n");
      out.write("    </section>\n");
      out.write("    <!--=========== END COURSE BANNER SECTION ================-->\n");
      out.write("    \n");
      out.write("    <div class=\"login\">\n");
      out.write("           <div align=\"center\">\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("      <h1>Login to Rig The Market</h1>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <form method=\"post\" action=\"loginserv\">\n");
      out.write("          \n");
      out.write("          <p>UserID :<font color=\"black\"><input type=\"text\" name=\"login\" value=\"\" style=\"resize: horizontal;width:  200px\"placeholder=\"Username or Email\"></font></p>\n");
      out.write("          <p>Password :<font color=\"black\"><input type=\"password\" name=\"password\" value=\"\" style=\"resize: horizontal;width:  200px\"placeholder=\"Password\"></font></p>\n");
      out.write("          <h4><font color=\"black\" face=\"Times New Roman\">");

    if(null!=request.getAttribute("errorMessage"))
    {
        out.println(request.getAttribute("errorMessage"));
    }
 
      out.write("</font></h4>\n");
      out.write("        <p class=\"remember_me\">\n");
      out.write("          <label>\n");
      out.write("              \n");
      out.write("            <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\">\n");
      out.write("            \n");
      out.write("            Remember me on this computer\n");
      out.write("            \n");
      out.write("          </label>\n");
      out.write("        </p>\n");
      out.write("        <p class=\"submit\"><font color=\"black\"><input type=\"submit\" name=\"commit\" value=\"Login\"></font></p>\n");
      out.write("      </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <p>Forgot your password? <a href=\"reset.jsp\">Click here to reset it.</a></p>\n");
      out.write("        <p>New to Rig The Market? <a href =\"signup.jsp\"> Signup now </a> </p>\n");
      out.write("               <br>\n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("    \n");
      out.write("    <!--=========== BEGIN COURSE BANNER SECTION ================-->\n");
      out.write("    <section id=\"courseArchive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <!-- start course content -->\n");
      out.write("          <div class=\"col-lg-8 col-md-8 col-sm-8\">\n");
      out.write("            <div class=\"courseArchive_content\">\n");
      out.write("              <!-- start blog archive  -->\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <!-- start single blog -->\n");
      out.write("                <div class=\"col-lg-12 col-12 col-sm-12\">\n");
      out.write("                  <div class=\"single_blog\">\n");
      out.write("                    <!-- start events slider -->\n");
      out.write("                    <div class=\"events_slider_area\">\n");
      out.write("                      <div class=\"events_slider\">\n");
      out.write("                        <div><img src=\"img/s1.jpg\" alt=\"img\"></div>\n");
      out.write("                        <div><img src=\"img/s2.jpg\" alt=\"img\"></div>\n");
      out.write("                        <div><img src=\"img/s3.jpg\" alt=\"img\"></div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End events slider -->\n");
      out.write("                    <h2 class=\"blog_title\"><span style=\"color: blue\">Login AND Play!</span></a></h2>\n");
      out.write("                    <p>Welcome to Rig The Market!.This game is the best platform for beginners and investors to learn fruitful trade and have real experience of live shares trading with virtual money.Virtual money is the money that would be given on the starting of game at the first sign in. Investors can trade individually and in group also. Users can also make groups to trade high shares and do group betting.</p>\n");
      out.write("                    <blockquote>\n");
      out.write("                      <span class=\"fa fa-quote-left\"></span>\n");
      out.write("                      <br/>Life is like a game of cards. The hand you are dealt is determinism; the way you play it is free will.\n");
      out.write("                      <br/>>Invest in yourself. Your career is the engine of your wealth.\n");
      out.write("                      <br/>>Every once in a while, the market does something so stupid it takes your breath away.\n");
      out.write("                      <br/>>Know what you own, and know why you own it.\n");
      out.write("                      <span class=\"fa fa-quote-right\"></span>\n");
      out.write("                    </blockquote>\n");
      out.write("                    <ul style=\"list-style-type:disc\">\n");
      out.write("                        <li><span style=\"color: blue\">PLAN FOR ENROLLMENT</span>\n");
      out.write("                            <p>This section is provided with a registration to get enrolled to the website to enjoy various features and facilities provided for the user.</p></li>\n");
      out.write("                        <li><span style=\"color: blue\">Explore Stocks</span>\n");
      out.write("                            <p>This section of rig the Market allows you to view information and statistics about each of the company stock prices.\n");
      out.write("                               Once you have entered your choice of stocks and price requirements, rig the Market will display all company stocks that meet your requirements.\n");
      out.write("                               The Comparative View helps decide which Company best meets your needs by allowing you to see a comparison of stocks.\n");
      out.write("                               The Company Facts provide statistical data, graphs of stock prices, and other useful information.\n");
      out.write("                               The Frequently Asked Questions - Company Selection section answers the most commonly asked questions about stocks.</p></li>\n");
      out.write("                        <li><span style=\"color: blue\">STOCK ONLINE</span>\n");
      out.write("                            <p>The \"Buy Stock\" and \"Sell Stock\" allows you to buy or sell the stocks online you are currently working with. \n");
      out.write("                                The Blog allows beginners to learn about the key features of the market and explore new concepts. It provides with the necessary guidelines and direction for a newly\n");
      out.write("                                registered participant of stock.\n");
      out.write("                                The online news on the right side column keeps the user updated with all the necessary economic news.</p></li>\n");
      out.write("                        <li><span style=\"color: blue\">FINANCIAL AID</span>\n");
      out.write("                            <p>The Financial Aid Overview provides financial aid information and helps the user to plan for stock costs and buy virtual packages to invest in the stocks. \n");
      out.write("                                It describes the different types of packages available to users and helps explain the entire financial aid process.\n");
      out.write("                                The Cost graph module provides an estimate of all company's stock prices and their stock rankings.\n");
      out.write("                                The Frequently Asked Questions - Financial Aid section answers the questions most commonly asked by students about financial aid.</p></li>\n");
      out.write("                        <li><span style=\"color: blue\">GROUP BID</span>\n");
      out.write("                            <p>The chatrooms allows the users to chat with the other user to seek any financial advice related to stocks. The group bid facility allows user to bid in group \n");
      out.write("                                on expensive stocks.</li>\n");
      out.write("                    </ul>\n");
      out.write("                    </div>\n");
      out.write("                  <!-- single blog nex & prev button -->\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                <!-- End single blog -->                \n");
      out.write("              </div>\n");
      out.write("              <!-- end blog archive  -->\n");
      out.write("              <!-- start related post -->\n");
      out.write("              \n");
      out.write("              <!-- start related post -->           \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- End course content -->\n");
      out.write("\n");
      out.write("          <!-- start course archive sidebar -->\n");
      out.write("          <div class=\"col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("            <div class=\"courseArchive_sidebar\">\n");
      out.write("              <!-- start single sidebar -->\n");
      out.write("              <div class=\"single_sidebar\">\n");
      out.write("               <h2>Popular Companies<span class=\"fa fa-angle-double-right\"></span></h2>\n");
      out.write("                <ul class=\"news_tab\">\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                      <div class=\"media-left\">\n");
      out.write("                        <a href=\"#\" class=\"news_img\">\n");
      out.write("                          <img alt=\"img\" src=\"img/news.jpg\" class=\"media-object\">\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                       <a href=\"#\">Dummy text of the printing and typesetting industry</a>\n");
      out.write("                       <span class=\"feed_date\">27.02.15</span>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                      <div class=\"media-left\">\n");
      out.write("                        <a href=\"#\" class=\"news_img\">\n");
      out.write("                          <img alt=\"img\" src=\"img/news.jpg\" class=\"media-object\">\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                       <a href=\"#\">Dummy text of the printing and typesetting industry</a>\n");
      out.write("                       <span class=\"feed_date\">28.02.15</span>                \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                      <div class=\"media-left\">\n");
      out.write("                        <a href=\"#\" class=\"news_img\">\n");
      out.write("                          <img alt=\"img\" src=\"img/news.jpg\" class=\"media-object\">\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                       <a href=\"#\">Dummy text of the printing and typesetting industry</a>\n");
      out.write("                       <span class=\"feed_date\">28.02.15</span>                \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>                  \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <!-- End single sidebar -->\n");
      out.write("              <div class=\"single_sidebar\">\n");
      out.write("               <h2>Top Shares   <span class=\"fa fa-angle-double-right\"></span></h2>\n");
      out.write("                <ul class=\"news_tab\">\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                      <div class=\"media-left\">\n");
      out.write("                        <a href=\"#\" class=\"news_img\">\n");
      out.write("                          <img alt=\"img\" src=\"img/news.jpg\" class=\"media-object\">\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                       <a href=\"#\">Dummy text of the printing and typesetting industry</a>\n");
      out.write("                       <span class=\"feed_date\">27.02.15</span>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                      <div class=\"media-left\">\n");
      out.write("                        <a href=\"#\" class=\"news_img\">\n");
      out.write("                          <img alt=\"img\" src=\"img/news.jpg\" class=\"media-object\">\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                       <a href=\"#\">Dummy text of the printing and typesetting industry</a>\n");
      out.write("                       <span class=\"feed_date\">28.02.15</span>                \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                      <div class=\"media-left\">\n");
      out.write("                        <a href=\"#\" class=\"news_img\">\n");
      out.write("                          <img alt=\"img\" src=\"img/news.jpg\" class=\"media-object\">\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                       <a href=\"#\">Dummy text of the printing and typesetting industry</a>\n");
      out.write("                       <span class=\"feed_date\">28.02.15</span>                \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>                  \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <!-- start single sidebar -->\n");
      out.write("              <div class=\"single_sidebar\">\n");
      out.write("                <h2>Shares Category<span class=\"fa fa-angle-double-right\"></span></h2>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\">Auto and Auto Ancillary</a></li>\n");
      out.write("                  <li><a href=\"#\">Banking and Financial Services</a></li>\n");
      out.write("                  <li><a href=\"#\">FMCG (Fast Moving Consumer Goods)</a></li>\n");
      out.write("                  <li><a href=\"#\">Information Technology</a></li>\n");
      out.write("                  <li><a href=\"#\">Pharma and Healthcare</a></li>\n");
      out.write("                  <li><a href=\"#\">Retail</a></li>\n");
      out.write("                  <li><a href=\"#\">Real Estate</a></li>\n");
      out.write("                  <li><a href=\"#\">Telecom</a></li>\n");
      out.write("                 <li><a href=\"#\">Travel and Tourism</a></li>\n");
      out.write("                 <li><a href=\"#\">Others</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <!-- End single sidebar -->\n");
      out.write("              <!-- start single sidebar -->\n");
      out.write("              <div class=\"single_sidebar\">\n");
      out.write("                <h2>Shares Tags <span class=\"fa fa-angle-double-right\"></span></h2>\n");
      out.write("                <ul class=\"tags_nav\">\n");
      out.write("                  <li><a href=\"#\"><i class=\"fa fa-tags\"></i>Financial</a></li>\n");
      out.write("                  <li><a href=\"#\"><i class=\"fa fa-tags\"></i>Commercial</a></li>\n");
      out.write("                  <li><a href=\"#\"><i class=\"fa fa-tags\"></i>Art</a></li>\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <!-- End single sidebar -->\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- start course archive sidebar -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!--=========== END COURSE BANNER SECTION ================-->\n");
      out.write("    \n");
      out.write("    <!--=========== BEGIN FOOTER SECTION ================-->\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("      <!-- Start footer top area -->\n");
      out.write("      <div class=\"footer_top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-ld-3  col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single_footer_widget\">\n");
      out.write("                <h3>About Us</h3>\n");
      out.write("                <p>This game provides the best platform for Investors and beginners where each and every trading can be done with viewing,basic understanding,reading tips etc. </p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-ld-3  col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single_footer_widget\">\n");
      out.write("                <h3>Community</h3>\n");
      out.write("                <ul class=\"footer_widget_nav\">\n");
      out.write("                  <li><a href=\"#\">Rules</a></li>\n");
      out.write("                  <li><a href=\"#\">How to play?</a></li>\n");
      out.write("                  <li><a href=\"#\">Tutorials!</a></li>\n");
      out.write("                  <li><a href=\"#\">Headlines</a></li>\n");
      out.write("                  <li><a href=\"#\">News</a></li>\n");
      out.write("                  <li><a href=\"#\">Terms and conditions</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-ld-3  col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single_footer_widget\">\n");
      out.write("                <h3>Others</h3>\n");
      out.write("                <ul class=\"footer_widget_nav\">\n");
      out.write("                  <li><a href=\"#\">NSE</a></li>\n");
      out.write("                  <li><a href=\"#\">BSE</a></li>\n");
      out.write("                  <li><a href=\"#\">Nasdaq</a></li>\n");
      out.write("                  <li><a href=\"#\">Info about share market</a></li>\n");
      out.write("                  <li><a href=\"#\">Blog</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-ld-3  col-md-3 col-sm-3\">\n");
      out.write("              <div class=\"single_footer_widget\">\n");
      out.write("                <h3>Social Links</h3>\n");
      out.write("                <ul class=\"footer_social\">\n");
      out.write("                  <li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Facebook\" class=\"soc_tooltip\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                  <li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Twitter\" class=\"soc_tooltip\"  href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                  <li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Google+\" class=\"soc_tooltip\"  href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                  <li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Linkedin\" class=\"soc_tooltip\"  href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                  <li><a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Youtube\" class=\"soc_tooltip\"  href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End footer top area -->\n");
      out.write("\n");
      out.write("      <!-- Start footer bottom area -->\n");
      out.write("      <div class=\"footer_bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-6\">\n");
      out.write("              <div class=\"footer_bootomLeft\">\n");
      out.write("                <p> &copy; Copyright <a href=\"http://SVIT.com/\"></a> All Rights Reserved</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 col-md-6 col-sm-6\">\n");
      out.write("              <div class=\"footer_bootomRight\">\n");
      out.write("                <p>Design & Developed by SVIT student </p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End footer bottom area -->\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <!--=========== END FOOTER SECTION ================--> \n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <!-- Javascript Files\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("    <!-- initialize jQuery Library -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("    <!-- Preloader js file -->\n");
      out.write("    <script src=\"js/queryloader2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- For smooth animatin  -->\n");
      out.write("    <script src=\"js/wow.min.js\"></script>  \n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- slick slider -->\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\n");
      out.write("    <!-- superslides slider -->\n");
      out.write("    <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("    <script src=\"js/jquery.animate-enhanced.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.superslides.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>   \n");
      out.write("    <!-- for circle counter -->\n");
      out.write("    <script src='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/js/jquery.circliful.min.js'></script>\n");
      out.write("    <!-- Gallery slider -->\n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\" src=\"js/jquery.tosrus.min.all.js\"></script>   \n");
      out.write("   \n");
      out.write("    <!-- Custom js-->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("    <!--=============================================== \n");
      out.write("    Template Design By WpFreeware Team.\n");
      out.write("    Author URI : http://www.wpfreeware.com/\n");
      out.write("    ====================================================-->\n");
      out.write("\n");
      out.write("  </body>\n");
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
}