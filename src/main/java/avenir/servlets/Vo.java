
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
@WebServlet(name = "VO", urlPatterns = {"/VO"})
public class Vo extends HttpServlet {
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
        
        String surv=request.getParameter("surv");
        String date=request.getParameter("date");
        String comp=request.getParameter("comp");
        String site=request.getParameter("site");
        String sadd=request.getParameter("sadd");
        String tob=request.getParameter("tob");
        String scn=request.getParameter("scn");
        String tele=request.getParameter("tele");
        String powerstar=request.getParameter("powerstar");
        String demand=request.getParameter("demand");
        String head=request.getParameter("head");
        String HMW=request.getParameter("HMW");
        String HMI=request.getParameter("HMI");
        String GSM=request.getParameter("GSM");
        String Bypass=request.getParameter("Bypass");
        String uvcont=request.getParameter("uvcont");
        String cowned=request.getParameter("cowned");
        String txman=request.getParameter("txman");
        String tran=request.getParameter("tran");
        String tap=request.getParameter("tap");
        String kv=request.getParameter("kv");
        String mpan=request.getParameter("mpan");
        String supid=request.getParameter("supid");
        String totalmp=request.getParameter("totalmp");
        String fhalf=request.getParameter("fhalf");
        String ohalf=request.getParameter("ohalf");
        String mdem=request.getParameter("mdem");
        String wside=request.getParameter("wside");
        String pfac=request.getParameter("pfac");
        String type=request.getParameter("type");
        String amps=request.getParameter("amps");
        String setto=request.getParameter("setto");
        String derate=request.getParameter("derate");
        String rest=request.getParameter("rest");
        String coup=request.getParameter("coup");
        String outage=request.getParameter("outage");
        String reqd=request.getParameter("reqd");
        String barrier=request.getParameter("barrier");
        String isol=request.getParameter("isol");
        String renew=request.getParameter("renew");
        String isolat=request.getParameter("isolat");
        String gen=request.getParameter("gen");
        String sitecond=request.getParameter("sitecond");
        String fav=request.getParameter("fav");
        String fitted=request.getParameter("fitted");
        String L1V=request.getParameter("L1V");
        String L2V=request.getParameter("L2V");
        String L3V=request.getParameter("L3V");
        String L1A=request.getParameter("L1A");
        String L2A=request.getParameter("L2A");
        String L3A=request.getParameter("L3A");
        String kva=request.getParameter("kva");
        String kW=request.getParameter("kW");
        String kWh=request.getParameter("kWh");
        String lno=request.getParameter("lno");
        String logloc=request.getParameter("logloc");
        String sread=request.getParameter("sread");
        String spotr1=request.getParameter("spotr1");
        String spotr2=request.getParameter("spotr2");
        String spotr3=request.getParameter("spotr3");
        String spotr4=request.getParameter("spotr4");
        String spotr5=request.getParameter("spotr5");
        String spotr6=request.getParameter("spotr6");
        String fitte=request.getParameter("fitte");
        String metref=request.getParameter("metref");
        String dfn=request.getParameter("dfn");
        String npc=request.getParameter("npc");
        String insd=request.getParameter("insd");
        String rdate=request.getParameter("rdate");
        String meton=request.getParameter("meton");
        String metoff=request.getParameter("metoff");
        String hfl=request.getParameter("hfl");
        String sh=request.getParameter("sh");
        String DHW=request.getParameter("DHW");
        String cate=request.getParameter("cate");
        String prohe=request.getParameter("prohe");
        String hydra=request.getParameter("hydra");
        String dcmotors=request.getParameter("dcmotors");
        String other=request.getParameter("other");
        String oth=request.getParameter("oth");
        String acunit=request.getParameter("acunit");
        String mwv=request.getParameter("mwv");
        String itflt=request.getParameter("itflt");
        String ups=request.getParameter("ups");
        String comp2=request.getParameter("comp2");
        String multi=request.getParameter("multi");
        String bat=request.getParameter("bat");
        String weld=request.getParameter("weld");
        String jmot=request.getParameter("jmot");
        String survins=request.getParameter("survins");
        String crun=request.getParameter("crun");
        String wres=request.getParameter("wres");
        String mraar=request.getParameter("mraar");
        String rest2=request.getParameter("rest2");
        String accroute=request.getParameter("accroute");
        String addinfo=request.getParameter("addinfo");
        String HVMAX=request.getParameter("HVMAX");
        String reqsurv=request.getParameter("reqsurv");
        String whyay=request.getParameter("whyay");
        String fillHV=request.getParameter("fillHV");
        String nochv=request.getParameter("nochv");
        String dochv=request.getParameter("dochv");
        String cabLV=request.getParameter("cabLV");
        String noclv=request.getParameter("noclv");
        String doclv=request.getParameter("doclv");
        
        
        User us=new User();
        us.setCluster(cluster);
		us.VOUser(user, surv, date, comp, site, sadd, tob, scn, tele, powerstar, demand, head, HMW, HMI, GSM, Bypass, uvcont, cowned,
				txman, tran, tap, kv, mpan, supid, totalmp, fhalf, ohalf, mdem, wside, pfac, type, amps, setto, derate, rest, coup,
				outage, reqd, barrier, isol, renew, isolat, gen, sitecond, fav,	fitted,	L1V, L2V, L3V, L1A, L2A, L3A, kva, kW, kWh,
				lno, logloc, sread, spotr1, spotr2, spotr3, spotr4, spotr5, spotr6, fitte, metref, dfn, npc, insd, rdate, meton, metoff,
				hfl, sh, DHW, cate, prohe, hydra, dcmotors, other, oth, acunit, mwv, itflt, ups, comp2, multi, bat, weld, jmot, survins,
				crun, wres, mraar, rest2, accroute, addinfo, HVMAX, reqsurv, whyay, fillHV, nochv, dochv, cabLV, noclv, doclv);
		
		response.sendRedirect("/Instagrim");
        	
	
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

}
