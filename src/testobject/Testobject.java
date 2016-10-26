
package testobject;

public class Testobject {

    
    public static void main(String[] args) {
        a one = new a();
        b two = new b();
        two.a7a(one);
        two.a7a(two);
         a three = (a)(two.a7a(two));
        three.any(); 
        a four = (b)(two.a7a(two));
      System.out.println ( four.getClass().getName());
         
    }
    
}
