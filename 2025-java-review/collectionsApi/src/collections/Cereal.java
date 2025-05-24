package collections;
/** A good example of natural ordering in some collections */
public class Cereal implements Comparable<Cereal>{
    private String name; 
    private double price; 

    public String getName(){
        return this.name; 
    }
    public double getPrice(){
        return this.price;
    }
    public int compareTo(Cereal c2) {
        return this.getName().compareTo(c2.getName());
    }

    public boolean equals(Object o) {
        if (o instanceof Cereal) {
            Cereal other = (Cereal) 0; 
            return this.getName().equals(other.getName());
        }
        return false; 
    }

    public int hashCode() {
        return this.getName().hashCode();
    }
    
}
