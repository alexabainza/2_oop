package Hashing; 

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMD5 {
    public static void main(String[] args) {
        String s = "aelx";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            byte[] messageDigest = md.digest(s.getBytes());
            
            BigInteger no = new BigInteger(1, messageDigest);
            
            String hashtext = no.toString(16);
            System.out.println("hash code: " + hashtext);  
        } 
        
        catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
    }
}
