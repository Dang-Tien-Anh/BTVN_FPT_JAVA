package main.session1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String args[]){
        int x = 10;
        float y = 3.14f;
        double z = 3.14159;
        boolean t = true;
        char c = 'h';
        String s = "Hello world";

        System.out.println(s+x); // string + number -> string (giống JS)
        int u = 20;
        int v = 30;
        System.out.println(u+"+"+v+"="+add(u,v));
        System.out.println(u+"/"+v+"="+div(u,v));

        // nhập vào 1 số từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        // kiểm tra có phải số nguyên tố hay ko
        // thông báo kết quả
        if(isPrime(n)){
            System.out.println(n+" is a prime!");
        }else{
            System.out.println(n+" is not a prime");
        }

        double p;
        p= sc.nextDouble();
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static double div(int a,int b){
        if(b==0) return 0;
        return (double) a /b;
    }
    // viết hàm kiểm tra 1 số nguyên có phải số nguyên tố hay ko
    public static boolean isPrime(int b){
        if(b < 2) return false;
        if(b < 4) return true;
        for(int i=2;i<=b/2;i++){
            if(b%i==0) return false;
        }
        return true;
    }
}
