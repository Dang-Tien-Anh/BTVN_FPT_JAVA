package main.session1;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args){
        int[] arr = new int[3];// khai baos 1 int array
        // list - collection
        // int float double char boolean ko xài đc
        Integer a = 10;
        Float b = 3.14f;
        Double c = 3.14159;
        Character h = 'x';
        Boolean t = true;

        ArrayList ar = new ArrayList();// ko nên dùng
        ar.add(5);
        ar.add("Hello"); // thêm pt vào mảng

        ArrayList<Integer> intArr = new ArrayList<>();// mảng số nguyên
        intArr.add(3);
        intArr.add(6);
//        intArr.add(3.14);
//        intArr.add("Hello");
        ArrayList<Double> dbArr = new ArrayList<>(); // mảng số thực
        dbArr.add(3.15);
        dbArr.add(3.14);

        for(int i=0;i<intArr.size();i++){
            System.out.println(intArr.get(i));// intArr.get(i)
        }

        for (Double d: dbArr){
            System.out.println(d);
        }
    }
}
