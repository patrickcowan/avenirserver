<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Avenir</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
    <script src="js/ie-emulation-modes-warning.js"></script>

		<script type="text/javascript" src="jquery/jquery-1.9.1.min.js"></script>
		<script type="text/javascript" src="jquery/jquery.mobile-1.3.2.min.js"></script>
		<script type="text/javascript" charset="utf-8" src="javascript/cordova.js"></script>
		<script type="text/javascript" src="javascript/login.js"></script>
		<script type="text/javascript" src="javascript/cross-domain.js"></script>
		
     

    </head>
    
    <body>       
       
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
          
               <form class="form-signin" method="POST"  action="Register">
                 <h2 class="form-signin-heading">Register as user</h2>
                
                    <input type="text" class="form-control" name="username" placeholder="Username" required autofocus>
                    <input type="password" class="form-control" name="password" placeholder="Password" required autofocus>
                    <input type="text" class="form-control" name="address" placeholder="Address" required autofocus>
                    <input type="text" class="form-control" name="first_name" placeholder="First Name" required autofocus>
                    <input type="text" class="form-control" name="last_name" placeholder="Surname" required autofocus>
                    <input type="text" class="form-control" name="company" placeholder="Company" required autofocus>
                    
                <br/>
                
                <button class="btn btn-primary btn-block" type="submit" value="Register">Submit</button>
                <a href="index.jsp" class="btn btn-primary btn-block">Back</a>
                
                
            </form>
            </div>

        <footer>
          
        </footer>
    </body>
</html>
