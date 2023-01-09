public class DZ4 {
    public static void main(String[] args) {
        int Year = 1998;
        if (Year% 4== 0){
            if (Year%100==0&&Year%400!= 0){
            } else{
                System.out.println("В году 366 дней (високосный)");
            }
        } else{
            System.out.println("В году 365 дней (не високосный)");
        }


    }
}