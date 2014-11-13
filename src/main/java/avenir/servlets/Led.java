package avenir.servlets;

import com.datastax.driver.core.Cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import avenir.lib.CassandraHosts;
import avenir.models.User;
import avenir.stores.LoggedIn;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "Cheetah", urlPatterns = {"/Cheetah"})
public class Led extends HttpServlet {
    Cluster cluster=null;
    public void init(ServletConfig config) throws ServletException {
        
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
    	
    	
    	HttpSession session=request.getSession();
        LoggedIn lg= (LoggedIn)session.getAttribute("LoggedIn");
    	String user="user";
        if (lg.getlogedin()){
            user=lg.getUsername();
        }
        
        String client=request.getParameter("client");
        
        
        User us=new User();
        us.setCluster(cluster);
		us.LedUser(user);
		
	response.sendRedirect("/Instagrim");	
    }
        
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}