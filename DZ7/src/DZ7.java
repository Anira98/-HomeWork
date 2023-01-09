public class DZ7 {
    public static void main(String[] args) {
        int day=24;
        int month=12;
        if (day>=21&&month== 3||day<=19&&month ==4){
            System.out.println("Овен");
        }
        if (day>=20&&month==4||day<=20&&month ==5){
            System.out.println("Телец");
        }
        if (day >=21&&month==5||day<=21&&month == 6){
            System.out.println("Близнецы");
        }
        if (day >=22&&month==6||day<= 22 &&month ==7){
            System.out.println("Рак");
        }
        if (day >= 23&& month == 7||day<= 22 &&month== 8){
            System.out.println("Лев");
        }
        if (day >= 23 && month == 8 || day <= 22 && month == 9){
            System.out.println("Дева");
        }
        if (day >= 23&& month == 9 ||day <=22 && month == 10){
            System.out.println("Весы");
        }
        if (day >= 23&& month == 10 || day <= 22 && month == 11) {
            System.out.println("Скорпион");
        }
        if (day >= 23&& month == 11|| day <= 21 && month == 12) {
            System.out.println("Стрелец");
        }
        if (day >= 22&& month== 12|| day <= 19 && month == 1) {
            System.out.println("Козерог");
        }
        if (day >= 20 && month == 1 || day <= 18 && month == 2) {
            System.out.println("Водолей");
        }
        if (day >= 19&& month ==2||day <=20 && month == 3) {
            System.out.println("Рыбы");

        }
    }
}