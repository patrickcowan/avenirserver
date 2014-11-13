package avenir.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import avenir.lib.AeSimpleSHA1;
import avenir.lib.CassandraHosts;
import avenir.models.User;

import com.datastax.driver.core.Cluster;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@WebServlet("/test")

public class test extends HttpServlet {
    Cluster cluster=null;
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        cluster = CassandraHosts.getCluster();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String address=request.getParameter("address");
        String first_name=request.getParameter("first_name");
        String last_name=request.getParameter("last_name");
        String company=request.getParameter("company");
        String callback = request.getParameter("callback");
        
        Gson gson = new Gson();
		JsonObject myObj = new JsonObject();
        
        User us=new User();
        us.setCluster(cluster);
		us.RegisterUser(username, password, address, first_name, last_name, company);
		JsonElement signUpObj = gson.toJsonTree(us);
      
		
	response.sendRedirect("/Instagrim");
        
	 if (IsValidUser(username, password)) {
			myObj.addProperty("success", false);
		} else {

			RegisterUser(username, password);

			myObj.addProperty("success", true);
	
    }

	myObj.add("userInfo", signUpObj);
	if (callback != null) {
		System.out.println(callback + "(" + myObj.toString() + ");");
		System.out.println(callback + "(" + myObj.toString() + ");");
		System.out.println(myObj.toString());
	} else {
		
		System.out.println(myObj.toString());
		System.out.println(myObj.toString());
	}
	System.out.close();
}



public static String getMyStackTrace(Exception e) {

	StringWriter stringWriter = new StringWriter();
	PrintWriter printWriter = new PrintWriter(stringWriter, true);
	e.printStackTrace(printWriter);
	return stringWriter.toString();
}
 
    
    
    
    
    
    
    
    
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>





public boolean RegisterUser( String username, String Password){
	
	  if(username == null || Password ==null){
    	return false;
    }
	  
  AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
  String EncodedPassword=null;
  try {
      EncodedPassword= sha1handler.SHA1(Password);
  }catch (UnsupportedEncodingException | NoSuchAlgorithmException et){
      System.out.println("Can't check your password");
      return false;
  }
  Session session = cluster.connect("instagrim_DM");
  PreparedStatement ps = session.prepare("insert into userprofiles (first_name, login,password) Values(?,?,?) IF NOT EXISTS;");
 
  BoundStatement boundStatement = new BoundStatement(ps);
  session.execute( // this is where the query is executed
          boundStatement.bind( // here you are binding the 'boundStatement'
                  username,EncodedPassword));
  //We are assuming this always works.  Also a transaction would be good here !
  

  return true;
}

public String proPic(String username){
	String pic = "null";
  Session session = cluster.connect("instagrim_DM");
    PreparedStatement ps = session.prepare("select pic from userprofiles where login =?");
    ResultSet rs = null;
    BoundStatement boundStatement = new BoundStatement(ps);
    rs = session.execute(boundStatement.bind(username));                          
    if (rs.isExhausted()) {
        System.out.println("No last name found");
        return "";
    } else {
        for (Row row : rs) {                  
            pic = row.getString("pic");               
            }
    }   
return pic ;
}



public boolean IsValidUser(String username, String Password){
	
	if(username == null || Password == null){
  	return false;
  }
  
	
	
	
  AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
  String EncodedPassword=null;
     
  try {
      EncodedPassword= sha1handler.SHA1(Password);
  }catch (UnsupportedEncodingException | NoSuchAlgorithmException et){
      System.out.println("Can't check your password");
      return false;
  }
  Session session = cluster.connect("instagrim_DM");
  PreparedStatement ps = session.prepare("select password from userprofiles where login =?");
  ResultSet rs = null;
  BoundStatement boundStatement = new BoundStatement(ps);
  rs = session.execute( // this is where the query is executed
          boundStatement.bind( // here you are binding the 'boundStatement'
                  username));
  
  
  if (rs.isExhausted()) {
      System.out.println("No Images returned");
      return false;
  } else {
      for (Row row : rs) {
         
          String StoredPass = row.getString("password");
          if (StoredPass.compareTo(EncodedPassword) == 0)
              return true;
      }
  }


return false;  
}
 public void setCluster(Cluster cluster) {
  this.cluster = cluster;
}	

 
  public String ProfileDetails(String username){
  	Session session = cluster.connect("instagrim_DM");
  	 ResultSet rs = null;
  	 PreparedStatement ps = session.prepare("select first_name from userprofiles where login =?");
       BoundStatement boundStatement = new BoundStatement(ps);
       rs = session.execute( // this is where the query is executed
               boundStatement.bind( // here you are binding the 'boundStatement'
                       username));
       
       for (Row row : rs) {
           
           String fullname = row.getString("first_name");
           if (fullname != null)
               return fullname;
       }
       return null;
  }
  
  public String currentAbout(String username){
    	 Session session = cluster.connect("instagrim_DM");
    	 ResultSet rs = null;
    	 PreparedStatement ps = session.prepare("SELECT about_user FROM userprofiles WHERE login = ?");
    	 BoundStatement boundStatement = new BoundStatement(ps);
    	 rs = session.execute( // this is where the query is executed
              boundStatement.bind( // here you are binding the 'boundStatement'
                      username));
      for (Row row : rs) {
          
          String about = row.getString("about_user");
          if (about != null)
              return about;
      }
 	return null;
     }

 	public boolean updateAbout(String about, String username) {
    	 Session session = cluster.connect("instagrim_DM");
    	
    	 PreparedStatement ps = session.prepare("UPDATE userprofiles SET about_user = ? WHERE login = ?;");
    	 BoundStatement boundStatement = new BoundStatement(ps);
      session.execute( // this is where the query is executed
              boundStatement.bind( // here you are binding the 'boundStatement'
                      about, username));
      
      return true;
 		
 	}
 	
 	public String[] searchUser(String user){
 	 String ar[] = new String[2];
 	 
 	 Session session = cluster.connect("instagrim_DM");
 	 ResultSet rs = null;
 	 PreparedStatement ps = session.prepare("SELECT * FROM userprofiles WHERE login = ?;");
	 BoundStatement boundStatement = new BoundStatement(ps);
  rs = session.execute( // this is where the query is executed
          boundStatement.bind( // here you are binding the 'boundStatement'
                  user));
  
 
  
  for (Row row : rs) {
  	
  	 String about = row.getString("about_user");
       String name = row.getString("first_name");

      if (name != null)
          ar[0] = about;
          ar[1] = name;
          return ar;
  }
		return null;
 		
 	}
 	}










