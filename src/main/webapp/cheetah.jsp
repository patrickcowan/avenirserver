<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        
           
   <form id="kitchen" method="POST" action="Cheetah" style="position:center">
   <h1>Kitchen Survey Report</h1> 
       
       <p>Site ID:	<input type="text" name="site"></p>
     			
		Client:   <input type="checkbox" name="client" value="Tesco"> Tesco
		<input type="checkbox" name="client" value="M&B"> MB
		<input type="checkbox" name="client" value="JDW"> JDW
		<input type="checkbox" name="client" value="Whitbread"> Whitbread
		<input type="checkbox" name="client" value="Nandos"> Nando's
		<input type="checkbox" name="client" value="Marriot"> Marriot
		<input type="checkbox" name="client" value="Other"> Other<br>
		
		  <!--<p>Date:<input type="text" name="date"></p>-->	
		<p>Site Name:   <input type="text" name="site2"></p>
		<p>Address:     <input type="text" name="site3"></p>
		<p>Postcode:    <input type="text" name="site4"></p>
		<p>Site Contact:<input type="text" name="site5"></p>
		<p>Position:    <input type="text" name="site6"></p>
		<p>Contact No:  <input type="text" name="site7"></p>
		
		Parking Information<br>
		<input type="checkbox" name="parking" value="Free"> Free on-site parking
		<input type="checkbox" name="parking" value="None"> No on-site parking
		<input type="checkbox" name="parking" value="Local"> Local Pay parking available
		<input type="checkbox" name="parking" value="Servicedrop"> Service yard drop-off only
		<input type="checkbox" name="parking" value="Servicepark"> Service yard parking(by arngmnt)<br><br>
		
		 Extract Fan<br>
		<p>Fan Motor Rating: <input type="text" name="fan">
		(kw):                <input type="text" name="fan">
		Fan Location:        <input type="text" name="fan"></p>
		<p>If cannot read or clamp note why: <input type="text" name="fan"></p>
		<input type="checkbox" name="fan" value="415"> 415v/3-Phase
		<input type="checkbox" name="fan" value="230"> 230v/s-Phase
		<input type="checkbox" name="fan" value="ClassB"> Class B
		<input type="checkbox" name="fan" value="ClassF"> Class F
		<input type="checkbox" name="fan" value="Other"> Other
		
		<p>Inverter Protection Rating Required: <input type="checkbox" name="prot" value="inside"> Inside (IP54/55)
		<input type="checkbox" name="prot" value="outside"> Outside(IP20/21) + enclosure</p>
		<p>Local Isolator fitted to fan unit: <input type="checkbox" name="prot" value="yes"> Yes
		<input type="checkbox" name="prot" value="no"> No</p>
		Comments: <input style="width:80%" type="text" name="comment"><br><br>
		 
		Extract Fan 2 (if applicable)<br>
		<p>Fan Motor Rating: <input type="text" name="fan2">
		(kw):             <input type="text" name="fan2">
		Fan Location:     <input type="text" name="fan2"></p>
		<p>If cannot read or clamp note why: <input type="text" name="fan2"></p>
		<input type="checkbox" name="fan2" value="415"> 415v/3-Phase
		<input type="checkbox" name="fan2" value="230"> 230v/s-Phase
		<input type="checkbox" name="fan2" value="ClassB"> Class B
		<input type="checkbox" name="fan2" value="ClassF"> Class F
		<input type="checkbox" name="fan2" value="Other"> Other
		
		<p>Inverter Protection Rating Required: <input type="checkbox" name="prot2" value="inside"> Inside (IP54/55)
		<input type="checkbox" name="prot2" value="outside"> Outside(IP20/21) + enclosure</p>
		<p>Local Isolator fitted to fan unit: <input type="checkbox" name="prot2" value="yes"> Yes
		<input type="checkbox" name="prot2" value="no"> No</p>
		Comments: <input style="width:80%" type="text" name="comment2">
		
		Supply Fan<br>
		<p>Fan Motor Rating: <input type="text" name="fan3">
		(kw):             <input type="text" name="fan3">
		Fan Location:     <input type="text" name="fan3"></p>
		<p>If cannot read or clamp note why: <input type="text" name="fan3"></p>
		<input type="checkbox" name="fan3" value="415"> 415v/3-Phase
		<input type="checkbox" name="fan3" value="230"> 230v/s-Phase
		<input type="checkbox" name="fan3" value="ClassB"> Class B
		<input type="checkbox" name="fan3" value="ClassF"> Class F
		<input type="checkbox" name="fan3" value="Other"> Other
		
		<p>Inverter Protection Rating Required: <input type="checkbox" name="prot3" value="inside"> Inside (IP54/55)
		<input type="checkbox" name="prot3" value="outside"> Outside(IP20/21) + enclosure</p>
		<p>Local Isolator fitted to fan unit: <input type="checkbox" name="prot3" value="yes"> Yes
		<input type="checkbox" name="prot3" value="no"> No</p>
		<input type="checkbox" name="prot3" value="Gas"> Gas Heating
		<input type="checkbox" name="prot3" value="WaterH"> Water Heating
		<input type="checkbox" name="prot3" value="Heater"> Heater Battery
		<input type="checkbox" name="prot3" value="Coil"> Coil Cooling
		<input type="checkbox" name="prot3" value="WaterC"> Water Cooling
		<input type="checkbox" name="prot3" value="Other">  Other<br>
			
		Comments: <input style="width:80%" type="text" name="comment3"><br>
				
		Existing Speed Controls: <input type="checkbox" name="speed" value="Rotary"> Rotary 
		<input type="checkbox" name="speed" value="Inverter"> Inverter 
		<input type="text" name="speed1" > Other 
		<input type="checkbox" name="speed" value="none"> None
		
		<p>Ceiling Type:<input type="checkbox" name="type" > Push-up 
		<input type="checkbox" name="type" > Pull-out
		<input type="checkbox" name="type" > Solid(no hatch)
		<input type="checkbox" name="type" > Other 
		<input type="text" name="type" >  </p>
		
		<p>Ceiling Void:<input type="checkbox" name="void" > Ample   
		<input type="checkbox" name="void" > Limited
		<input type="checkbox" name="void" > Not Seen
		<input type="checkbox" name="void" > Other
		<input type="text" name="void" > </p>
		
		<p>Canopy Type:<input type="checkbox" name="canopy" > Single-wall  
		<input type="checkbox" name="canopy" > Double-island
		<input type="checkbox" name="canopy" > 2nd Single-wall
		<input type="checkbox" name="canopy" > 2nd Double-island
		<input type="checkbox" name="canopy" > Other
		<input type="text" name="canopy" > </p>
		
		<p>Number of Optics Required <input type="text" name="optics" >
		Number of Sensors Required <input type="text" name="sensors" ></p>
		
		Client Specifics<br>
		M and B<br>
		Spill Test: <input type="checkbox" name="spill" > Pass <input type="checkbox" name="spill" > Fail
		Working Gas: <input type="checkbox" name="gas" > Extract <input type="checkbox" name="spill" > Supply<br>
		Interlock:<br>
		Type: <input type="checkbox" name="tpe" > Pressure Switch <input type="checkbox" name="tpe" > Current Sensing
		Comments: <input type="text" name="comments" style="width:40%" ><br>
		
		Installation Specifics<br>
		
		Suitable for Installation: <input type="checkbox" name="inst" > Yes   <input type="checkbox" name="inst" > No*<br>
		Times of Access: Kitchen  <input type="text" name="kitchen" style="width:70%" ><br>
		Times of Access: Fans     <input type="text" name="kitchen" style="width:70%" ><br>
		
		<p>Cable run length between kitchen and fans: <input type="checkbox" name="cable" > Fans directly above kitchen
		<input type="checkbox" name="cable" > fans elsewhere <input type="text" name="cables" ></p>
		
		Contact details for time of install if different to those on form: <br>
		Name: <input type="text" name="cont1" style="width:70%" ><br>
		Tel No: <input type="text" name="cont2" style="width:70%" ><br>
		Email: <input type="text" name="cont3" style="width:70%" ><br>
		
		Asbestos Register Seen
		<input type="checkbox" name="asbes" > Yes 
		<input type="checkbox" name="asbes" > No
		<input type="checkbox" name="asbes" > No Obvious Asbestos
		<input type="checkbox" name="asbes" > Potential Asbestos Risk<br>
		Details: <input style="width:80%" type="text" name="comment3"><br>
		
		Is this site part of a shopping centre or shared complex?<br>
		<input type="checkbox" name="share" > Yes 
		<input type="checkbox" name="share" > No
		Name of complex: <input type="text" name="complex" >
		Contact: <input type="text" name="cont4" >
		Tel:     <input type="text" name="tel" ><br>
		Email:   <input type="text" name="email" >
		Other Information: <input style="width:80%" type="text" name="info"><br>
		
		If unsuitable, please list reasons: <input style="width:60%" type="text" name="unsuit"><br>
		
		
				
		Name of Surveyor: <input style="width:30%" type="text" name="sur">
		Signature:  <input style="width:30%" type="text" name="sig"><br>
		
		Client Name:  <input style="width:30%" type="text" name="client">
		Signature:  <input style="width:30%" type="text" name="csig"> 
				
		<input type="submit" value="Submit"> 
		 <a href="/Instagrim">Home</a><br><br><br><br>
      </form>  
    </div>
   
      </div>

    
    
    
     <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    
    
</body>
</html>