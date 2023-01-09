public class dz3 {
    public static void main(String[] args) {
        int m1 = 55;
        int m2 = 43;
        int m3 = 987;
        if (m1 > m3 && m2 > m3) {
            System.out.println(m1 + m2);
        } else if (m2 > m1 && m3 > m1) {
            System.out.println(m2 + m3);
        } else {
            System.out.println(m1 + m3);
        }
    }
}

