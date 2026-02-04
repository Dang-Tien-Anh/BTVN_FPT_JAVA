package main.session5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Person p = new Person();// error
        Asian a = new Asian();
        Euro e = new Euro();
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(a);
        arr.add(e);
        for (int i=0;i<arr.size();i++){
//            arr.get(i).fly();
//            arr.get(i).jump();
            if(arr.get(i) instanceof Asian){
                ((Asian) arr.get(i)).fly();
            }
        }

        Person p = new Person() { // anonymous class
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };
        LoveTips1 lt = new LoveTips1() {
            @Override
            public void dinner() {

            }

            @Override
            public void goToCinema() {

            }

            @Override
            public void goToCafe() {

            }
        };
        LoveTipSpecial ls = new LoveTipSpecial() {
            @Override
            public void xyz(String s, int y) {

            }
        };
        LoveTipSpecial lss = (s,y)->{ // lambda expression

        };
        ArrayList<Integer> arrs = new ArrayList<>();
        arrs.stream().filter(i -> i>0).map(i->i<10).toArray();
    }
}