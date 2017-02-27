package abhishek.com.java.practice;

/**
 * Created by abhishek on 19/8/16.
 */
public class Test2 {

    private static int var = 10;
    private int temp = 10;

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int sam1 = test2.temp;
        int sam2 = test2.var;

        System.out.println("instance variable = " + sam1);
        System.out.println("class variable = " + sam2);

        test2.var = 50;
        test2.temp = 20;

        System.out.println("instance variable = " + test2.temp);
        System.out.println("class variable = " + test2.var);


        Test2 test1 = new Test2();

        System.out.println("instance variable = " + test1.temp);
        System.out.println("class variable = " + test1.var);



        System.out.println("test2 = " + Test2.var);
    }
}
