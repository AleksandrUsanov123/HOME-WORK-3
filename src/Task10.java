import java.util.Scanner;

public class Task10 {
    import java.util.Scanner;

    public class Task10 {
        public static void main(String[] args) {
            System.out.println("Задание №10");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            int length = input.length();

            if (length > 50) {
                System.out.println("Максимальная длина строки - 50 символов.");
                return;
            }

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(input.charAt(j));
                }
                System.out.println();
            }

            for (int i = length - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(input.charAt(j));
                }
                System.out.println();
            }
        }



    }
