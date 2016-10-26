
package testobject;


public class b extends a {
    
    public Object a7a (Object f){
        
        if( f instanceof a)
            ((a) f).any();
         if( f instanceof b)
            ((b) f).any();
         if( f instanceof c)
            ((c) f).any();
         else 
             System.out.println("unknwown");
        return f; 
        
    }
    public int u =8;

    /**
     *  
     */
    @Override
     public void any (){
        
        
        System.out.println("from b");
    }
    
}
