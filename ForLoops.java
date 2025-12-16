public class ForLoops {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            // Repeat as long as i, which is initially 1, is less than 4 and increment i by 1
            System.out.println("Merry Christmas!");
        }
        
        for (int i = 0; i < 2; i++) {
            // Repeat as long as i, which is initially 0, is less than 2 and increment i by 1
            System.out.println("Rudolph");
            for (int j = 0; j < 2; j++) {
                // Repeat as long as j, which is initially 0, is less than 2 and increment j by 1
                System.out.println("Dasher");
            }
        }
        
        for (int i = 0; i < 4; i++) {
            // Repeat as long as i, which is initially 0, is less than 4 and increment i by 1
            System.out.println("i is " + i);
        }
        
        
    }

}