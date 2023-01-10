import java.util.Scanner;

public class DZ5 {
    public static  void main(String[] args){
        int[] array = new int [20];
        array[0] = 9;
        array[1] = 56;
        array[2] = 22;
        array[3] = 24;
        array[4] = 98;
        array[5] = 1010;
        array[6] = 45;
        array[7] = 87;
        array[8] = 43;
        array[9] = 209;
        array[10] = 354;
        array[11] = 1009;
        array[12] = 2;
        array[13] = 5;
        array[14] = 18;
        array[15] = 34;
        array[16] = 40;
        array[17] = 2343;
        array[18] = 378;
        array[19] = 9009;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scan.nextInt();

        int index = -1;

        for (int i = 0; i<array.length;i++){
            if (array[i] == num){
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Число есть,под индексом " + index);
        }else {
            System.out.println("Числа  нет");
        }
    }
}


