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
     <title>Login to Rig The Market</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="img/wpf-favicon.png"/>

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
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <!-- LOGO -->
              <!-- TEXT BASED LOGO -->
              <a class="navbar-brand" href="index.jsp">Rig <span> The Market </span></a>            
              <!-- IMG BASED LOGO  -->
               <!-- <a class="navbar-brand" href="index.html"><img src="img/logo.png" alt="logo"></a>  -->          
                     
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li><a href="index.jsp">Home</a></li>
                <li class="active"><a href="login.jsp">Login!</a></li>
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

    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="imgBanner">
        <h2>Login to Rig The <span style="color:black"> Market</span></h2>
    </section>
    <!--=========== END COURSE BANNER SECTION ================-->
    
    <div class="login">
           <div align="center">
               <br>
               <br>
               <br>
      <h1>Login to Rig The Market</h1>
      <br>
      <br>
      <form method="post" action="loginserv">
          
          <p>UserID :<font color="black"><input type="text" name="login" value="" style="resize: horizontal;width:  200px"placeholder="Username or Email"></font></p>
          <p>Password :<font color="black"><input type="password" name="password" value="" style="resize: horizontal;width:  200px"placeholder="Password"></font></p>
          <h4><font color="black" face="Times New Roman"><%
    if(null!=request.getAttribute("errorMessage"))
    {
        out.println(request.getAttribute("errorMessage"));
    }
 %></font></h4>
        <p class="remember_me">
          <label>
              
            <input type="checkbox" name="remember_me" id="remember_me">
            
            Remember me on this computer
            
          </label>
        </p>
        <p class="submit"><font color="black"><input type="submit" name="commit" value="Login"></font></p>
      </form>
    

    <div>
        <p>Forgot your password? <a href="reset.jsp">Click here to reset it.</a></p>
        <p>New to Rig The Market? <a href ="signup.jsp"> Signup now </a> </p>
               <br>
               
    </div>
           </div>
       </div>
    
    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="courseArchive">
      <div class="container">
        <div class="row">
          <!-- start course content -->
          <div class="col-lg-8 col-md-8 col-sm-8">
            <div class="courseArchive_content">
              <!-- start blog archive  -->
              <div class="row">
                <!-- start single blog -->
                <div class="col-lg-12 col-12 col-sm-12">
                  <div class="single_blog">
                    <!-- start events slider -->
                    <div class="events_slider_area">
                      <div class="events_slider">
                        <div><img src="img/s1.jpg" alt="img"></div>
                        <div><img src="img/s2.jpg" alt="img"></div>
                        <div><img src="img/s3.jpg" alt="img"></div>
                      </div>
                    </div>
                    <!-- End events slider -->
                    <h2 class="blog_title"><span style="color: blue">Login AND Play!</span></a></h2>
                    <p>Welcome to Rig The Market!.This game is the best platform for beginners and investors to learn fruitful trade and have real experience of live shares trading with virtual money.Virtual money is the money that would be given on the starting of game at the first sign in. Investors can trade individually and in group also. Users can also make groups to trade high shares and do group betting.</p>
                    <blockquote>
                      <span class="fa fa-quote-left"></span>
                      <br/>Life is like a game of cards. The hand you are dealt is determinism; the way you play it is free will.
                      <br/>>Invest in yourself. Your career is the engine of your wealth.
                      <br/>>Every once in a while, the market does something so stupid it takes your breath away.
                      <br/>>Know what you own, and know why you own it.
                      <span class="fa fa-quote-right"></span>
                    </blockquote>
                    <ul style="list-style-type:disc">
                        <li><span style="color: blue">PLAN FOR ENROLLMENT</span>
                            <p>This section is provided with a registration to get enrolled to the website to enjoy various features and facilities provided for the user.</p></li>
                        <li><span style="color: blue">Explore Stocks</span>
                            <p>This section of rig the Market allows you to view information and statistics about each of the company stock prices.
                               Once you have entered your choice of stocks and price requirements, rig the Market will display all company stocks that meet your requirements.
                               The Comparative View helps decide which Company best meets your needs by allowing you to see a comparison of stocks.
                               The Company Facts provide statistical data, graphs of stock prices, and other useful information.
                               The Frequently Asked Questions - Company Selection section answers the most commonly asked questions about stocks.</p></li>
                        <li><span style="color: blue">STOCK ONLINE</span>
                            <p>The "Buy Stock" and "Sell Stock" allows you to buy or sell the stocks online you are currently working with. 
                                The Blog allows beginners to learn about the key features of the market and explore new concepts. It provides with the necessary guidelines and direction for a newly
                                registered participant of stock.
                                The online news on the right side column keeps the user updated with all the necessary economic news.</p></li>
                        <li><span style="color: blue">FINANCIAL AID</span>
                            <p>The Financial Aid Overview provides financial aid information and helps the user to plan for stock costs and buy virtual packages to invest in the stocks. 
                                It describes the different types of packages available to users and helps explain the entire financial aid process.
                                The Cost graph module provides an estimate of all company's stock prices and their stock rankings.
                                The Frequently Asked Questions - Financial Aid section answers the questions most commonly asked by students about financial aid.</p></li>
                        <li><span style="color: blue">GROUP BID</span>
                            <p>The chatrooms allows the users to chat with the other user to seek any financial advice related to stocks. The group bid facility allows user to bid in group 
                                on expensive stocks.</li>
                    </ul>
                    </div>
                  <!-- single blog nex & prev button -->
                  
                </div>
                <!-- End single blog -->                
              </div>
              <!-- end blog archive  -->
              <!-- start related post -->
              
              <!-- start related post -->           
            </div>
          </div>
          <!-- End course content -->

          <!-- start course archive sidebar -->
          <div class="col-lg-4 col-md-4 col-sm-4">
            <div class="courseArchive_sidebar">
              <!-- start single sidebar -->
              <div class="single_sidebar">
               <h2>Popular Companies<span class="fa fa-angle-double-right"></span></h2>
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a href="#" class="news_img">
                          <img alt="img" src="img/news.jpg" class="media-object">
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
                        <a href="#" class="news_img">
                          <img alt="img" src="img/news.jpg" class="media-object">
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
                        <a href="#" class="news_img">
                          <img alt="img" src="img/news.jpg" class="media-object">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>                  
                </ul>
              </div>
              <!-- End single sidebar -->
              <div class="single_sidebar">
               <h2>Top Shares   <span class="fa fa-angle-double-right"></span></h2>
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a href="#" class="news_img">
                          <img alt="img" src="img/news.jpg" class="media-object">
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
                        <a href="#" class="news_img">
                          <img alt="img" src="img/news.jpg" class="media-object">
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
                        <a href="#" class="news_img">
                          <img alt="img" src="img/news.jpg" class="media-object">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>                  
                </ul>
              </div>
              <!-- start single sidebar -->
              <div class="single_sidebar">
                <h2>Shares Category<span class="fa fa-angle-double-right"></span></h2>
                <ul>
                  <li><a href="#">Auto and Auto Ancillary</a></li>
                  <li><a href="#">Banking and Financial Services</a></li>
                  <li><a href="#">FMCG (Fast Moving Consumer Goods)</a></li>
                  <li><a href="#">Information Technology</a></li>
                  <li><a href="#">Pharma and Healthcare</a></li>
                  <li><a href="#">Retail</a></li>
                  <li><a href="#">Real Estate</a></li>
                  <li><a href="#">Telecom</a></li>
                 <li><a href="#">Travel and Tourism</a></li>
                 <li><a href="#">Others</a></li>
                </ul>
              </div>
              <!-- End single sidebar -->
              <!-- start single sidebar -->
              <div class="single_sidebar">
                <h2>Shares Tags <span class="fa fa-angle-double-right"></span></h2>
                <ul class="tags_nav">
                  <li><a href="#"><i class="fa fa-tags"></i>Financial</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>Commercial</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>Art</a></li>
                  
                </ul>
              </div>
              <!-- End single sidebar -->
              
            </div>
          </div>
          <!-- start course archive sidebar -->
        </div>
      </div>
    </section>
    <!--=========== END COURSE BANNER SECTION ================-->
    
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