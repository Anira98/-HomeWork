import java.util.Scanner;

public class DZ9 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку: ");
            String someString = scan.nextLine();

            if (someString.length() > 0) {
                System.out.println("Введите 1-й символ: ");
                char someChar1 = scan.next().charAt(0);

                System.out.println("Введите 2-й символ: ");
                char someChar2 = scan.next().charAt(0);

                char[] array = someString.toCharArray();

                int length = array.length;

                for (int i = 0; i < length; ++i) {

                    if (array[i] == (someChar1)) {
                        array[i] = someChar2;
                    }
                }

                for (int i = 0; i < length; ++i) {
                    System.out.print(array[i]);
                }
                break;
            } else {
                System.out.println(" повторите ввод");
            }
        }
    }

}
