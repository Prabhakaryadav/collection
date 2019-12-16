import java.util.*;

public class Sorted_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sites = new TreeSet<>(); 
        sites.add("practice"); 
        sites.add("assign"); 
        sites.add("quiz"); 
        sites.add("code"); 
  
        System.out.println("Sorted Set: " + sites); 
        System.out.println("First: " + sites.first()); 
        System.out.println("Last: " + sites.last()); 
        SortedSet<String> beforeQuiz = sites.headSet("quiz"); 
        System.out.println(beforeQuiz); 
        
        SortedSet<String> afterCode = sites.tailSet("code"); 
        System.out.println(afterCode); 

	}

}
