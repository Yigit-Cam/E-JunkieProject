package Utility;

public class MyFunc {
    public static void Sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int GetRndmNumber(int min, int max)
    {
        return  (int)(Math.random()* (max-min) )+ min;
    }
    public static int GetRndmNumber(int max)
    {
        return  (int)(Math.random()* max);
    }
}
