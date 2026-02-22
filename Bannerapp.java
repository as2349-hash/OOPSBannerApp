public class BannerApp {

    public static void main(String[] args) {

        // --- Define the top and middle parts for O, P, and S ---
        
        // Top Line (Line 1)
        String o1 = "  *****  "; 
        String p1 = " ******* ";
        String s1 = " ******* ";

        // Side Lines (Line 2, 3)
        String o2 = " *     * ";
        String p2 = " *     * ";
        String s2 = " *       ";

        // Middle Line (Line 4)
        String o4 = " *     * ";
        String p4 = " ******* ";
        String s4 = " ******  ";

        // Bottom Side Lines (Line 5, 6)
        String o5 = " *     * ";
        String p5 = " *       ";
        String s5 = "      * ";

        // Bottom Line (Line 7)
        String o7 = "  *****  ";
        String p7 = " *       ";
        String s7 = " ******* ";


        // --- Print the lines to build the word "OOPS" ---

        // Line 1
        System.out.println(o1 + " " + o1 + " " + p1 + " " + s1);
        
        // Line 2
        System.out.println(o2 + " " + o2 + " " + p2 + " " + s2);
        
        // Line 3
        System.out.println(o2 + " " + o2 + " " + p2 + " " + s2);
        
        // Line 4
        System.out.println(o4 + " " + o4 + " " + p4 + " " + s4);
        
        // Line 5
        System.out.println(o5 + " " + o5 + " " + p5 + " " + s5);
        
        // Line 6
        System.out.println(o5 + " " + o5 + " " + p5 + " " + s5);
        
        // Line 7
        System.out.println(o7 + " " + o7 + " " + p7 + " " + s7);
    }
}