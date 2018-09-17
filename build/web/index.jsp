<%@page import="java.util.ArrayList"%>
<%@page import="model.VSMShareDetail"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Controller.NewHibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!--=============================================== 
    Template Design By WpFreeware Team.
    Author URI : http://www.wpfreeware.com/
    ====================================================-->

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>Rig The Market</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="img/bullslogo.png"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <!-- Superslide css file-->
    <link rel="stylesheet" href="css/superslides.css">
    <!-- Slick slider css file -->
    <link href="css/slick.css" rel="stylesheet"> 
    <!-- Circle counter cdn css file -->
    <link rel='stylesheet prefetch' href='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/css/jquery.circliful.css'>  
    <!-- smooth animate css file -->
    <link rel="stylesheet" href="css/animate.css"> 
    <!-- preloader -->
    <link rel="stylesheet" href="css/queryLoader.css" type="text/css" />
    <!-- gallery slider css -->
    <link type="text/css" media="all" rel="stylesheet" href="css/jquery.tosrus.all.css" />    
    <!-- Default Theme css file -->
    <link id="switcher" href="css/themes/default-theme.css" rel="stylesheet">
    <!-- Main structure css file -->
    <link href="style.css" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Merriweather' rel='stylesheet' type='text/css'>   
    <link href='http://fonts.googleapis.com/css?family=Varela' rel='stylesheet' type='text/css'>    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
 
  </head>
  <body>    

    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
    <header id="header">
      <!-- BEGIN MENU -->
      <div class="menu_area">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">  <div class="container">
            <div class="navbar-header">
                     
              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <!-- LOGO -->
              <!-- TEXT BASED LOGO -->
              <a class="navbar-brand" >Rig <span> The Market </span></a>              
              <!-- IMG BASED LOGO  -->
               <!-- <a class="navbar-brand" href="index.html"><img src="img/logo.png" alt="logo"></a>  -->            
                     
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li class="active"><a href="index.jsp">Home</a></li>
                <li><a href="login.jsp">Login!</a></li>
                <li><a href="howtoplay.jsp">How to play?</a></li>             
                <li><a href="contact.jsp">Contact</a></li>
              </ul>           
            </div><!--/.nav-collapse -->
          </div>     
        </nav>  
      </div>
      <!-- END MENU -->    
    </header>
    <!--=========== END HEADER SECTION ================--> 

    <!--=========== BEGIN SLIDER SECTION ================-->
    <section id="slider">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="slider_area">
            <!-- Start super slider -->
            <div id="slides">
              <ul class="slides-container">                          
                <li>
                  <img src="img/slider/2.jpg" alt="img">
                   <div class="slider_caption">
                       <h2 style="font-family:Times New Roman;">Welcome to Rig The Market</h2>
                    <p style="font-family:Times New Roman;">A Market where Financial Intelligence Pays OFF!</p>
                    <p style="font-family:Times New Roman;">Login  -  Play  -  Make your trade  -  Be Rich</p>
                  </div>
                  </li>
                <!-- Start single slider-->
                <li>
                  <img src="img/slider/3.jpg" alt="img">
                   <div class="slider_caption">
                    <h2 style="font-family:Times New Roman;">Make Your Fruitful Trade</h2>
                    <p style="font-family:Times New Roman;">Price is what you pay. Value is what you get.</p>
                     <p style="font-family:Times New Roman;">Login  -  Play  -  Make your trade  -  Be Rich</p>
                   
                  </div>
                </li>
                <!-- Start single slider-->
                <li>
                  <img src="img/slider/4.jpg" alt="img">
                   <div class="slider_caption">
                       <h2 style="font-family:Times New Roman;">We will always help U</h2>
                    <p style="font-family:Times New Roman;"> Invest in yourself. Your career is the engine of your wealth.</p>
                    <p style="font-family:Times New Roman;">Login  -  Play  -  Make your trade  -  Be Rich</p>
                  </div>
                </li>
              </ul>
              <nav class="slides-navigation">
                <a href="#" class="next"></a>
                <a href="#" class="prev"></a>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== END SLIDER SECTION ================-->

    <!--=========== BEGIN ABOUT US SECTION ================-->
    <section id="aboutUs">
      <div class="container">
        <div class="row">
        <!-- Start about us area -->
        <div class="col-lg-6 col-md-6 col-sm-6">
          <div class="aboutus_area wow fadeInLeft">
            <h2 class="titile">About Us</h2>
            <p>Initiated in the year 2015 with a definitive vision, our parent brand "rig the Market" is a pioneer in more than one ways.The aim and vision of this concept, however,
 was set from the day one is to streamline the access to the vast, direction-less Stock market. "rig the Market" provides a completely new platform for the 
