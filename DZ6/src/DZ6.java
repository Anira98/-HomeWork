public class DZ6 {
    public static void main(String[] args) {
        long nu=769;
        if (nu>0&&nu<10){
            if (nu%2==0){
                System.out.println("Однозначное четное число");
            } else {
                System.out.println("Однозначное нечетное число");
            }
        }
        if (nu>=10&&nu<100){
            if (nu%2==0){
                System.out.println("Двузначное четное число");
            } else {
                System.out.println("Двузначное нечетное число");
            }
        }
        if (nu >= 100 && nu<1000){
            if (nu%2==0){
                System.out.println("Трехзначное четное число");
            } else{
                System.out.println("Трехзначное нечетное число");
            }
        }
    }
}
