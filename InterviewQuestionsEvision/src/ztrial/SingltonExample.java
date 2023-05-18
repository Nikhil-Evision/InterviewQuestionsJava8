package ztrial;

public class SingltonExample {
    private static SingltonExample singltonExample;
    private SingltonExample(){

    }

    public static SingltonExample getObject(){
        if(singltonExample == null){
            SingltonExample singleton = new SingltonExample();
            return singleton;
        }
        else {
            return singltonExample;
        }
    }
}