beginners to learn investment in stock market by integrating all stocks at one platform with every info about the shares including profit and loss ,Tips, Blogs. This game eliminate the biggest risk i.e. the losing of real money on trading of new or any expensive shares by providing virtual money.The users could explore various economic and financial concepts as well as check the applicability of those concepts in one click.
The "smart feature interface" allows users to follow the people for watching their activites.This game also allows to bid in groups and to play in the 
'real-feel' market with virtual money which would be provided to user on the first signin. 
"rig the Market" is free to use. </p>
          </div>
        </div>
        <div class="col-lg-6 col-md-6 col-sm-6">
          <div class="newsfeed_area wow fadeInRight">
            <ul class="nav nav-tabs feed_tabs" id="myTab2">
              <li class="active"><a href="#news" data-toggle="tab">NASDAQ Indices</a></li>
              <li><a href="#notice" data-toggle="tab">News</a></li>         
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
              <!-- Start news tab content -->
              <div class="tab-pane fade in active" id="news">
                  <%  
                        SessionFactory sf = NewHibernateUtil.getSessionFactory();
                        Session ss = sf.openSession();
                        Transaction tr = ss.beginTransaction();
                       
                  %>
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="img/s44.JPG" alt="img">
                        </a>
                      </div>
                      <div class="media-body">
                       <a>NASDAQ Bank</a>
                       <p>(^BANK):
                        <% Criteria cr = ss.createCriteria(VSMShareDetail.class);
                        ArrayList<VSMShareDetail> al = (ArrayList<VSMShareDetail>)cr.list();
                        VSMShareDetail vsm = al.get(0);
                        %>
                        <%=vsm.getPrice()%>
                      </p>
                       <div class="date">
                       <%
   Date dNow = new Date( );
   SimpleDateFormat ft = 
   new SimpleDateFormat ("dd.MM.YYYY 'at' hh:mm:ss a zzz");
   out.print( "<h5>" + ft.format(dNow) + "</h5>");
%>
                       </div>
                    </div>                    
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="img/s45_1.jpg" alt="img">
                        </a>
                      </div>
                      <div class="media-body">
                       <a>NASDAQ Industrial</a>
                       <p> (^INDS):
                        <% Criteria cr1 = ss.createCriteria(VSMShareDetail.class);
                        ArrayList<VSMShareDetail> al1 = (ArrayList<VSMShareDetail>)cr.list();
                        VSMShareDetail vsm1 = al1.get(1);
                        %>
                        <%=vsm1.getPrice()%></p>
                       <div class="date">
                       <%
   Date dNow1 = new Date( );
   SimpleDateFormat ft1 = 
   new SimpleDateFormat ("dd.MM.YYYY 'at' hh:mm:ss a zzz");
   out.print( "<h5>" + ft.format(dNow) + "</h5>");
%>
                       </div>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="img/nasdaqlogo.jpg" alt="img">
                        </a>
                      </div>
                      <div class="media-body">
                       <a>NASDAQ Insurance</a>
                       <p> (^INSR):
                       <% Criteria cr2 = ss.createCriteria(VSMShareDetail.class);
                        ArrayList<VSMShareDetail> al2 = (ArrayList<VSMShareDetail>)cr.list();
                        VSMShareDetail vsm2 = al2.get(2);
                        %>
                        <%=vsm2.getPrice()%></p>
                       <div class="date">
                       <%
   Date dNow2 = new Date( );
   SimpleDateFormat ft2 = 
   new SimpleDateFormat ("dd.MM.YYYY 'at' hh:mm:ss a zzz");
   out.print( "<h5>" + ft.format(dNow) + "</h5>");
%>
                       </div>
                      </div>
                    </div>
                  </li>
                </ul>                
                <a class="see_all" href="NasdaqIndicesServ">See All</a>
              </div>
              <!-- Start notice tab content -->  
              <div class="tab-pane fade " id="notice">
                <div class="single_notice_pane">
                  <ul class="news_tab">
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="img/news.jpg" alt="img">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Oil tumbles 4 percent; Saudi Arabia cold on output freeze</a>
                         <span class="feed_date"><%
   Date dNow4 = new Date( );
   SimpleDateFormat ft4 = 
   new SimpleDateFormat ("dd.MM.YYYY 'at' hh:mm:ss a zzz");
   out.print( "<h5>" + ft.format(dNow) + "</h5>");
