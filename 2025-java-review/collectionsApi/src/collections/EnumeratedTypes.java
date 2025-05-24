package collections;
import java.util.*; 

public class EnumeratedTypes {

    private enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY } 

    private static String inSwahili (Day day) {
        switch(day) {
            case SUNDAY: 
                return "Jumapili"; 
            case MONDAY: 
                return "Jumatatu"; 
            case TUESDAY: 
                return "Jumanne";
            case WEDNESDAY: 
                return "Jumatano"; 
            case THURSDAY: 
                return "Alhamisi"; 
            case FRIDAY: 
                return "Ijumaa"; 
            case SATURDAY:
                return "Jumamosi";
            default: 
                String s = "Unknown day: " + day; 
                throw new IllegalArgumentException(s);
        }
    }

    public static void main(String[] args) {
        /*
         * instantiating a concrete class (TreeSet), and then referring to that instance through an interface type (SortedSet
         */
        SortedSet<Day> set = new TreeSet<Day>(); 
        for (Day day : set) {
            System.out.println(inSwahili(day) + " ");
        }
        System.out.println("");
    }
}
