import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please enter 1 random number: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Element value has index " + x + " is " + arr[x]);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index has surpass array limit");
        }
    }
}
