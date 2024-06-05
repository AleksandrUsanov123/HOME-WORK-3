import java.util.Scanner;

public class Task8 {
    import java.util.Scanner;

    public class VariableConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя переменной: ");
            String variable = scanner.nextLine();

            if (isJavaFormat(variable)) {
                String cppFormat = convertToC(variable);
                System.out.println("Переменная в формате C++: " + cppFormat);
            } else if (isCppFormat(variable)) {
                String javaFormat = convertToJava(variable);
                System.out.println("Переменная в формате Java: " + javaFormat);
            } else {
                System.out.println("Неверный формат переменной!");
            }
        }

        public static boolean isJavaFormat(String variable) {
            if (variable.length() == 0) return false;
            if (!Character.isLowerCase(variable.charAt(0))) return false;
            for (int i = 1; i < variable.length(); i++) {
                if (Character.isUpperCase(variable.charAt(i))) {
                    if (i == variable.length() - 1 || !Character.isLowerCase(variable.charAt(i+1))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isCppFormat(String variable) {
            if (variable.length() == 0) return false;
            if (!Character.isLowerCase(variable.charAt(0)) && variable.charAt(0) != '_') return false;
            for (int i = 1; i < variable.length(); i++) {
                if (variable.charAt(i) == '_') {
                    if (i == variable.length() - 1 || variable.charAt(i+1) == '_' || !Character.isLowerCase(variable.charAt(i+1))) {
                        return false;
                    }
                } else if (!Character.isLowerCase(variable.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        public static String convertToC(String variable) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < variable.length(); i++) {
                if (Character.isUpperCase(variable.charAt(i))) {
                    if (i > 0) result.append("_");
                    result.append(Character.toLowerCase(variable.charAt(i)));
                } else {
                    result.append(variable.charAt(i));
                }
            }
            return result.toString();
        }

        public static String convertToJava(String variable) {
            StringBuilder result = new StringBuilder();
            boolean nextUpperCase = false;
            for (int i = 0; i < variable.length(); i++) {
                if (variable.charAt(i) == '_') {
                    nextUpperCase = true;
                } else {
                    if (nextUpperCase) {
                        result.append(Character.toUpperCase(variable.charAt(i)));
                        nextUpperCase = false;
                    } else {
                        if (i == 0) {
                            result.append(variable.charAt(i));
                        } else {
                            result.append(Character.toLowerCase(variable.charAt(i)));
                        }
                    }
                }
            }
            return result.toString();
        }


    }
