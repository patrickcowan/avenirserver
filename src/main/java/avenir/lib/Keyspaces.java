package avenir.lib;

import java.util.ArrayList;
import java.util.List;

import com.datastax.driver.core.*;

public final class Keyspaces {

    public Keyspaces() {

    }

    public static void SetUpKeySpaces(Cluster c) {
        try {
           
            String createkeyspace = "create keyspace if not exists avenir  WITH replication = {'class':'SimpleStrategy', 'replication_factor':1}";
            String CreatePicTable = "CREATE TABLE if not exists avenir.Pics ("
                    + " 	user varchar,"
                    + " 	picid uuid, "
                    + " 	interaction_time timestamp,"
                    + " 	title varchar,"
                    + " 	image blob,"
                    + " 	thumb blob,"
                    + " 	processed blob,"
                    + " 	imagelength int,"
                    + " 	thumblength int,"
                    + "  	processedlength int,"
                    + " 	type  varchar,"
                    + " 	name  varchar,"
                    + " 	PRIMARY KEY (picid)"
                    + "		)";
            
            String Createuserpiclist = "CREATE TABLE if not exists avenir.userpiclist (\n"
                    + "		picid uuid,					\n"
                    + "		user varchar,				\n"
                    + "		pic_added timestamp,		\n"
                    + "		PRIMARY KEY (user,pic_added)\n"
                    + "		) WITH CLUSTERING ORDER BY (pic_added desc);";
            
            String CreateAddressType = "CREATE TABLE if not exists avenir.address (\n"
            		+ "     picid uuid, 			\n"
            		+ "     PRIMARY KEY (uuid), 	\n"
                    + "     street text,			\n"
                    + "     city text,				\n"
                    + "     zip int					\n"
                    + "     );";
            
            String CreateCheetah = "CREATE TABLE if not exists avenir.cheetahs (\n"
            		+ "     PRIMARY KEY (user), 	\n"
            		+ "     user varchar, 			\n"
            		+ "     sheet_added timestamp, 	\n"
            		+ "     client text,			\n"
                    + "     site text,				\n"
                    + "		parking text, 			\n"
                    + "		fan text, 				\n"
                    + "		prot text, 				\n"
                    + "		comment text, 			\n"
                    + "		fan2 text, 				\n"
                    + "		prot2 text, 			\n"
                    + "		comment2 text, 			\n"
                    + "		fan3 text, 				\n"
                    + "		prot3 text, 			\n"
                    + "		comment3 text, 			\n"
                    + "		speed text, 			\n"
                    + "		speed1 text, 			\n"
                    + "		canopy text, 			\n"
                    + "		optics text, 			\n"
                    + "		sensors text, 			\n"
                    + "		spill text, 			\n"
                    + "		tpe text, 				\n"
                    + "		comments text, 			\n"
                    + "		inst text, 				\n"
                    + "		kitchen text, 			\n"
                    + "		cable text, 			\n"
                    + "		cables text, 			\n"
                    + "     cont1 text, 			\n"
                    + "     cont2 text, 			\n"
                    + "     cont3 text, 			\n"
                    + "     asbes text, 			\n"
                    + "     share text, 			\n"
                    + "     complex text, 			\n"
                    + "     cont4 text, 			\n"
                    + "     tel text, 				\n"
                    + "     email text, 			\n"
                    + "     info text, 				\n"
                    + "     unsuit text, 			\n"
                    + "     sur text, 				\n"
                    + "     sig text, 				\n"
                    + "     site2 text,             \n"
                    + "     site3 text,             \n"
                    + "     site4 text,             \n"
                    + "     site5 text,             \n"
                    + "     site6 text,             \n"
                    + "     site7 text,             \n"
                    + "     csig text,  			\n"
                    + "     admin boolean			\n"
            		+ "  	);";
            
            String CreateVo = "CREATE TABLE if not exists avenir.vo (\n"
            		+ "     PRIMARY KEY (user), \n"
            		+ "     user varchar, 		\n"
            		+ "     surv text,  		\n"
            		+ "     date text,  		\n"
            		+ "     comp text,  		\n"
            		+ "     site text,  		\n"
            		+ "     sadd text,  		\n"
            		+ "     tob text,  			\n"
            		+ "     scn text,  			\n"
            		+ "     tele text,   		\n"
            		+ "     powerstar text,   	\n"
            		+ "     demand text,   		\n"
            		+ "     head text,   		\n"
            		+ "     HMW text,   		\n"
            		+ "     HMI text,   		\n"
            		+ "     GSM text,   		\n"
            		+ "     Bypass text,   		\n"
            		+ "     uvcont text,   		\n"
            		+ "     cowned text,   		\n"
            		+ "     txman text,   		\n"
            		+ "     tran text,   		\n"
            		+ "     tap text,   		\n"
            		+ "     kv text,   			\n"
            		+ "     mpan text,   		\n"
            		+ "     supid text,   		\n"
            		+ "     totalmp text,  		\n"
            		+ "     fhalf text,   		\n"
            		+ "     ohalf text,   		\n"
            		+ "     mdem text,   		\n"
            		+ "     wside text,  		\n"
            		+ "     pfac text,   		\n"
            		+ "     type text,  		\n"
            		+ "     amps text,   		\n"
            		+ "     setto text,   		\n"
            		+ "     derate text,   		\n"
            		+ "     rest text,   		\n"
            		+ "     coup text,   		\n"
            		+ "     outage text,   		\n"
            		+ "     reqd text,   		\n"
            		+ "     barrier text,   	\n"
            		+ "     isol text,   		\n"
            		+ "     renew text,   		\n"
            		+ "     isolat text,   		\n"
            		+ "     gen text,   		\n"
            		+ "     sitecond text, 		\n"
            		+ "     fav text,   		\n"
            		+ "     fitted text,   		\n"
            		+ "     L1V text,   		\n"
            		+ "     L2V text,   		\n"
            		+ "     L3V text,   		\n"
            		+ "     L1A text,   		\n"
            		+ "     L2A text,   		\n"
            		+ "     L3A text,   		\n"
            		+ "     kva text,   		\n"
            		+ "     kW text,   			\n"
            		+ "     kWh text,   		\n"
            		+ "     lno text,   		\n"
            		+ "     logloc text,   		\n"
            		+ "     sread text,   		\n"
            		+ "     spotr1 text,   		\n"
            		+ "     spotr2 text,   		\n"
            		+ "     spotr3 text,   		\n"
            		+ "     spotr4 text,   		\n"
            		+ "     spotr5 text,   		\n"
            		+ "     spotr6 text,   		\n"
            		+ "     fitte text,   		\n"
            		+ "     metref text,   		\n"
            		+ "     dfn text,   		\n"
            		+ "     npc text,   		\n"
            		+ "     insd text,   		\n"
            		+ "     rdate text,   		\n"
            		+ "     meton text,   		\n"
            		+ "     metoff text,   		\n"
            		+ "     hfl text,   		\n"
            		+ "     sh text,   			\n"
            		+ "     DHW text,   		\n"
            		+ "     cate text,   		\n"
            		+ "     prohe text,   		\n"
            		+ "     hydra text,   		\n"
            		+ "     dcmotors text,   	\n"
            		+ "     other text,   		\n"
            		+ "     oth text,   		\n"
            		+ "     acunit text,   		\n"
            		+ "     mwv text,   		\n"
            		+ "     itflt text,   		\n"
            		+ "     ups text,   		\n"
            		+ "     comp2 text,   		\n"
            		+ "     multi text,   		\n"
            		+ "     bat text,   		\n"
            		+ "     weld text,   		\n"
            		+ "     jmot text,   		\n"
            		+ "     survins text,   	\n"
            		+ "     crun text,   		\n"
            		+ "     wres text,   		\n"
            		+ "     mraar text,   		\n"
            		+ "     rest2 text,   		\n"
            		+ "     accroute text,   	\n"
            		+ "     addinfo text,   	\n"
            		+ "     HVMAX text,   		\n"
            		+ "     reqsurv text,   	\n"
            		+ "     whyay text,   		\n"
            		+ "     fillHV text,   		\n"
            		+ "     nochv text,   		\n"
            		+ "     dochv text,   		\n"
            		+ "     cabLV text,   		\n"
            		+ "     noclv text,   		\n"
            		+ "     doclv text   		\n"
            		+ "     );";
            
            String CreateLed = "CREATE TABLE if not exists avenir.led( \n"
            		+ "   	PRIMARY KEY (user), \n"
            		+ "     user varchar, 		\n"
            		+ "   	test text, 			\n"
            		+ "   	led varchar 		\n"
            		+ "   	);";
                               		
                        	
            String CreateUserProfile = "CREATE TABLE if not exists avenir.userprofiles (\n"
                    + "     login text PRIMARY KEY,	\n"
                    + "     password text,			\n"
                    + "     first_name text,		\n"
                    + "     last_name text,			\n"
                    + "     address text, 			\n"
                    + "     company text 			\n"
                    + "  	);";
            
            Session session = c.connect();
            try {
                PreparedStatement statement = session
                        .prepare(createkeyspace);
                BoundStatement boundStatement = new BoundStatement(
                        statement);
                ResultSet rs = session
                        .execute(boundStatement);
                System.out.println("created avenir ");
            } catch (Exception et) {
                System.out.println("Can't create avenir " + et);
            }

            //now add some column families 
            System.out.println("" + CreatePicTable);

            try {
                SimpleStatement cqlQuery = new SimpleStatement(CreatePicTable);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create tweet table " + et);
            }
            System.out.println("" + Createuserpiclist);

            try {
                SimpleStatement cqlQuery = new SimpleStatement(Createuserpiclist);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create user pic list table " + et);
            }
            System.out.println("" + CreateCheetah);
            
            try {
                SimpleStatement cqlQuery = new SimpleStatement(CreateCheetah);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create user pic list table " + et);
            }
            System.out.println("Cant create address type" + CreateAddressType);
            
                      
            try {
                SimpleStatement cqlQuery = new SimpleStatement(CreateAddressType);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create Address type " + et);
            }
            System.out.println("" + CreateUserProfile);
            
            try {
                SimpleStatement cqlQuery = new SimpleStatement(CreateUserProfile);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create User Profile " + et);
            }
            System.out.println("" + CreateLed);
            
            try {
                SimpleStatement cqlQuery = new SimpleStatement(CreateLed);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create User Profile " + et);
            }
            System.out.println("" + CreateVo);
            
            try {
                SimpleStatement cqlQuery = new SimpleStatement(CreateVo);
                session.execute(cqlQuery);
            } catch (Exception et) {
                System.out.println("Can't create User Profile " + et);
            }
            	
            session.close();

        } catch (Exception et) {
            System.out.println("Other keyspace or column definition error" + et);
        }

    }
}
