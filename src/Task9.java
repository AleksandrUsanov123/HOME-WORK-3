import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    import java.util.Arrays;
import java.util.Scanner;

    public class Task09 {
        public static void main(String[] args) {
            System.out.println("Задание №9");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первую строку: ");
            String str1 = scanner.nextLine();
            System.out.print("Введите вторую строку: ");
            String str2 = scanner.nextLine();

            boolean isAnagram = checkAnagram(str1, str2);

            if (isAnagram) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        public static boolean checkAnagram(String str1, String str2) {
            // Приводим строки к нижнему регистру и удаляем пробелы и пунктуацию
            str1 = str1.toLowerCase().replaceAll("[^a-zа-яё]", "");
            str2 = str2.toLowerCase().replaceAll("[^a-zа-яё]", "");

            // Проверяем, являются ли строки анаграммами
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }



    }
