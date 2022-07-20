package Emailvalidation;
import java.util.regex.*;    
import java.util.*;    
public class email{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("kanna@481.com");  
        emails.add("java@220.com");  
        emails.add("friends@1.com");  
        emails.add("Good@123.com");  
        emails.add("@yahoo.com");  
        emails.add("kanna#gmail.com");  
        String regex = "^(.+)@(.+)$";     
        Pattern pattern = Pattern.compile(regex);  
        for(String email : emails){  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}