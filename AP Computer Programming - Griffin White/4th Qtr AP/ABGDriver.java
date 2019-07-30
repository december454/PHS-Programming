/**
 * @(#)ABGDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/1
 */


public class ABGDriver {

    public static void main (String [] args)    	
    {
    	Alpha a1 = new Alpha();
    	
    	a1.m1();
    	System.out.println();
    	a1.m2();
    	System.out.println();
    	
    	Alpha a2 = new Beta();
    	
    	a2.m1();
    	System.out.println();
    	a2.m2();
    	System.out.println();
    	
    	Beta b1 = new Beta();
    	
    	b1.m2();
    	System.out.println();
    	
    	Alpha a3 = new Gamma();
    	
    	a3.m1();
    	System.out.println();
    	a3.m2();    	
    	System.out.println();
    }        
}