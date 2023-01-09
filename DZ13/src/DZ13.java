public class DZ13 {
    public static void main(String[] args) {
        int a = 34;
        int b = 6;
        int amount = 0;
        for (int i = b;i<=a;i+=b){
            amount = amount + b;
        }
        System.out.println ("Длина части отрезка А: "+ (a-amount));
    }
}

