public class circle {
    public static void main(String[] args) {
        int a = 1234;
        String b = Integer.toString(a);
        for(int i = b.length() - 1; i >= 0; i--) {
            System.out.print(b.charAt(i));
        }
    }

}
