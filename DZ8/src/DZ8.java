public class DZ8 {
    public static void main(String[] args) {
        int N =3;
        int M=8;
        if (M<= 14) {
            switch (M) {
                case 1:
                    System.out.print("Еденица");
                    break;
                case 2:
                    System.out.print("Двойка");
                    break;
                case 3:
                    System.out.print("Тройка");
                    break;
                case 4:
                    System.out.print("Четверка");
                    break;
                case 5:
                    System.out.print("Пятерка");
                    break;
                case 6:
                    System.out.print("Шестерка");
                    break;
                case 7:
                    System.out.print("Семерка");
                    break;
                case 8:
                    System.out.print("Восьмерка");
                    break;
                case 9:
                    System.out.print("Девятка");
                    break;
                case 10:
                    System.out.print("Десятка");
                    break;
                case 11:
                    System.out.print("Валет");
                    break;
                case 12:
                    System.out.print("Дама");
                    break;
                case 13:
                    System.out.print("Король");
                    break;
                case 14:
                    System.out.print("Туз");
                    break;
                default:
                    System.out.println("Такой катры нет");
                    break;
            }
        }else {
            System.out.println("Введенное число не соответствует номеру карты");
        }
        if (N <= 4) {
            if (N == 1) {
                System.out.println("пик");
            } else if (N == 2) {
                System.out.println("треф");
            } else if (N == 3) {
                System.out.println("бубен");
            } else if (N == 4) {
                System.out.println("червей");
            }
        }else {
            System.out.println("Такой масти нет");
        }
    }
}

