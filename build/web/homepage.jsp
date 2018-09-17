<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Controller.NewHibernateUtil"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="model.VSMShareDetail"%>
<%@page import="model.Registeration"%>
<%@page import="model.Login"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<title>Rig The Market</title>
		<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
		<!--[if IE 6]>
			<link rel="stylesheet" href="css/ie6-style.css" type="text/css" media="all" />
		<![endif]-->
		<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
		<script src="js/fns.js" type="text/javascript"></script>
	</head>
	<body>
		<!-- Page -->
		<div id="page" class="shell">
			<!-- Header -->
			<div id="header">
				<!-- Top Navigation -->
				<div id="top-nav">
					<ul>
                                            <li class="home"><a href="homepage.jsp">home</a></li>
                                            <li><a href="">Nadaq Bank : 2882.07</a></li>
					    <li><a href="">Nasdaq Financial : 3361.01</a></li>
					    <li><a href="">Nasdaq-100 :4512.54 </a></li>
                                            <li class="last"><a href="MoreIndicesServ">more >></a></li>
					</ul>
				</div>
				<!-- / Top Navigation -->
				<div class="cl">&nbsp;</div>
				<!-- Logo -->
				<div id="logo">
                                    <br></br>
					<h1><a href="#">Welcome <% 
                                                if(request.getAttribute("username")!= null)
                                                {
                                                    Registeration r = (Registeration) request.getAttribute("username");
                                        %> 
                                        <%= r.getName()%>
                                        to Rig The <span> Market</span></a></h1>
					<p class="description">your trading zone</p>
				</div>
				<!-- / Logo -->
                                <!--balance-->
                                <div><p><font color="#faebd7">Your Account Balance is :<font color="white"><%=r.getVid().getMoney()%></font><%}%></font> </p></div>
                                <br></br>
                                <!-- Main Navigation -->
				<div id="main-nav">
					<div class="bg-right">
						<div class="bg-left">
							<ul>
							    <li><a href="ProfileServ">My profile</a></li>
                                                            <li><a href="#">ALL Company Info!</a></li>
							    <li><a href="https://rigthemarketcom.wordpress.com/2016/05/29/share-market-2/">Blog</a></li>
							    <li><a href="#">News</a></li>
							    <li><a href="#">Tips</a></li>
							    <li><a href="#">FAQ's</a></li>
                                                            <li><a href="#">Need More money?</a></li>
							    <li><a href="#">Setting</a></li>
							</ul>
						</div>
					</div>
				</div>
				<!-- / Main Navigation -->
				<div class="cl">&nbsp;</div>
				<!-- Sort Navigation -->
				<div id="sort-nav">
					<div class="bg-right">
						<div class="bg-left">
							<div class="cl">&nbsp;</div>
							<ul>
                                                            <li class="first active first-active"><a href="homepage.jsp">My Home</a><span class="sep">&nbsp;</span></li>
                                                            <li><a href="MarketWatch">Market </a><span class="sep">&nbsp;</span></li>
							    <li><a href="Investment.jsp">Investment </a><span class="sep">&nbsp;</span></li>
							    <li><a href="ProfitLoss.jsp">Profit/Loss</a><span class="sep">&nbsp;</span></li>
                                                            <li><a href="Notification.jsp">Notification</a><span class="sep">&nbsp;</span></li>
                                                            <li><a href="leaderboard.jsp">Leader-board</a><span class="sep">&nbsp;</span></li>
                                                            <li><a href="#">My portfolio</a><span class="sep">&nbsp;</span></li>
							</ul>
							<div class="cl">&nbsp;</div>
						</div>
					</div>
				</div>
				<!-- / Sort Navigation -->
			</div>
			<!-- / Header -->
			<!-- Main -->
			<div id="main">
				<div id="main-bot">
					<div class="cl">&nbsp;</div>
					<!-- Content -->
					<div id="content">
						<div class="block">
							<div class="block-bot">
								<div class="block-cnt">
									<div id="slider">
										<div class="buttons">
											<span class="prev">prev</span>
											<span class="next">next</span>
										</div>
										<div class="holder">
											<div class="frame">&nbsp;</div>
											<div class="content">
												<ul>
												    <li class="fragment">
												    	<div class="img">
												    		<img src="css/images/s36.jpg" alt="" />
												    	</div>
												    	<div class="cnt">
												    		<div class="cl">&nbsp;</div>
												    		<div class="side-a">
												    			<h4>BSE</h4>
												    			<ul class="rating">
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star empty-star">&nbsp;</span></li>
												    			    <li><span class="votes">1.456 votes</span></li>
												    			</ul>
												    		</div>
												    		<div class="side-b">
												    			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
												    		</div>
												    		<div class="cl">&nbsp;</div>
												    	</div>
												    </li>
												    <li class="fragment">
												    	<div class="image">
												    		<img src="css/images/s40.JPG" alt="" />
												    	</div>
												    	<div class="cnt">
												    		<div class="cl">&nbsp;</div>
												    		<div class="side-a">
												    			<h4>NSE</h4>
												    			<ul class="rating">
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star empty-star">&nbsp;</span></li>
												    			    <li><span class="votes">1.456 votes</span></li>
												    			</ul>
												    		</div>
												    		<div class="side-b">
												    			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
												    		</div>
												    		<div class="cl">&nbsp;</div>
												    	</div>
												    </li>
												    <li class="fragment">
												    	<div class="image">
												    		<img src="css/images/s39.jpg" alt="" />
												    	</div>
												    	<div class="cnt">
												    		<div class="cl">&nbsp;</div>
												    		<div class="side-a">
												    			<h4>Nasdaq</h4>
												    			<ul class="rating">
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star full-star">&nbsp;</span></li>
												    			    <li><span class="star empty-star">&nbsp;</span></li>
												    			    <li><span class="votes">1.456 votes</span></li>
												    			</ul>
												    		</div>
												    		<div class="side-b">
												    			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scelerisque leo sodales sit amet. Curabitur volutpat lorem euismod nunc tincidunt condi- mentum. Suspendisse gravida elementum mauris, in vulputate justo ultrices sit amet.</p>
												    		</div>
												    		<div class="cl">&nbsp;</div>
												    	</div>
												    </li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="block-bot">
								<div class="head">
									<div class="head-cnt">
										<a href="#" class="view-all">view all</a>
										<h3>Your Recent Activities</h3>
										<div class="cl">&nbsp;</div>
									</div>
								</div>
								<div class="col-articles articles">
									<div class="cl">&nbsp;</div>
                                                                        <div class="spacing">
                                                                            <ul>
                                                                                <li class="ele_sp">
                                                                                    <p>You have bought 5 shares of Idea of BSE at 02.03.2016 1:03pm .</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>You sold 10 shares of SpiceJet at 02.03.2016 2:30pm .</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>vdsvystfd</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>vdsvystfd</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>You have bought 5 shares of Idea of BSE at 02.03.2016 1:03pm .</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>You sold 10 shares of SpiceJet at 02.03.2016 2:30pm .</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>vdsvystfd</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>vdsvystfd</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>You have bought 5 shares of Idea of BSE at 02.03.2016 1:03pm .</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>You sold 10 shares of SpiceJet at 02.03.2016 2:30pm .</p>
                                                                                </li>
                                                                                <li class="ele_sp">
                                                                                    <p>vdsvystfd</p>
                                                                                </li>
                                                                            </ul>
                                                                        </div>
									<div class="cl">&nbsp;</div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="block-bot">
								<div class="head">
									<div class="head-cnt">
										<a href="#" class="view-all">view all</a>
										<h3>Investor's Pick</h3>
										<div class="cl">&nbsp;</div>
									</div>
								</div>
								<div class="row-articles articles">
									<div class="cl">&nbsp;</div>
									<div class="article">
										<div class="cl">&nbsp;</div>
										<div>
											<h4><a href="#">Top Tutorials to understand share market.</a></h4>
                                                                                        <p class="ip_spacing">Tutorials for beginners to understand the share market. The context written by high experienced Investors to easie the risk of share market with the best examples which seeks to teach by example and supply interactive knowledge about Market.  ...<a href="">Click here to Visit.</a></p>
										</div>
										<div class="cl">&nbsp;</div>
									</div>
									<div class="article">
										<div class="cl">&nbsp;</div>
										<div>
											<h4><a href="#">Books By warren buffet to understand share market.</a></h4>
											<p class="ip_spacing">Tutorials for beginners to understand the share market. The context written by high experienced Investors to easie the risk of share market with the best examples which seeks to teach by example and supply interactive knowledge about Market.  ...<a href="">Click here to Visit.</a></p>
										</div>
										<div class="cl">&nbsp;</div>
									</div>
                                                                        <div class="article">
										<div class="cl">&nbsp;</div>
										<div>
											<h4><a href="#">Tips For fruitful trade.</a></h4>
											<p class="ip_spacing">Tutorials for beginners to understand the share market. The context written by high experienced Investors to easie the risk of share market with the best examples which seeks to teach by example and supply interactive knowledge about Market.  ...<a href="">Click here to Visit.</a></p>
										</div>
										<div class="cl">&nbsp;</div>
									</div>
                                                                        
									<div class="article last-article">
										<div class="cl">&nbsp;</div>
										<div>
											<h4><a href="#">Learn something about share markets.</a></h4>
											<p class="ip_spacing">Tutorials for beginners to understand the share market. The context written by high experienced Investors to easie the risk of share market with the best examples which seeks to teach by example and supply interactive knowledge about Market.  ...<a href="">Click here to Visit.</a></p>
										</div>
										<div class="cl">&nbsp;</div>
									</div>
									<div class="cl">&nbsp;</div>
								</div>
							</div>
						</div>
					</div>
					<!-- / Content -->
					<!--  -->
					<div id="sidebar">
						<!-- Search -->
						<div id="search" class="block">
							<div class="block-bot">
								<div class="block-cnt">
									<form action="SearchShareServ" method="post">
										<div class="cl">&nbsp;</div>
                                                                                <div class="search_categories">
                                                                                <select name="search_shares">
                                                                                        <option value="select share market">Select Share-Market</option>
                                                                                        <option value="Nasdaq">Nasdaq</option>
                                                                                    </select>
                                                                                </div>
										<div class="fieldplace">
											<input type="text" class="field" name="search"value="Search shares" title="Search" />
										</div>
                                                                                
										<input type="submit" class="button" value="GO"  />
                                                                               
										<div class="cl">&nbsp;</div>
									</form>
								</div>
							</div>
						</div>
						<!-- / Search -->
						<!-- Sign In -->
						<div id="sign" class="block">
							<div class="block-bot">
								<div class="block-cnt">
									<div class="cl">&nbsp;</div>
                                                                        <form action ="logout">
                                                                            <button type="submit" class="button button-left">sign out</button>
                                                                        </form>
									<a href="#" class="button button-right">delete account</a>
									<div class="cl">&nbsp;</div>
									<p class="center"><a href="#">Help?</a>&nbsp;&nbsp;<a href="#">Change Password?</a></p>
								</div>
							</div>
						</div>
						<!-- / Sign In -->
						<div class="block">
							<div class="block-bot">
								<div class="head">
									<div class="head-cnt">
										<h3>Top Gainer Companies</h3>
                                                                                </div>
                                                                    
								</div>
								<div class="image-articles articles">
									<div class="cl">&nbsp;</div>
									<div class="article">
                                                                            <table width = "50%">
                                                                                <tr>
                                                                                    <th>Name:</th>
                                                                                    <th>Price:</th>
                                                                                    
                                                                                </tr>
                                                                                <%
                                                                                            ArrayList<VSMShareDetail> tcal1;
                                                                                            if(request.getAttribute("shares")!= null)
                                                                                            {
                                                                                                   tcal1 = (ArrayList<VSMShareDetail>) request.getAttribute("shares");

                                                                                                   for(VSMShareDetail v : tcal1) {    
                                                                                          %>
                                                                                <tr> 
                                                                                    <td><%= v.getSymbol()%></td>
                                                                                    <td><%= v.getPrice()%> </td>
                                                                                </tr>
                                                                                                <%} 
                                                                                                       }
                                                                                                            %>
                                                                                <tr>
                                                                                    <td colspan="4"><a href="">More>></a></td>
                                                                                </tr>
                                                                            </table>
                                                                        </div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="block-bot">
								<div class="head">
									<div class="head-cnt">
										<h3>Top Loser Companies</h3>
                                                                                </div>
                                                                    
								</div>
								<div class="image-articles articles">
									<div class="cl">&nbsp;</div>
									<div class="article">
                                                                            <table>
                                                                                <tr>
                                                                                    <th>Name:</th>
                                                                                    <th>Price:</th>
                                                                                    <th>Change:</th>
                                                                                    <th>%change:</th>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                   <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td><a href="">Tata</a></td>
                                                                                    <td>200</td>
                                                                                    <td>+12</td>
                                                                                    <td>+1.97%</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td colspan="4"><a href="">More>></a></td>
                                                                                </tr>
                                                                            </table>
                                                                        </div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="block-bot">
								<div class="head">
									<div class="head-cnt">
										<h3>Latest News</h3>
									</div>
								</div>
								<div class="text-articles articles">
									<div class="article">
										<h4><a href="#">Dolor amet sodales leo</a></h4>
										<small class="date">21.07.09</small>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie urna, id scele- risque leo sodales sit amet</p>
									</div>
									<div class="article">
										<h4><a href="#">Amet sed lorem sit</a></h4>
										<small class="date">20.07.09</small>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </p>
									</div>
									<div class="article">
										<h4><a href="#">Adipsicing elit elementum</a></h4>
										<small class="date">19.07.09</small>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie.</p>
									</div>
									<div class="article">
										<h4><a href="#">Consectetur elit sed molestie</a></h4>
										<small class="date">15.07.09</small>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed elementum molestie.</p>
									</div>
									<div class="cl">&nbsp;</div>
									<a href="#" class="view-all">view all</a>
									<div class="cl">&nbsp;</div>
								</div>
							</div>
						</div>
					</div>
					<!-- / Sidebar -->
					<div class="cl">&nbsp;</div>
					<!-- Footer -->
					<div id="footer">
						<div class="navs">
							<div class="navs-bot">
								<div class="cl">&nbsp;</div>
                                                                <div>
                                                                    <h3><font color="white"> About U</font>s</h3>
                                                                   <p>This game provides the best platform for Investors and beginners where each and every trading can be done with viewing,basic understanding,reading tips etc. </p>
                                                                    </div>
								<ul>
								    <li><a href="#">community</a></li>
								    <li><a href="#">forum</a></li>
								    <li><a href="#">video</a></li>
								    <li><a href="#">cheats</a></li>
								    <li><a href="#">features</a></li>
								    <li><a href="#">downloads</a></li>
								    <li><a href="#">sports</a></li>
								    <li><a href="#">tech</a></li>
								</ul>
								<ul>
								    <li><a href="#">pc</a></li>
								    <li><a href="#">xbox</a></li>
								    <li><a href="#">360</a></li>
								    <li><a href="#">wii</a></li>
								    <li><a href="#">ps3</a></li>
								    <li><a href="#">ps2</a></li>
								    <li><a href="#">psp</a></li>
								    <li><a href="#">ds</a></li>
								</ul>	
								<div class="cl">&nbsp;</div>
							</div>
						</div>
						<p class="copy">&copy; Sitename.com. Design by <a href="http://chocotemplates.com">ChocoTemplates.com</a></p>
					</div>
					<!-- / Footer -->	
				</div>
			</div>
			<!-- / Main -->
		</div>
		<!-- / Page -->
	</body>
</html>