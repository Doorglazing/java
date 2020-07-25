package homework4;

public class Sun extends Star implements Universe{
    @Override
    public void doAnything() {
        super.shine("sun","太阳吸引着9大行星旋转");
    }

}
