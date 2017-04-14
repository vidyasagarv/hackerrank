import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;
import static java.lang.System.out;

class Prime{
    void checkPrime(int ...args){
        for(int i = 0; i < args.length; ++i){
            if(isPrime(args[i])){
                out.print(args[i]+" ");
            }
        }
        out.println();
    }
    
    boolean isPrime(int n){
        if(n >= 0 && n < 2){
            return false;
        }
        if( n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}

public class PrimeChecker {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}