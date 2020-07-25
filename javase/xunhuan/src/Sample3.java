public class Sample3{
    void level(double grad){
        if(grad > 100){
            System.out.println("成绩错误");
            return;
        }
        if(grad >= 90){
            System.out.println("A");
        }else if(grad >= 80) {
            System.out.println("B");
        }else if(grad >= 60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

   }
//    void level (int grad){
//        switch (grad / 10){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("d");
//                break;
//            case 6 :
//            case 7 :
//                System.out.println("c");
//                break;
//            case 8 :
//                System.out.println("b");
//                break;
//            case 9 :
//            case 10 :
//                System.out.println("a");
//                break;
//            default:
//                System.out.println("成绩错误");
//        }
//    }


}