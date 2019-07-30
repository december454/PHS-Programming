/**
 * @(#)BarnYardDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/9
 */


public class BarnYardDriver {

    public static void main (String [] args) 
    {
//    	Animal a1 = new Animal();
//    	Mammal m1 = new Mammal();
    	
    	Animal a2 = new Dog ();
    	Animal a3 = new Cow ();
    	
    	Mammal m2 = new Dog();
    	Mammal m3 = new Cow();
    	
    	Dog d1 = new Dog();
    	Cow c1 = new Cow();
    	
    	Animal a4 = new Sparrow();
    	Animal a5 = new Duck();
    	
    	Bird b1 = new Sparrow();
    	Bird b2 = new Duck();
    	
    	Sparrow s1 = new Sparrow();
    	Duck d2 = new Duck();
    	
    	System.out.println (s1.sing());
    	System.out.println(s1.fly());
    	System.out.println (d2.fly());
    	System.out.println (d2.swim());
    	System.out.println (s1.speak());
    	System.out.println (d2.speak());
    	
    	//a2 can only do animal things
    	System.out.println (a2.speak());
    	System.out.println (m2.shed());
//    	System.out.println (a2.fetch());
//    	System.out.println (d2.fetch());
    	
//    	System.out.pintln (a3.speak());
    	System.out.println (m3.shed());
    	System.out.println (c1.milk());
    	
    	
    }
    
    
}