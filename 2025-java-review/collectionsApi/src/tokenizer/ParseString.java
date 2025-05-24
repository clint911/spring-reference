import java.util.*; 

class ParseString {
    public static void main(String[] args){
        String string = args[0]; 
        String delimit = args[1]; 
        StringTokenizer st; 
        st = new StringTokenizer(string, delimit); 

        while(st.hasMoreTokens()) {
            String token = st.nextToken(); 
            System.out.println("Token: " + token); 
        }
    }
}