package dsa_assignment_05;

/**
 *
 * @author 1999k
 */
public class LangStringBuilder {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        //using append method
        System.out.println("");
        sb.append("String Builder - java.lang implementation.");
        System.out.println(sb);
        
        //using insert method
        System.out.println("");
        sb.insert(sb.length()-1," Java" );
        System.out.println(sb);
        
        //using delete method
        System.out.println("");
        sb.delete(5,8);
        System.out.println(sb);
        
        //using reverse method
        System.out.println("");
        sb.reverse();
        System.out.println(sb);
        
        //using replace method
        System.out.println("");
        sb.replace(5,8," helloo ");
        System.out.println(sb);
        
    }
    
}
