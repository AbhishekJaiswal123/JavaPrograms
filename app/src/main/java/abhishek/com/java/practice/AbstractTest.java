package abhishek.com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by abhishek on 21/7/16.
 */
public class AbstractTest {

    public static void main(String[] args) {


        QueueUsingStack queue = new QueueUsingStack();
        queue.push("kamal");
        queue.push("dinash");

        Stack<String> stack = new Stack<>();
        stack.push("Abhishek Jaiswal");
        stack.push("Amit kumar");
        stack.push("Sumit Jaiswal");
        stack.push("Manish Jaiswal");


        System.out.println("queue.pop() = " + queue.pop());
        System.out.println("stack.pop() = " + stack.pop());


        HashMap<String,String> map = new HashMap<>();
        map.put("a","abhishek");
        map.put("b","bunty");

        Map.Entry<String, String> entry = new Map.Entry<String, String>() {
            @Override
            public String getKey() {
                return null;
            }

            @Override
            public String getValue() {
                return null;
            }

            @Override
            public String setValue(String s) {
                return null;
            }
        };

    }


    private static class QueueUsingStack{

        private Stack<String> inbox = new Stack<>();
        private Stack<String> outbox = new Stack<>();


        public String pop(){
            String itemPopped = "Queue is empty";
            if(outbox.isEmpty()){
                while (!inbox.isEmpty()){
                    outbox.push(inbox.pop());
                }
                if(!outbox.isEmpty())
               itemPopped =  outbox.pop();  
              
            }else{
                itemPopped = outbox.pop();
            }

          return itemPopped;
        }


        public void push(String item){
            inbox.push(item);
        }


    }


   
}
