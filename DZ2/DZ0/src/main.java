import java.io.IOException;

public class main {

    public static void main(String[] args)  {

    char ch, answer = 'B';
        System.out.println("какую букву я загадал?");
        System.out.print("попытайтесь ее угадать" );
        try {
            ch=(char) System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
            if (ch==answer) {
                System.out.print("поздравляю");

            }else if (ch>answer){
                System.out.print("перестарался");
            }else{
                System.out.print("недосторался");

            }
        }


    }
        }
