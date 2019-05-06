package homeWorks;
import java.util.*;
public class StingOP {
	  
	  public static String lameDb(String db, String op,String id,String data)
	  {		  
	    String ret = "";
			  
			  
			  switch(op) {
			  case"add": 
			    if(data.length() > 0) {
				 ret = db+"#"+id+data;
				 }else {
					 ret = db;
				 }
				
				 break;
			  	
			  case"edit":
				 for(int i = 0; i < db.length(); i++) {
					 
					 int idxOfid = db.indexOf("#"+id);
					  int idxOfHash = db.indexOf("#"+id ) == -1? db.length()-1: db.indexOf("#"+id );
//					  if(idxOfHash ==(-1)) {
//						  idxOfHash = db.length()-1;
//					  }
					 ret = db.substring(0, idxOfid)+ id+ data+ db.substring(idxOfid+data.length());
				  }
				 break;
			  	case"delete":
			  		int idxId= db.indexOf(id);
			  		int idxHash = db.indexOf("#"+id);
			  		if(idxId ==0) {
			  			ret = db.substring(idxHash);
			  			break;
			  		}
			  		ret = db.substring(0, idxId)+db.substring(db.indexOf("#", idxHash+1));
				  break;
				  
				  
				  
				  
			  	case"none":
			  		ret = db;
			  		break;
			  		
			}
			  
			 return ret; 
		  }
		  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }
	  
	}


