public class Card {
    private String fColor;
    private char fNum;
    Card(){}
    Card(String fColor, char fNum){
        this.fColor = fColor;
        this.fNum = fNum;
    }
    void showCard(){
        System.out.println(fColor + fNum);
    }
}
