import java.util.HashMap;

public class IDandPasswords {
 HashMap<String, String> logininfo = new HashMap<String,String>();
 
 IDandPasswords(){
 logininfo.put("Emma", "0606");
 logininfo.put("Oviosa", "Password");
 logininfo.put("Bro", "1234");
 }
 
 protected HashMap getLoginInfo()
 {
	 return logininfo;
 }
 
}
