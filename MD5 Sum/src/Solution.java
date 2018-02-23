import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
	public static String MD5Pass(String pass) throws NoSuchAlgorithmException {
	    MessageDigest m = MessageDigest.getInstance("MD5");
	    byte[] data = pass.getBytes(); 
	    m.update(data,0,data.length);
	    BigInteger i = new BigInteger(1,m.digest());
	    return String.format("%1$032X", i).toLowerCase();
	}
	public static void main(String[] args)
	{
	   Scanner in = new Scanner(System.in);
	   try
	   {
	   System.out.println(MD5Pass(in.nextLine()));
	   }
	   catch(NoSuchAlgorithmException algex)
	   {
		   System.out.println(algex.getMessage());		   
	   }
	   in.close();
	}

}
