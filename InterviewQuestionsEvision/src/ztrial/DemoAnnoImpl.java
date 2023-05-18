package ztrial;

@MyAnno(name = "Nikhil.........")
public class DemoAnnoImpl {
    public static void main(String[] args) {
        DemoAnnoImpl d = new DemoAnnoImpl();
        Class c = d.getClass();
        //        System.out.println(c.getName());
        MyAnno anno = (MyAnno)c.getAnnotation(MyAnno.class);
        System.out.println(anno.name());
        System.out.println(anno.city());
    }
}
