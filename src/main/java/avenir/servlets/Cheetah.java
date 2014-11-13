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
public class Cheetah extends HttpServlet {
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
        String site=request.getParameter("site");
        String parking=request.getParameter("parking");
        String fan=request.getParameter("fan");
        String prot=request.getParameter("prot");
        String comment=request.getParameter("comment");
        String fan2=request.getParameter("fan2");
        String comment2=request.getParameter("comment2");
        String fan3=request.getParameter("fan3");
        String prot3=request.getParameter("prot3");
        String prot2=request.getParameter("prot2");
        String comment3=request.getParameter("comment3");
        String speed=request.getParameter("speed");
        String speed1=request.getParameter("speed1");
        String canopy=request.getParameter("canopy");
        String sensors=request.getParameter("sensors");
        String spill=request.getParameter("spill");
        String tpe=request.getParameter("tpe");
        String comments=request.getParameter("comments");
        String inst=request.getParameter("inst");
        String cables=request.getParameter("cables");
        String cont1=request.getParameter("cont1");
        String optics=request.getParameter("optics");
        String kitchen=request.getParameter("kitchen");
        String cable=request.getParameter("cable");
        String cont2=request.getParameter("cont2");
        String cont3=request.getParameter("cont3");
        String asbes=request.getParameter("asbes");
        String share=request.getParameter("share");
        String complex=request.getParameter("complex");
        String cont4=request.getParameter("cont4");
        String tel=request.getParameter("tel");
        String email=request.getParameter("email");
        String info=request.getParameter("info");
        String unsuit=request.getParameter("unsuit");
        String sur=request.getParameter("sur");
        String sig=request.getParameter("sig");
        String csig=request.getParameter("csig");
        String site2=request.getParameter("site2");
        String site3=request.getParameter("site3");
        String site4=request.getParameter("site4");
        String site5=request.getParameter("site5");
        String site6=request.getParameter("site6");
        String site7=request.getParameter("site7");
        
        User us=new User();
        us.setCluster(cluster);
		us.CheetahUser(user, client, site, parking, fan, prot, comment, fan2, comment2, fan3, prot3, prot2, comment3, speed, speed1, canopy,
				sensors, spill, tpe, comments, inst, cables, cont1, optics, kitchen, cable, cont2, cont3, asbes, share, complex, cont4, tel,
				email, info, unsuit, sur, sig, csig, site2, site3, site4, site5, site6, site7);
		
	response.sendRedirect("/Instagrim");	
    }
        
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}