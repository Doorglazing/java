public class demo3 {
    public static void main(String[] args) {
        int y , x ;
        for (y=1,x=1;y<=50;y++){
            if(x>=10)
                break;
            if(x%2==1){
                x+=5;
                continue;
            }
            x-=3;//6 3 8 5 10
        } //2 3 4 5 6
        System.out.println(y);

    }
}
