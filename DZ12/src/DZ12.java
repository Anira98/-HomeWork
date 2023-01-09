public class DZ12 {
    public static void main(String[] args) {
        int A = 6;
        int B = 10;
        int G = 7;

        for (int i =B-1; i >A && i<=G ; i--){
            System.out.println(i);
            G++;
        }
        System.out.println("Количество чисел " + G); //второй вариант (a - b)-1\\\
    }

}

