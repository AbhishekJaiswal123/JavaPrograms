package abhishek.com.java.practice;

/**
 * Created by abhishek on 17/11/16.
 */

public class Test3 {


    public static void main(String[] args) {

        String a = "abcd";
        String b = "abcd";

        String c = new String("abcd");
        String d = new String("abcd");

        System.out.println("c hashcode = "+ c.hashCode());
        System.out.println("d hashcode = "+ d.hashCode());
        System.out.println("a hashcode = "+ a.hashCode());
        System.out.println("b hashcode = "+ b.hashCode());


        System.out.println("equals check --->"+a.equals(b));
        System.out.println("equals check a and c--->"+a.equals(c));

        System.out.println("check a and b --->"+(a==b));
        System.out.println("check a and c --->"+(a==c));

        System.out.println("equals check --->"+c.equals(d));
        System.out.println("check --->"+(c==d));


        int x = 5;
        int y = 302;

        System.out.println(x+""+y);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
