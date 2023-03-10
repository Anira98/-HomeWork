import java.util.Scanner;

public class DZ7 {
    public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            int amountLineSearch = 0;
            int amountBinSearch = 0;

            System.out.print("Введите нижний диапазон: ");
            int a = scan.nextInt();

            System.out.print("Введите верхний диапазон: ");
            int b = scan.nextInt();

            System.out.print("Введите размер массива: ");
            int sizeArray = scan.nextInt();
            int[] array = new int[sizeArray];

            for (int i = 0; i < array.length; i++) {
                int randomNumber = (int) ((Math.random() * (b - a)) + a);
                array[i] = randomNumber;
                System.out.print(array[i] + " ");
            }
            System.out.println("\nВведите значение для поиска: ");
            int k = scan.nextInt();


            int index = -1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == k) {
                    index = j;
                    break;
                }
                amountLineSearch++;
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int maxNum = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = maxNum;
                    }
                }
            }

            int lowIndex = 0;
            int highIndex = array.length - 1;
            int index2 = -1;


            while (lowIndex <= highIndex) {
                amountBinSearch++;
                int midIndex = (lowIndex + highIndex) / 2;
                if (k == array[midIndex]) {
                    index2 = midIndex;
                    break;
                } else if (k < array[midIndex]) {
                    highIndex = midIndex - 1;
                } else if (k > array[midIndex]) {
                    lowIndex = midIndex + 1;
                }
            }
            System.out.println("\nИндекс элемента: " + index);
            System.out.println("Линейный поиск: " + amountLineSearch + " шага(-ов)");
            System.out.println("Бинарный поиск: " + amountBinSearch + " шага(-ов)");
        }
    }
    12
