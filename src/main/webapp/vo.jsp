<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="format-detection" content="telephone=no" />
<meta name="viewport" content="user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, height=device-height, target-densitydpi=device-dpi" />
<script type="text/javascript" src="js/cordova.js"></script>
<script type="text/javascript" src="spec/lib/index.js"></script>    
  
<title>VO</title>
       
        
</head>
<body>


<div class="VO">
         
           
   <form id="vo" method="POST" action="VO" style="width:100%;top:1%;position:absolute">
      <h1>Powerstar Sheet</h1> 
       
    	<p>
    	Survey by:<input type="text" name="surv">
    	Date:<input type="text" name="date"></p>		
		Company:<input type="text" name="comp">
		Site:<input type="text" name="site"><br><br>
		Site Address:<input type="text" name="sadd"><br>
		Type of Business<input type="text" name="tob"><br>
		Site Contact: Name:<input type="text" name="scn">
		Tele:<input type="text" name="tele"><br>
		
		Powerstar:
		 <select name="powerstar">
		    <option value="?">?</option>
  			<option value="FIXED">FIXED</option>
  			<option value="MAX">MAX</option>
 			<option value="HV MAX">HV MAX</option>
		</select>
		
		&nbsp;&nbsp;&nbsp; Matching Demand:
		 <select name="demand">
		    <option value="?">?</option>
  			<option value="Y">Y</option>
  			<option value="N">N</option>
		</select>
		
		Headroom:<input type="text" name="head">%<br>
		
		HMW:
		 <select name="HMW">
		    <option value="?">?</option>
  			<option value="Y">Y</option>
  			<option value="N">N</option>
		</select>
		
		HMI:
		 <select name="HMI">
		    <option value="?">?</option>
  			<option value="Y">Y</option>
  			<option value="N">N</option>
		</select>
		
		GSM:
		 <select name="GSM">
		    <option value="?">?</option>
  			<option value="Y">Y</option>
  			<option value="N">N</option>
		</select>
		
		Bypass:
		 <select name="Bypass">
		    <option value="?">?</option>
  			<option value="N">N</option>
  			<option value="BBM">BBM</option>
  			<option value="MBB">MBB</option>
		</select>
		
		UV controller:
		<select name="uvcont">
			<option value="N">N</option>
			<option value="Auto">Auto</option>
			<option value="Manual">Manual</option>
			<option value="?">?</option>
		</select><br>
		
		Tx client owned:
		<select name="cowned">
			<option value="Y">Y</option>
			<option value="N">N</option>
			<option value="n/a">n/a</option>
		</select>
		(If NO or n/a go to next section)
		
		Tx man year:<input type="text" name="txman"><br>
		
		Transformer size:<input type="text" name="tran">kVA
		Transformer tapping:<input type="text" name="tap">%
		HV Tx primary voltage: <input type="text" name="kv">kV<br>
		
		Supply information<br>
		No. of Supplies per MPAN: <input type="text" name="mpan">
		Supply ID(i.e. TX1 DB1, etc)<input type="text" name="supid">
		% of Total load of MPAN <input type="text" name="totalmp">%<br>
		Meter no. / MPAN Ref <input type="text" name="fhalf">/<input type="text" name="ohalf">
		
		Max demand <input type="text" name="mdem">kVA kW<br>
		
		Metered on which side?
		<select name="wside">
			<option value="HV">HV</option>
			<option value="LV">LV</option>
		</select>
		
		Power Factor <input type="text" name="pfac"><br>
		
		ISOLATOR
		Type <input type="text" name="type"><br>
		
		Size(Amps)<input type="text" name="amps">A
		Set to<input type="text" name="setto">A %
		Can derate to<input type="text" name="derate">A %<br>
		
		Space/access Restrictions?
		<input type="checkbox" name="rest" value="Y"> Y
		<input type="checkbox" name="rest" value="N"> N 
		
		Next largest outgoing circuit protective device after isolator<input type="text" name="iso">A<br>
		
		Interlock/Bus Coupler
		<input type="checkbox" name="coup" value="Y"> Y
		<input type="checkbox" name="coup" value="N"> N
		
		Supply Auth.outage
		<input type="checkbox" name="outage" value="Y"> Y
		<input type="checkbox" name="outage" value="N"> N<br>
		
		GRP req'd
		<input type="checkbox" name="reqd" value="Y"> Y
		<input type="checkbox" name="reqd" value="N"> N
		
		Point of Isolation
		<input type="checkbox" name="isol" value="HV"> HV
		<input type="checkbox" name="isol" value="LV"> LV
		
		Renewable(e.g. CHP, PV)<input type="text" name="renew"> kVA kWe<br>
		
		Impact Barrier req'd
		<input type="checkbox" name="barrier" value="Y"> Y
		<input type="checkbox" name="barrier" value="N"> N
				
		Isolator req'd
		<input type="checkbox" name="isolat" value="Y"> Y
		<input type="checkbox" name="isolat" value="N"> N
		
		Standby Gen<input type="text" name="gen"> kVA<br>
		
		Site conditions (v dusty / damp, etc) <input type="text" name="sitecond">
		
		Fresh air ventilation <input type="text" name="fav"><br>
		
		Sub meters   Fitted <input type="checkbox" name="fitted" value="Y"> Y
		                    <input type="checkbox" name="fitted" value="N"> N (if NO go to next section)<br>
		              
		                    
		L1V <input type="text" name="L1V">
		L2V <input type="text" name="L2V">
		L3V <input type="text" name="L3V">
		L1A <input type="text" name="L1A">
		L2A <input type="text" name="L2A">
		L2A <input type="text" name="L3A"><br>
		
		MD kVA <input type="text" name="kva">
		MD kW<input type="text" name="kW">
		kWh<input type="text" name="kWh"><br>
		
		Logger<br>
		Logger No. <input type="text" name="lno">
		Logger Location <input type="text" name="logloc">
		Spot reading <input type="text" name="sread">V<br>
		
		Spot readings <input type="text" name="spotr1">V
		<input type="text" name="spotr2">V
		<input type="text" name="spotr3">V
		<input type="text" name="spotr4">V
		<input type="text" name="spotr5">V
		<input type="text" name="spotr6">V<br>
		
		Metrel
		Fitted
		<input type="checkbox" name="fitte" value="Y"> Y
		<input type="checkbox" name="fitte" value="N"> N (If NO go to next section)<br>
		
		Metrel ref. <input type="text" name="metref">
		Downloaded file name <input type="text" name="dfn"><br>
		No. Parallel cables <input type="text" name="npc">
		Install date <input type="text" name="insd">
		Remove date <input type="text" name="rdate"><br>
		Metrel on(total kWh)<input type="text" name="meton">
		Metrel off(total kWh)<input type="text" name="metoff"><br>
		
		Non-Eligible Load Breakdown
		<input type="text" name="hfl">%  1 - High frequency lighting (T5 or T8)               <input type="text" name="acunit">%  4 - A/C units - inverter<br>
		<input type="text" name="sh">%  2 - Space heating (electric)                          <input type="text" name="mwv">%  4 - Motors with VSD<br>
		<input type="text" name="DHW">%  2 - DHW (inc. immersion, coffee machines + kettles)  <input type="text" name="itflt">%  5 - IT - FLT screens<br>
		<input type="text" name="cate">%  2 - Catering (electric heating)                     <input type="text" name="ups">%  5 - UPS<br>
		<input type="text" name="prohe">%  2 - Process heating                                <input type="text" name="comp2">%  6 - Compressors<br>
		<input type="text" name="hydra">%  3 - Hydraulic lift motors                          <input type="text" name="multi">%  6 - Multistage Chiller/compressor<br>
		<input type="text" name="dcmotors">%  3 - DC motors                                   <input type="text" name="bat">%  6 - Battery chargers (industrial)<br>
		<input type="text" name="other">%  6 - Other: <input type="text" name="oth">          <input type="text" name="weld">%  6 - Welding machines<br>
		
		Lift motors / 3ph 440V motors: <input type="text" name="jmot"><br>
		
		Install Survey req'd <input type="checkbox" name="survins" value="Y"> Y
		<input type="checkbox" name="survins" value="N"> N
		Why?: <input type="text" name="survins" value="?"><br>
		
		Cable run (if more than 10m) <input type="text" name="crun"> m
		Weight restriction of <input type="text" name="wres">kg<br>
		Minimum restriction along access route <input type="text" name="mraar"> mm
		Restriction is:
		<select name="rest2">
			<option value="Width">Width</option>
			<option value="Height">Height</option>
			<option value="Tpoint">Turning point</option>
		</select><br>
		
		ACCESS ROUTE:<input type="text" name="accroute"><br>
		ADDITIONAL INFO:<input type="text" name="addinfo"><br>
		
		HV MAX info    This section is only applicable if HV MAX survey required: <input type="checkbox" name="HVMAX" value="Y"> Y <input type="checkbox" name="HVMAX" value="N"> N<br>
		
		Install Survey req'd <input type="checkbox" name="reqsurv" value="Y"> Y <input type="checkbox" name="reqsurv" value="N"> N Why? <input type="text" name="whyay"><br>
		
		Cable box filled HV <input type="checkbox" name="fillHV" value="Y"> Y <input type="checkbox" name="fillHV" value="N"> N<br>
		No. of cables <input type="text" name="nochv"><br>
		Diameter of cables<input type="text" name="dochv"><br>
		
		Cables box filled LV <input type="checkbox" name="cabLV" value="Y"> Y <input type="checkbox" name="cabLV" value="N"> N<br>
		No. of cables <input type="text" name="noclv"><br>
		Diameter of cables<input type="text" name="doclv"><br>
		
		
		 <a href="/Instagrim">Home</a>
		 <input type="submit" value="VO"> 
		</form>
          
           
    </div>
        
           
   
</body>
</html>