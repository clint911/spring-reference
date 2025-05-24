package collections;
import java.util.*; 

public class Collections {
 /** Prints the contents of a Collection */
 private static void print(Collection c) {
    Iterator iter = c.iterator(); 
    while (iter.hasNext()) {
        Object o = iter.next(); 
        System.out.println(o);
    }
 }   

 public static void main(String[] args) {
    Collection c = new ArrayList(); 
    c.add("One");
    c.add("Two");
    print(c); 
    System.out.println("");

    Set set = new HashSet(c); 
    set.add("Three");
    set.add("Two"); 
    print(set); 
 }
}
