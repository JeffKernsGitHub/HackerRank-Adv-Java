import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
	public static String SHA256Pass(String pass)
    {
		try
		{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(pass.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++)
			{
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
            }
        return hexString.toString();
		}
		catch(Exception ex)
		{
			throw new RuntimeException(ex);
		}
	}
	public static void main(String[] args)
	{
	   Scanner in = new Scanner(System.in);
	   System.out.println(SHA256Pass(in.nextLine()));
	   in.close();
	}
}
