package demo.guru99.guru99.Banus_Utilities;

public class BrowserUtilBAnu {


    public static void staticWait(int second){
        try{
            Thread.sleep(1000*second);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
