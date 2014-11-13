<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="avenir.stores.*" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

   <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

   <link href="css/starter-template.css" rel="stylesheet">
   
    <script src="js/ie-emulation-modes-warning.js"></script>
        <script type="text/javascript" src="js/cordova.js"></script>
        <script type="text/javascript" src="spec/lib/index.js"></script>
        
        
    </head>
    <body>
    
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#home"></a></li>
        
          </ul>
        </div>
      </div>
    </nav>
    
     <nav class="navbar navbar-inverse navbar-fixed-bottom" role="navigation">
      <div class="container">
        
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#home"></a></li>
        
          </ul>
        </div>
      </div>
    </nav>
    
    <div class="container">

      <div class="starter-template">        
           <br/><br/><br/><br/>
           <img src="img/newpic.png"><br/>
           
                  <%
                        
                        LoggedIn lg = (LoggedIn) session.getAttribute("LoggedIn");
                        if (lg != null) {
                            String UserName = lg.getUsername();
                            if (lg.getlogedin()) {
                    %>
					
                 
                
                 	   
    	<a href="LED.html"><img src="img/Future.png"></a>
        <a href="cheetah.jsp"><img src="img/VO.png"></a>
       	<a href="vo.jsp"><img src="img/CHEETAH.png"></a> 
       
       		
        <p>	<a href="/Instagrim/Images/<%=lg.getUsername()%>" class="btn btn-primary ">Your Images</a>
        <a href="logout.jsp" class="btn btn-primary">Log Out</a></p>
                 
                 
                    <%}
                            }else{
                                %>
                 <a href="register.jsp" class="btn btn-primary ">Register</a>
                <a href="login.jsp" class="btn btn-primary ">Login</a>                                
                <%
                                        
                            
                    }%>
            
        </div>
        </div>
        
        <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
