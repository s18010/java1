public class En2_3 {
    public static void main(String[] str) {
        for (int i = 1; i <= 100; i++) {
            String number = String.valueOf(i);
            if ((i % 3 == 0) || number.contains("3")) {
            System.out.println("THREE");
            }
            else {
            System.out.println(i);
            }
        }
    }
}
