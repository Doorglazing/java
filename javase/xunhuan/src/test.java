class test{
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int x = 0; x < (5-(2*i-1))/2; x++){
                System.out.print(' ');
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}