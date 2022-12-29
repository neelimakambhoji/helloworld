package collectionassigns;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[]args){
        Stack<String>s = new Stack<String>();
        s.push("neelu");
        s.push("akshu");
        s.push("cheeku");
        System.out.println(s);         //push means insert the data
        System.out.println(s.search("akshu"));   // search means search the data
        s.pop();           //pop means remove the data
        System.out.println(s);
        System.out.println(s.peek());
        //peek means  top of the element
        System.out.println(s.empty());   // empty means check the data empty or not
        s.clear();
        System.out.println(s.empty());
    }
}
