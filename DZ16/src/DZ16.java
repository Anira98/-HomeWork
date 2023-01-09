public class DZ16 {
    public static void main(String[] args) {
        double deposit = 1000;
        int Month = 12;
        double p = 7.5;
        int k = 0;
        for (int i = 1; i<= Month; i++) {
            double percent = deposit * (p/100);
            deposit = deposit + percent;
            if (deposit <= 1100) {
                k++;
            }
        }
        System.out.println("Итоговый размер вклада " + deposit);
        System.out.println("Размер вклада превысит 1100 руб через " + k + " мес.");

    }
}
