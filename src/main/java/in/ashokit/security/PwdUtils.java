package in.ashokit.security;

//import java.beans.Encoder;
import java.util.Base64;
import java.util.Base64.Encoder;


public class PwdUtils {
	public void roll(){
		
	}
public String encodePwd(String pwd) {
	Encoder encoder=Base64.getEncoder();
	byte[] encode=encoder.encode(pwd.getBytes());
	String encodedPwd=new String(encode);
	return encodedPwd;
	public void getDetais(){
		System.out.printlin("hello");
	}
	
}
}
