import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Calculate{
    
    Scanner sc = null;
    Output output = new Output();
    
    Calculate(){
        sc = new Scanner(System.in);
    }
    
    public static Shape do_calc(){
        return new Shape();
    }
    
    public int get_int_val() throws IOException{
        return sc.nextInt();
    }
    
    public double get_double_val() throws IOException{
        return sc.nextDouble();
    }
    
}
class Output{
    public void display(double volume){
        System.out.println(String.format("%.3f",volume));
    }    
}

class Shape{
    
    public int get_volume(int a){
        arePositive(a);
        return a*a*a;
    }
    
    public double get_volume(double r){
        arePositive(r);
        return Math.PI*Math.pow(r,3)*(2.0/3.0);
    }
    
    public int get_volume(int l, int b, int h){
        arePositive(l, b, h);
        return l*b*h;
    }
    
    public double get_volume(double r, double h){
        arePositive(r, h);
        return h*Math.PI*Math.pow(r,2);
    }
    
    private void arePositive(int ...iargs){
        for(int i: iargs){
            if(i <= 0){
                throw new NumberFormatException("All the values must be positive");
            }
        }
    }
    
    private void arePositive(double ...dargs){
        for(double d: dargs){
            if(Double.compare(d,0.0) <= 0){
                throw new NumberFormatException("All the values must be positive");
            }
        }
    }
}

public class CalculatingVolume {

 public static void main(String[] args) {
   DoNotTerminate.forbidExit();
   try {
    Calculate cal = new Calculate();
    int T = cal.get_int_val();
    while (T--> 0) {
     double volume = 0.0;
     int ch = cal.get_int_val();
     if (ch == 1) {
      int a = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(a);
     } else if (ch == 2) {
      int l = cal.get_int_val();
      int b = cal.get_int_val();
      int h = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(l, b, h);

     } else if (ch == 3) {
      double r = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r);

     } else if (ch == 4) {
      double r = cal.get_double_val();
      double h = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r, h);

     }
     cal.output.display(volume);
    }

   } catch (NumberFormatException e) {
    System.out.print(e);
   } catch (IOException e) {
    e.printStackTrace();
   } catch (DoNotTerminate.ExitTrappedException e) {
    System.out.println("Unsuccessful Termination!!");
   }


  } //end of main
} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {}

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}
