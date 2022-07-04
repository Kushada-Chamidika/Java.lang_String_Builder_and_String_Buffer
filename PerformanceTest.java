package dsa_assignment_05;

import java.util.GregorianCalendar;

/**
 *
 * @author 1999k
 */
public class PerformanceTest {

    public static void main(String[] args) {

        // String Buffer Code
        long startSB = new GregorianCalendar().getTimeInMillis();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10000000; i++) {
            sb.append("Step:").append(i);
        }
        
        long endSB = new GregorianCalendar().getTimeInMillis();
        
        System.out.println("");
        System.out.println("String Buffer Test: ");
        System.out.println("Time Taken By String Buffer: " + (endSB - startSB)+" ms");
        
        // String Builder Code
        long startSB2 = new GregorianCalendar().getTimeInMillis();

        StringBuilder sb2 = new StringBuilder();
        
        for (int i = 0; i < 10000000; i++) {
            sb2.append("Step:").append(i);
        }
        
        long endSB2 = new GregorianCalendar().getTimeInMillis();
        
        System.out.println("");
        System.out.println("String Builder Test: ");
        System.out.println("Time Taken By String Builder: " + (endSB2 - startSB2)+" ms");
        
    }

}
