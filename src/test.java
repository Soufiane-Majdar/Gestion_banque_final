import java.util.regex.*;

public class test {
    public static void main(String[] args) {

        String email="@kkd.com";

        //Regular Expression   
        String regex = "^(.+)@(.+)$";
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        System.out.println(email +" : "+ matcher.matches()+"\n");
    }
}
