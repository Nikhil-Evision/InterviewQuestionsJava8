package ztrial;

public class CustomAnnotation {
    public static void main(String[] args) {
        DemoAnnoImpl d = new DemoAnnoImpl();
        Class c = d.getClass();
        System.out.println(c.getName());
        MyAnno anno = (MyAnno)c.getAnnotation(MyAnno.class);
        System.out.println(anno.name());
        System.out.println(anno.city());
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
//        System.out.println(dateTime.format(dateTimeFormatter));

    }
}
