import java.util.Scanner;

public class Task12 {
    import java.util.Scanner;

    public class Task12 {
        public static void main(String[] args) {
            System.out.println("Задание №12");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String text = scanner.nextLine();

            int smileyCount = countSmileys(text);
            System.out.println("Количество смайликов: " + smileyCount);
        }

        public static int countSmileys(String text) {
            int count = 0;
            int index = 0;

            while (index < text.length()) {
                char currentChar = text.charAt(index);

                // Проверяем первый символ смайлика
                if (currentChar == ';' || currentChar == ':') {
                    int endIndex = index + 1;

                    // Проверяем символы '-'
                    while (endIndex < text.length() && text.charAt(endIndex) == '-') {
                        endIndex++;
                    }

                    // Проверяем последовательность скобок
                    if (endIndex < text.length() && isBracket(text.charAt(endIndex))) {
                        char bracketChar = text.charAt(endIndex);

                        while (endIndex < text.length() && text.charAt(endIndex) == bracketChar) {
                            endIndex++;
                        }

                        // Проверяем, что внутри смайлика нет других символов
                        if (endIndex == index + 2 + (endIndex - index - 2) / 2) {
                            count++;
                        }
                    }
                }

                index++;
            }

            return count;
        }

        public static boolean isBracket(char c) {
            return c == '(' || c == ')' || c == '[' || c == ']';
        }



    }
