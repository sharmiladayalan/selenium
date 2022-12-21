

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList();
        arr.add("childrens"); arr.add("are playing");
        System.out.println(arr);
        arr.add(2,"with toys");
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.remove(3);
        System.out.println(arr);
    }
}
