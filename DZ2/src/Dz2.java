public class Dz2 {
    public static void main(String[] args) {
        int dey=6;
        String DeyString;
        switch (dey) {
            case 1:
                DeyString = "понидельник";
                break;
            case 2:
                DeyString = "вторник";
                break;
            case 3:
                DeyString = "среда";
                break;
            case 4:
                DeyString = "четверг";
                break;
            case 5:
                DeyString = "пятница";
                break;
            case 6:
                DeyString = "суббота";
                break;
            case 7:
                DeyString = "воскресение";
                break;
            default:DeyString = "нет токого";
                break;
        }
        System.out.println(DeyString);
    }

}