package Task5.Custom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Custom{
public static void main(String args[]){
    HashSet<String> h=new LinkedHashSet<String>();
    System.out.println("Initialization of Elements in List");
    h.add("A");
    h.add("B");
    h.add("C");
    h.add("D");
    h.add("E");
    h.add("F");
    h.add("G");
    h.add("H");
    h.add("I");
    h.add("J");
  System.out.println(h);
  System.out.println(" ");
  System.out.println("Fetching whether element is present in list or not:");
  System.out.println("             List contains A -:  "+h.contains("A"));
  System.out.println(" ");
  System.out.println("Removing B and C from list:");
  h.remove("B");
  h.remove("C");
  System.out.println("Printing iterative list after removing elements :");
  Iterator<String> i=h.iterator();
  while(i.hasNext())
      System.out.println(i.next());
  System.out.println(" ");
  h.add("Last element");
  System.out.println("after adding another element to the list:"+h);
  
    
}
}

