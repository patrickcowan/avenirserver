<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

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

      <form class="form-signin" role="form" method="POST"  action="Login">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="username" placeholder="Username" required autofocus>
        <input type="password" class="form-control" name="password" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
          
        </div>
        <button class="btn btn-primary btn-block" type="submit" value="Login">Sign in</button>
        <a href="index.jsp" class="btn btn-primary btn-block">Back</a>
        
        
      </form>

    </div> 


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
    
    
        <footer>
           
        </footer>
    </body>
</html>
