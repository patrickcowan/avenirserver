package avenir.models;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import avenir.lib.AeSimpleSHA1;

/**
 *
 * @author Administrator
 */

public class User {
    Cluster cluster;
    public User(){
        
    }
    
    public boolean RegisterUser(String username, String Password, String Address, String first_name, String last_name, String company){
        AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
        String EncodedPassword=null;
        try {
            EncodedPassword= sha1handler.SHA1(Password);
        }catch (UnsupportedEncodingException | NoSuchAlgorithmException et){
            System.out.println("Can't check your password");
            return false;
        }
        Session session = cluster.connect("avenir");
        PreparedStatement ps = session.prepare("insert into userprofiles (login, password, address, company, first_name, last_name) Values(?,?,?,?,?,?)");
       
        BoundStatement boundStatement = new BoundStatement(ps);
        session.execute(boundStatement.bind(username, EncodedPassword, Address, first_name, last_name, company));
        
        return true;
    }
    
    
    public boolean CheetahUser(String user, String client, String site, String parking, String fan, String prot, String comment, String fan2, String comment2, String fan3, String prot3, String prot2, String comment3, String speed, String speed1, String canopy,
    		String sensors, String spill, String tpe, String comments, String inst, String cables, String cont1, String optics, String kitchen, String cable, String cont2, String cont3, String asbes, String share, String complex, String cont4, String tel,
    		String email, String info, String unsuit, String sur, String sig, String csig, String site2, String site3, String site4, String site5, String site6, String site7)
    {
        AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
       
        Session session = cluster.connect("avenir");
        PreparedStatement psCheet = session.prepare("insert into cheetahs (user, client, site, parking, fan, prot, comment, fan2, comment2, fan3, prot3, prot2, comment3, speed, speed1, canopy, sensors, spill, tpe, comments, inst, cables, cont1,"
        		+ " optics, kitchen, cable, cont2, cont3, asbes, share, complex, cont4, tel, email, info, unsuit, sur, sig, csig, site2, site3, site4, site5, site6, site7) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
       
        BoundStatement boundStatement = new BoundStatement(psCheet);
        session.execute(boundStatement.bind( user, client, site, parking, fan, prot, comment, fan2, comment2, fan3, prot3, prot2, comment3, speed, speed1, canopy,
        		sensors, spill, tpe, comments, inst, cables, cont1, optics, kitchen, cable, cont2, cont3, asbes, share, complex, cont4, tel,
				email, info, unsuit, sur, sig, csig, site2, site3, site4, site5, site6, site7));
        
        
        return true;
    }
    
    public boolean VOUser(String user, String surv, String date, String comp, String site, String sadd, String tob, String scn, String tele, String powerstar, String demand, String head, String HMW, String HMI, String GSM, String Bypass, String uvcont, String cowned,
    		String txman, String tran, String tap, String kv, String mpan, String supid, String totalmp, String fhalf, String ohalf, String mdem, String wside, String pfac, String type, String amps, String setto, String derate, String rest, String coup,
    		String outage, String reqd, String barrier, String isol, String renew, String isolat, String gen, String sitecond, String fav, String fitted,	String L1V, String L2V, String L3V, String L1A, String L2A, String L3A, String kva, String kW, String kWh, String lno, 
    		String logloc, String sread, String spotr1, String spotr2, String spotr3, String spotr4, String spotr5, String spotr6, String fitte, String metref, String dfn, String npc, String insd, String rdate, String meton, String metoff, String hfl, String sh, String DHW, 
    		String cate, String prohe, String hydra, String dcmotors, String other, String oth, String acunit, String mwv, String itflt, String ups, String comp2, String multi, String bat, String weld, String jmot, String survins, String crun, String wres, String mraar, 
    		String rest2, String accroute, String addinfo, String HVMAX, String reqsurv, String whyay, String fillHV, String nochv, String dochv, String cabLV, String noclv, String doclv)
    {
        AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
       
        Session session = cluster.connect("avenir");
        
        PreparedStatement psVo = session.prepare("insert into vo (user, surv, date, comp, site, sadd, tob, scn, tele, powerstar, demand, head, HMW, HMI, GSM, Bypass, uvcont, cowned, "
        		+ "txman, tran, tap, kv, mpan, supid, totalmp, fhalf, ohalf, mdem, wside, pfac, type, amps, setto, derate, rest, coup, outage, reqd, barrier, isol, renew, isolat,"
        		+ " gen, sitecond, fav,	fitted,	L1V, L2V, L3V, L1A, L2A, L3A, kva, kW, kWh, lno, logloc, sread, spotr1, spotr2, spotr3, spotr4, spotr5, spotr6, fitte, metref, dfn,"
        		+ " npc, insd, rdate, meton, metoff, hfl, sh, DHW, cate, prohe, hydra, dcmotors, other, oth, acunit, mwv, itflt, ups, comp2, multi, bat, weld, jmot, survins, crun,"
        		+ " wres, mraar, rest2, accroute, addinfo, HVMAX, reqsurv, whyay, fillHV, nochv, dochv, cabLV, noclv, doclv) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
        		+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
       
        BoundStatement boundStatement = new BoundStatement(psVo);
        session.execute(boundStatement.bind( user, surv, date, comp, site, sadd, tob, scn, tele, powerstar, demand, head, HMW, HMI, GSM, Bypass, uvcont, cowned,
				txman, tran, tap, kv, mpan, supid, totalmp, fhalf, ohalf, mdem, wside, pfac, type, amps, setto, derate, rest, coup,	outage, reqd, barrier, isol, 
				renew, isolat, gen, sitecond, fav,	fitted,	L1V, L2V, L3V, L1A, L2A, L3A, kva, kW, kWh, lno, logloc, sread, spotr1, spotr2, spotr3, spotr4, spotr5,
				spotr6, fitte, metref, dfn, npc, insd, rdate, meton, metoff, hfl, sh, DHW, cate, prohe, hydra, dcmotors, other, oth, acunit, mwv, itflt, ups, comp2,
				multi, bat, weld, jmot, survins, crun, wres, mraar, rest2, accroute, addinfo, HVMAX, reqsurv, whyay, fillHV, nochv, dochv, cabLV, noclv, doclv));
        
        return true;
    }
    
    
    public boolean LedUser(String user)
    {
    	AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
        
        Session session = cluster.connect("avenir");
        
        PreparedStatement psLed = session.prepare("insert into led (user) values (?)");
        
        BoundStatement boundStatement = new BoundStatement(psLed);
        session.execute(boundStatement.bind( user ));
        
    return true;
    }
    
    
    
    
    public boolean IsValidUser(String username, String Password){
        AeSimpleSHA1 sha1handler=  new AeSimpleSHA1();
        String EncodedPassword=null;
        try {
            EncodedPassword= sha1handler.SHA1(Password);
        }catch (UnsupportedEncodingException | NoSuchAlgorithmException et){
            System.out.println("Can't check your password");
            return false;
            
        }
        Session session = cluster.connect("avenir");
        PreparedStatement ps = session.prepare("select password from userprofiles where login =?");
        ResultSet rs = null;
        BoundStatement boundStatement = new BoundStatement(ps);
        rs = session.execute(boundStatement.bind(username));
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

    
}
