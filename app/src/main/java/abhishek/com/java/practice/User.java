package abhishek.com.java.practice;

/**
 * Created by abhishek on 8/1/17.
 */

public class User {

    private  String name;
    private  int user_id;


    User(int user_id,String name){
        this.name = name;
        this.user_id = user_id;
    }

    /*@Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;

        if(this.getClass() != obj.getClass()){
            return false;
        }
        User user = (User) obj;
        if(this.user_id == user.user_id)
            return true;

        return false;
    }*/


    @Override
    public int hashCode() {

        return this.user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
