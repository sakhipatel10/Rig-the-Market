<!DOCTYPE html>
<html>
<head>
<title>Registration of Rig The Market</title>
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7; IE=EmulateIE9">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
    <link rel="stylesheet" type="text/css" href="demo.css" media="all" />
    <script type="text/javascript">
     function checkForm(form)
  {
    

    if(form.pwd1.value !== "" && form.pwd1.value === form.pwd2.value) {
      if(form.pwd1.value.length < 6) {
        alert("Error: Password must contain at least six characters!");
        form.pwd1.focus();
        return false;
      }
      if(form.pwd1.value === form.username.value) {
        alert("Error: Password must be different from Username!");
        form.pwd1.focus();
        return false;
      }
      re = /[0-9]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one number (0-9)!");
        form.pwd1.focus();
        return false;
      }
      re = /[a-z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one lowercase letter (a-z)!");
        form.pwd1.focus();
        return false;
      }
      re = /[A-Z]/;
      if(!re.test(form.pwd1.value)) {
        alert("Error: password must contain at least one uppercase letter (A-Z)!");
        form.pwd1.focus();
        return false;
      }
    } else {
      alert("Error: Please check that you've entered and confirmed your password!");
      form.pwd1.focus();
      return false;
    }

    alert("You entered a valid password: " + form.pwd1.value);
    return true;
    
    if(!form.terms.checked) {
      alert("Please indicate that you accept the Terms and Conditions");
      form.terms.focus();
      return false;
    }
    return true;
  }
  

</script>
<script type="text/javascript">
    function Getname()
    {
        var sid= document.getElementById("UserID").value;
        var url = "GetNameserv?un="+sid;
        var xmlreq = new XMLHttpRequest();
        xmlreq.onreadystatechange=function()
        {
            if(xmlreq.readyState == 4)
            {
                document.getElementById("prnt").innerHTML= xmlreq.responseText;
            }
        }
        xmlreq.open("get",url,true);
        xmlreq.send();
    }
</script>
</head>

<div class="container">
			<!-- freshdesignweb top bar -->
            <div class="freshdesignweb-top">
                <a href="login.jsp" target="_blank">Login</a>
                
               
            </div><!--/ freshdesignweb top bar -->
			<header>
				<h1>Signup! to <span>Rig The Market</span> </h1>
            </header>       
      <div  class="form">
          <form onsubmit="return checkForm(this);" action="Regserv"> 
    			<p class="contact"><label for="UserId">User_ID</label></p> 
                        <input id="UserID" name="un" placeholder="Enter your EmailID" required="" type="email" onblur="Getname()"> 
                        <h5 id="prnt"></h5><%
            if(request.getAttribute("msg")!=null)
            {
                String message=request.getAttribute("msg").toString();
            
        %>
        <%=message%>    
        <%}%>
                        
    			<p class="contact"><label for="password" >Create a password</label></p> 
                        <input title="Password must contain at least 6 characters, including UPPER/lowercase and numbers" type="password" id="password" name="pwd1" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" placeholder="Must be atleast 6 characters, including UPPER/lowercase and numbers" onchange="form.pwd2.pattern = this.value;"> 
                        
                        <p class="contact"><label for="repassword">Confirm your password</label></p> 
    			<input title="Please enter the same Password as above" type="password" id="repassword" name="pwd2" placeholder="Please enter the same Password as above" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}">
                         
                        <p class="contact"><label for="Name">Full Name</label></p> 
    			<input id="Name" name="name" placeholder="Enter your first and last name" required="" type="text">
                        
                       

                        <p class="contact"><label  for="Mobileno">Enter Your Mobile No.</label></p>
                        <input id="mn" name="mn" type="text" maxlength="10"  pattern="[0-9]{10}" title="Enter your mobile number" required>
                        
                        <p class="contact"><label for="Gender">Gender:</label></p>
                        <select class="select-style gender" name="gender">
                        <option value="select">i am..</option>
                        <option value="m" name="gender">Male</option>
                        <option value="f" name="gender">Female</option>
                    
                        </select><br><br>
                
                        <p class="contact"><label for="Birthday">Birthday:</label></p> 
    			<input type="text" id="Birthday" name="bd" required="" placeholder="DD/MM/YYYY">
                        
                        
                        <p class="contact"><label for="City">City:</label></p> 
    			<input id="City" name="city" placeholder="Enter city name where you live" required="" type="text">
                                           
                        <p class="contact"><label for="Occupation">Occupation:</label></p>
                        <select class="select-style" name="Occupation">
                            <option value="Select_Occupation">Select Occupation</option>
                            <option value="Business">Business</option>
                            <option value="Service">Service</option>
                            <option value="GovtEmployee">GovtEmployee</option>
                            <option value="Professional">Professional</option>
                            <option value="Homemaker">Homemaker</option>
                            <option value="Student">Student</option>
                            <option value="Retired">Retired</option>
                            <option value="Others">Others</option>
                            </select>
                        
                        <h3><b><br><font face="Times New Roman" color ="blue"> For better Trading , please tell us about: </font></b></h3>
                                                                                                                     
                                                                                               

                        <p class="contact"><label for="Industry"><br>Interested in specific Industry Shares </label></p>
                        <input type="checkbox" name="Industry" value="Auto_and_Auto Ancillary"><font size="2">  Auto and Auto Ancillary<br></font>
                        <input type="checkbox" name="Industry" value="Banking_and_Financial_Services" ><font size="2"> Banking and Financial Services <br></font>
                        <input type="checkbox" name="Industry" value="FMCG_(Fast_Moving_Consumer_Goods)" ><font size="2"> FMCG (Fast Moving Consumer Goods)<br></font>
                        <input type="checkbox" name="Industry" value="Information_Technology" ><font size="2"> Information Technology <br></font>
                        <input type="checkbox" name="Industry" value="Media_Entertainment" ><font size="2"> Media Entertainment <br></font>
                        <input type="checkbox" name="Industry" value="Pharma_and_Healthcare" ><font size="2"> Pharma and Healthcare <br></font>
                        <input type="checkbox" name="Industry" value="Retail" ><font size="2"> Retail <br></font>
                        <input type="checkbox" name="Industry" value="Real_Estate" ><font size="2"> Real Estate <br></font>
                        <input type="checkbox" name="Industry" value="Telecom" ><font size="2"> Telecom <br></font>
                        <input type="checkbox" name="Industry" value="Travel_and_Tourism" ><font size="2"> Travel and Tourism <br></font>
                        <input type="checkbox" name="Industry" value="Others" ><font size="2"> Others <br></font>


                        <br>
                        
                        <p class="contact"><label for="AnnualIncome">Annual Income</label></p>
    			<input id="AnnualIncome" name="ai" placeholder="Money" required="" type="Number">
                        
                        <br>
                        <fieldset>
                            <p> <input type="checkbox" required name="terms" value="termsandconditions"><font size="3" > I accept<span> <a href="termsandconditions.html"><font color="Red">Terms and Conditions</font></a></span></font>
                        </fieldset>
                        
                        <br>
                        <br>
                        <input class="buttom" name="submit" id="submit" tabindex="5" value="Sign me up!" type="submit" > 	 
   </form>
</div>      
</div>

</body>
</html>
