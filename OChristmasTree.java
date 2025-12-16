public class OChristmasTree {
    public static void main(String[] args) {
        // Call the defined oChristmasTree method to display the repeated lyrics
        oChristmasTree();
        System.out.println("How lovely are your branches!");
        oChristmasTree();
        System.out.println("Not only green in summer’s heat,");
        System.out.println("But also winter’s snow and sleet.");
        oChristmasTree();
        System.out.println("How lovely are your branches!");
    }
    
    public static void oChristmasTree() {
        /*
        This method named oChristmasTree is static because it's called from a static method (main),
        and it's void because it doesn't return anything.
        The reasoning for static methods will be given in Lesson 4.1 of the course
        as it involves object-oriented programming (OOP).
        */
        System.out.println("O Christmas Tree, O Christmas Tree,");
    }
}