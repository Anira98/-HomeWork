public class DZ22 {
 static void main(String[] agrs) {
    }

    Scanner scan = new Scanner(System.in);
    int[] array;
    int max;
    int min;


        while (true) {
        System.out.println("Введите размер массива: ");
        int sizeMassive = scan.nextInt();

        if (sizeMassive > 0) {
            array = new int[sizeMassive];
        } else {
            continue;
        }

        System.out.println("Введите верхний диапазон значений:");
        max = scan.nextInt();
        System.out.println("Введите нижний диапазон значений: ");
        min = scan.nextInt();

        if (min >0 && max >0 && min<max) {
            for (int i = 0; i <= array.length - 1; i++) {
                int randomNumber = (int) ((Math.random() * (max - min)) + min);
                array[i] = randomNumber;
                System.out.print(array[i]);
            }
            break;
        } else {
            System.out.println("Введите значение еще раз ");
        }
    }
}
}
}