%></span>
                        </div>
                      </div>                   
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="img/notice.jpg" alt="img">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">China factories scent hint of spring, Europe still chilly, U.S. improves </a>
                         <span class="feed_date"><%
   Date dNow5 = new Date( );
   SimpleDateFormat ft5 = 
   new SimpleDateFormat ("dd.MM.YYYY 'at' hh:mm:ss a zzz");
   out.print( "<h5>" + ft.format(dNow) + "</h5>");
%></span>             
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="img/notice.jpg" alt="img">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Bharat Wire Ropes shares end over 1% higher on debut</a>
                         <span class="feed_date"><%
   Date dNow6 = new Date( );
   SimpleDateFormat ft6 = 
   new SimpleDateFormat ("dd.MM.YYYY 'at' hh:mm:ss a zzz");
   out.print( "<h5>" + ft.format(dNow) + "</h5>");
%></span>             
                        </div>
                      </div>
                    </li>                                    
                  </ul>
                  <ul class="news_tab">
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="img/notice.jpg" alt="img">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Contrary to popular belief, Lorem Ipsum is not simply random text</a>
                         <span class="feed_date">27.02.15</span>
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="img/notice.jpg" alt="img">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Dummy text of the printing and typesetting industry</a>
                         <span class="feed_date">28.02.15</span>          
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="img/notice.jpg" alt="img">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Contrary to popular belief, Lorem Ipsum is not simply random text</a>
                         <span class="feed_date">28.02.15</span>
                        </div>
                      </div>
                    </li>                                    
                  </ul>
                </div>               
              </div>
              <!-- Start events tab content -->
              <div class="tab-pane fade " id="events">
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="img/news.jpg" alt="img">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">27.02.15</span>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="img/news.jpg" alt="img">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="img/news.jpg" alt="img">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>                  
                </ul>
                  <form>
                <a class="see_all" href="">See All</a>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
      </div>
    </section>
    <!--=========== END ABOUT US SECTION ================--> 
    <!--=========== BEGIN OUR COURSES SECTION ================-->
    <section id="ourCourses">
      <div class="container">
       <!-- Our courses titile -->
        <div class="row">
          <div class="col-lg-12 col-md-12"> 
            <div class="title_area">
              <h2 class="title_two">Share Market</h2>
              <span></span> 
            </div>
          </div>
        </div>
        <!-- End Our courses titile -->
        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="ourCourse_content">
              <ul class="course_nav">
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="img/nselogo.jpg" />
                      <div class="mask">                         
                        <a href="http://www.nseindia.com/" class="course_more">Visit NSE</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="http://www.nseindia.com/">Nifty 50 sensex</a></h3>
                    <p>The National Stock Exchange of India Limited (NSE) is the leading stock exchange of India, located in Mumbai.NSE's flagship index, the CNX Nifty,the 50 stock index, is used extensively by investors in India and around the world as a barometer of the Indian capital markets.</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="img/ai.png" alt="img">
                      <p>Advisor</p>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="img/BSE_logo.jpg" />
                      <div class="mask">                         
                        <a href="http://www.bseindia.com/" class="course_more">Visit BSE</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="http://www.bseindia.com/">BSE sensex </a></h3>
                    <p>The Bombay Stock Exchange (BSE) is an Indian stock exchange. More than 5500 companies are publicly listed on the BSE.</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="img/ai.png" alt="img">
                      <p>Advisor</p>
                    </div>
                  </div>
                </li> 
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="img/nasdaqlogo.jpg" />
                      <div class="mask">                         
                        <a href="http://www.nasdaq.com/" class="course_more">Visit NASDAQ</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="http://www.nasdaq.com/">NASDAQ</a></h3>
                    <p>The NASDAQ Stock Market, commonly known as the NASDAQ, is an American stock exchange. It is the second-largest exchange in the world by market capitalization, behind only the New York Stock Exchange.</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="img/ai.png" alt="img">
                      <p>Advisor</p>
                    </div>
                  </div>
                </li>  
                
               
                             
              </ul>
            </div>
          </div>
        </div>
        <!-- End Our courses content -->
      </div>
    </section>
    <!--=========== END OUR COURSES SECTION ================-->

    <!--=========== BEGIN WHY US SECTION ================-->
    <section id="whyUs">
      <!-- Start why us top -->
      <div class="row">        
        <div class="col-lg-12 col-sm-12">
          <div class="whyus_top">
            <div class="container">
              <!-- Why us top titile -->
              <div class="row">
                <div class="col-lg-12 col-md-12"> 
                  <div class="title_area">
                    <h2 class="title_two">Why Us</h2>
                    <span></span> 
                  </div>
                </div>
              </div>
              <!-- End Why us top titile -->
              <!-- Start Why us top content  -->
              <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-desktop"></span>
                    </div>
                    <h3>Technology</h3>
                    <p>Rig The Market provides you live stock prices of NSE,BSE and Nasdaq at only one platform where you can trade your shares easily with virtual money and have the worth experience related to Shares. </p>
                  </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-users"></span>
                    </div>
                    <h3>Wisdom</h3>
                    <p>This is the platform where you can trade with your wish avoiding the risk factor of losing money.</p>
                  </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-flask"></span>
                    </div>
                    <h3>Guidance</h3>
                    <p>A best site for beginners to make understand of share market with each and every aspect of trading risk.</p>
                  </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-support"></span>
                    </div>
                    <h3>Support</h3>
                    <p>This game provides you every update of live shares prices with news and tips.</p>
                  </div>
                </div>
              </div>
              <!-- End Why us top content  -->
            </div>
          </div>
        </div>        
      </div>
      <!-- End why us top -->
      <!-- Start why us bottom -->
      <div class="row">        
        <div class="col-lg-12 col-sm-12">
          <div class="whyus_bottom">            
            <div class="slider_overlay"></div>
            <div class="container">               
              <div class="skills">                
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">
                 <div class="single_skill wow fadeInUp">
                   <div id="myStat" data-dimension="150" data-text="99%" data-info="" data-width="10" data-fontsize="25" data-percent="99" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>fruitful experience</h4>                      
                  </div>
                </div>
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_skill wow fadeInUp">
                    <div id="myStathalf2" data-dimension="150" data-text="90%" data-info="" data-width="10" data-fontsize="25" data-percent="90" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Success Rate</h4>
                  </div>
                </div>
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">                 
                  <div class="single_skill wow fadeInUp">
                    <div id="myStat2" data-dimension="150" data-text="100%" data-info="" data-width="10" data-fontsize="25" data-percent="100" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Live certified Shares</h4>
                  </div>
                </div>
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">                 
                  <div class="single_skill wow fadeInUp">
                    <div id="myStat3" data-dimension="150" data-text="95%" data-info="" data-width="10" data-fontsize="25" data-percent="95" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Successive Trading</h4>
                  </div>
                </div>
              </div>
            </div>            
          </div>
        </div>        
      </div>
      <!-- End why us bottom -->
    </section>
    <!--=========== END WHY US SECTION ================-->

      

    <!--=========== BEGIN OUR TUTORS SECTION ================-->
    <section id="ourTutors">
      <div class="container">
       <!-- Our courses titile -->
        <div class="row">
          <div class="col-lg-12 col-md-12"> 
            <div class="title_area">
              <h2 class="title_two">Top Investors</h2>
              <span></span> 
            </div>
          </div>
        </div>
        <!-- End Our courses titile -->

        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="ourTutors_content">
              <!-- Start Tutors nav -->
              <ul class="tutors_nav">
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="img/d.JPG" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Rohan Gandhi</h3>
                      <span>Developer of Rig The Market</span>
                      <p>Investing in many stocks makes you well-diversified.</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="https://www.facebook.com/"></a></li>
                        <li><a class="fa fa-twitter" href="https://twitter.com/"></a></li>
                        <li><a class="fa fa-instagram" href="https://www.instagram.com"></a></li>
                        <li><a class="fa fa-google-plus" href="https://plus.google.com/"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="img/sa.jpg" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Sakhi Patel</h3>
                      <span>Project Manager of Rig The Market</span>
                      <p>If the stocks you're purchasing still have stable fundamentals, then their currently low prices are likely only a reflection of short-term investor fear. </p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="https://www.facebook.com/"></a></li>
                        <li><a class="fa fa-twitter" href="https://twitter.com/"></a></li>
                        <li><a class="fa fa-instagram" href="https://www.instagram.com"></a></li>
                        <li><a class="fa fa-google-plus" href="https://plus.google.com/"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="img/author.jpg" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Teacher</span>
                      <p>"The stock market is filled with individuals who know the price of everything, but the value of nothing." </p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="https://www.facebook.com/"></a></li>
                        <li><a class="fa fa-twitter" href="https://twitter.com/"></a></li>
                        <li><a class="fa fa-instagram" href="https://www.instagram.com"></a></li>
                        <li><a class="fa fa-google-plus" href="https://plus.google.com/"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="img/s45.jpg" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Krupa trivedi</h3>
                      <span>Executive Head officer</span>
                      <p>"Every once in a while, the market does something so stupid it takes your breath away."</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="https://www.facebook.com/"></a></li>
                        <li><a class="fa fa-twitter" href="https://twitter.com/"></a></li>
                        <li><a class="fa fa-instagram" href="https://www.instagram.com"></a></li>
                        <li><a class="fa fa-google-plus" href="https://plus.google.com/"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="img/s43.jpg" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>American business magnate, investor and philanthropist.</span>
                      <p>Price is what you pay. Value is what you get.</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="https://www.facebook.com/"></a></li>
                        <li><a class="fa fa-twitter" href="https://twitter.com/"></a></li>
                        <li><a class="fa fa-instagram" href="https://www.instagram.com"></a></li>
                        <li><a class="fa fa-google-plus" href="https://plus.google.com/"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="img/course-1.jpg" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Project Manager</span>
                      <p> "Know what you own, and know why you own it."</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>                                             
              </ul>
            </div>
          </div>
        </div>
        <!-- End Our courses content -->
      </div>
    </section>
    <!--=========== END OUR TUTORS SECTION ================-->

    <!--=========== BEGIN FOOTER SECTION ================-->
    <footer id="footer">
      <!-- Start footer top area -->
      <div class="footer_top">
        <div class="container">
          <div class="row">
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>About Us</h3>
                <p>This game provides the best platform for Investors and beginners where each and every trading can be done with viewing,basic understanding,reading tips etc. </p>
              </div>
            </div>
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>Community</h3>
                <ul class="footer_widget_nav">
                  <li><a href="#">Rules</a></li>
                  <li><a href="#">How to play?</a></li>
                  <li><a href="#">Tutorials!</a></li>
                  <li><a href="#">Headlines</a></li>
                  <li><a href="#">News</a></li>
                  <li><a href="#">Terms and conditions</a></li>
                </ul>
              </div>
            </div>
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>Others</h3>
                <ul class="footer_widget_nav">
                  <li><a href="#">NSE</a></li>
                  <li><a href="#">BSE</a></li>
                  <li><a href="#">Nasdaq</a></li>
                  <li><a href="#">Info about share market</a></li>
                  <li><a href="#">Blog</a></li>
                </ul>
              </div>
            </div>
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>Social Links</h3>
                <ul class="footer_social">
                  <li><a data-toggle="tooltip" data-placement="top" title="Facebook" class="soc_tooltip" href="#"><i class="fa fa-facebook"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Twitter" class="soc_tooltip"  href="#"><i class="fa fa-twitter"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Google+" class="soc_tooltip"  href="#"><i class="fa fa-google-plus"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Linkedin" class="soc_tooltip"  href="#"><i class="fa fa-linkedin"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Youtube" class="soc_tooltip"  href="#"><i class="fa fa-youtube"></i></a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- End footer top area -->

      <!-- Start footer bottom area -->
      <div class="footer_bottom">
        <div class="container">
          <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-6">
              <div class="footer_bootomLeft">
                <p> &copy; Copyright <a href="http://SVIT.com/"></a> All Rights Reserved</p>
              </div>
            </div>
            <div class="col-lg-6 col-md-6 col-sm-6">
              <div class="footer_bootomRight">
                <p>Design & Developed by SVIT student </p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- End footer bottom area -->

    </footer>
    <!--=========== END FOOTER SECTION ================--> 

  

    <!-- Javascript Files
    ================================================== -->

    <!-- initialize jQuery Library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Preloader js file -->
    <script src="js/queryloader2.min.js" type="text/javascript"></script>
    <!-- For smooth animatin  -->
    <script src="js/wow.min.js"></script>  
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- slick slider -->
    <script src="js/slick.min.js"></script>
    <!-- superslides slider -->
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/jquery.animate-enhanced.min.js"></script>
    <script src="js/jquery.superslides.min.js" type="text/javascript" charset="utf-8"></script>   
    <!-- for circle counter -->
    <script src='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/js/jquery.circliful.min.js'></script>
    <!-- Gallery slider -->
    <script type="text/javascript" language="javascript" src="js/jquery.tosrus.min.all.js"></script>   
   
    <!-- Custom js-->
    <script src="js/custom.js"></script>
    
    <!--=============================================== 
    Template Design By WpFreeware Team.
    Author URI : http://www.wpfreeware.com/
    ====================================================-->


  </body>
</html>