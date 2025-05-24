package collections;
import java.util.*; 

public class Farm {
    private static void print(Map<String, Animal> map) 
        {
            for (String key : map.keySet()) {
                Animal value = map.get(key); 
                String s = key + " -> " + value; 
                System.out.println(s);
            }
        }

        public static void main(String[] args) {
            Map<String, Animal> farm = new HashMap<>();

            farm.put("Old MacDonals", new Human("Old MacDonals")); 
            farm.put("Clyde", new Sheep("Clyde")); 

            print(farm);
        }
        
}
