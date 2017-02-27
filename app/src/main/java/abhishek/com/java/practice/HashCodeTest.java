package abhishek.com.java.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhishek on 8/1/17.
 */

public class HashCodeTest {

    public static void main(String[] args) {

        User user1 = new User(1,"abhi");
        User user3 = new User(1,"abhi");
        User user2 = new User(2,"jaiswal");

        System.out.println("Equals check on user1 and user2 :"+user1.equals(user2));
        System.out.println("Equals check on user1 and user3 :"+user1.equals(user3));

        System.out.println("Hashcode of user1 :"+ user1.hashCode());
        System.out.println("Hashcode of user1 :"+ user1.hashCode());

        System.out.println("Hashcode of user2 :"+ user2.hashCode());
        System.out.println("Hashcode of user2 :"+ user2.hashCode());
        System.out.println("Hashcode of user3 :"+ user3.hashCode());
        System.out.println("Hashcode of user3 :"+ user3.hashCode());

        Map<User,String> map = new HashMap<>();
        map.put(user1,user1.getName());
        map.put(user3,user3.getName());

        System.out.println("map.size() = " + map.size());

    }
}
