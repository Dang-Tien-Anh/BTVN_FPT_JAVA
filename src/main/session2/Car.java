package main.session2;

public class Car {
    // attribute
    String brand; // class variable
    Integer year;
    // constructor - hàm khởi tạo
    public Car(){ // hàm khởi tạo không tham số
        System.out.println("ABC XYZ.....");
    }
    public Car(String brand, Integer year){ // hàm khởi tạo có tham số
        this.brand = brand;
        this.year = year;
    }
    // method - behavior
    public void run(){
        System.out.println(this.brand+" is running...");
    }

    public void maintain(){
        System.out.println(this.brand+" is maintaining.");
    }

    // kiểm tra xem năm sản xuất đã quá hạn chưa, giả định hạn 10 năm
    public boolean checkDate(){
        int now = 2026;
        int yearP = this.year;// đối tượng ngầm định của chính nó trong c
        if(now - yearP > 10){
            return false;
        }else{
            return true;
        }
    }
}
