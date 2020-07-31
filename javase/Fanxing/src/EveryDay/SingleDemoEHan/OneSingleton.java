package EveryDay.SingleDemoEHan;

public class OneSingleton {
    private static OneSingleton instance ;
    private OneSingleton(){}
    public OneSingleton getInstance(){
        if(instance == null){
            instance = new OneSingleton();
        }
        return instance;
    }
}
