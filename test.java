import java.util.Scanner;
public class  test{
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {            
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int lengthWithoutUsingLength = findLength(input);
        int lengthUsingBuiltIn = input.length();
        System.out.println("Length (without using length()): " + lengthWithoutUsingLength);
        System.out.println("Length (using built-in length()): " + lengthUsingBuiltIn);

        scanner.close();
    }
}
