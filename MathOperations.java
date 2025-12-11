import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        int p, q, r;
        
        p = 9;
        q = p / 9;
        r = q + 24;
        
        double z = (p + q) * 6 / r;
        
        System.out.println("z is " + z); // 60 / 25 is not 2.0; it's 2.4. We must cast r to a double.
        
        z = (p + q) * 6 / (double)r;
        
        System.out.println("z is " + z);
        
        // More Advanced Math (power, square root, absolute value)
        
        // First, create an instance of the Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Christmas spirit (percent) needed to power Santa's sleigh after given hours: 
        // S(hours) = (5*hours)^2 / 100
        System.out.print("Enter a number of hours: ");
        int hours = scanner.nextInt();
        double fuelNeeded = Math.pow((6*hours), 2) / 100;
        
        System.out.println(fuelNeeded + "% christmas spirit is needed after " + hours + " hours!");
        
        // Square Root
        System.out.print("Enter a number to take the square root of: ");
        int num = scanner.nextInt();
        
        double root = Math.sqrt(num);
        
        System.out.println("The square root of " + num + " is " + root);
        
        // Absolute Value for Distance
        int currentXCoordinate = -340;
        int northPoleXCoordinate = 1250;
        double distanceFromNorthPole = Math.abs(currentXCoordinate - northPoleXCoordinate);
        System.out.println("The distance from us to the north pole is " + distanceFromNorthPole);
        
    }
}
