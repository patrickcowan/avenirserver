<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="avenir.stores.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

   <title>Photos</title>

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
       
       
        
            <ul>
                <li class="nav"><a href="upload.jsp">Upload</a></li>
                  
            </ul>
            
             
             
         
            
            
        <div class="container">
       
            
            <form class="form-signin" method="POST" enctype="multipart/form-data" action="Image">
            <h2 class="form-signin-heading">Upload Photo</h2>
                File to upload: <input type="file" name="upfile">
                
                <a href="/Instagrim" class="btn btn-sm btn-default">Home</a>
                <br/>

                <br/>
                <input type="submit" value="Press"> to upload the file!
                
                <br/><br/>
               
                
                <a href="/Instagrim" class="btn btn-sm btn-primary">Home</a>
                
            </form>

        <%
            java.util.LinkedList<Pic> lsPics = (java.util.LinkedList<Pic>) request.getAttribute("Pics");
            if (lsPics == null) {
        %>
        <p>No Pictures found</p>
        <%
        } else {
            Iterator<Pic> iterator;
            iterator = lsPics.iterator();
            while (iterator.hasNext()) {
                Pic p = (Pic) iterator.next();

        %>
        
        <a href="/Instagrim/Image/<%=p.getSUUID()%>" ><img src="/Instagrim/Thumb/<%=p.getSUUID()%>"></a><br/><%

            }
            }
        %>
        
 
                
                
                </div>
            
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>