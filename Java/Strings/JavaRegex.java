import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
	// Ip address octet range 0-255
    String z255 = "(\\d{1,2}|[0-1]\\d{2}|2[0-4]\\d|2[5][0-5])";
    String pattern = z255 + "." + z255 + "." + z255 + "." + z255;
}