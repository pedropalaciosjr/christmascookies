public class Countdown {
    public static void main(String[] args) {
        // Call the countdown method and pass the integer argument 10
        countdown(10);
        System.out.println("Happy New Year!");
        
        // Call the countdown method and pass the integer argument 3
        countdown(3);
        System.out.println("Go!");
        
    }
    
    public static void countdown(int n) {
        // Count down starting from the integer n, which is provided in the method call
        for (int i = n; i > 0; i--) {
            // Set i to n and repeat as long as i is greater than 0
            System.out.println(i);
        }
    }
}