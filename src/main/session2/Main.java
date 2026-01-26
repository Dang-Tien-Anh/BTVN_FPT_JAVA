package main.session2;

public class Main {
    public static void main(String args[]){
        // program
        // Car c = new Car();// tạo 1 object từ class Car
        Car c;
        c = new Car();
        int x = 10;
        c.brand = "Toyota";
        c.year= 2020;
        c.run();
        c.maintain();

        System.out.println("Hang xe: "+c.brand);
        boolean check = c.checkDate();
        if(check){
            System.out.println("Xe đang còn hạn dùng");
        }else{
            System.out.println("Xe hết hạn dùng");
        }
        Car b = new Car("BMW",2009);
        b.year = 2009;
        b.checkDate();

        Car d = new Car("A",2009);

        TamGiac tg = new TamGiac(3,4,5);
        System.out.println("Chu vi:"+tg.chuVi());
        System.out.println("Dien tich:"+tg.dienTich());
        tg.a = 10;
        tg.name = "Tam giac can";
    }
}
