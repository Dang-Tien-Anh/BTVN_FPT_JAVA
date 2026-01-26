package main.session3;

import main.session2.TamGiac;

public class Main {
    public static void main(String[] args){
        TamGiac tg3 = new TamGiac(4,5,6);
        tg3.name = "TG deu";
        PhanSo p1 = new PhanSo(3,4);
        p1.setTuSo(5);// p1.tuSo = 5;
    }
}
