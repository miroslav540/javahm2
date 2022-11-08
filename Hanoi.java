import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        char firstPin = 'A', finishPin = 'B', interimPin = 'C';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();
        solve(numberOfDisks, firstPin, finishPin, interimPin);
    }

    static void solve(int amount, char from, char to, char intermediate) {
        if (amount != 0) {
            solve(amount - 1, from, intermediate, to);
            System.out.println("" + from + " -> " + to);
            solve(amount - 1, intermediate, to, from);
        }
    }
}