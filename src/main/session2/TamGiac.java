package main.session2;

public class TamGiac {
    Integer a;
    Integer b;
    Integer c;

    public String name;

    public TamGiac(){

    }
    public TamGiac(Integer a,Integer b,Integer c){
        this.a = a;
        this.b = c;
        this.c = c;
    }

    public Integer chuVi(){
        return a+b+c;
    }

    public Double dienTich(){
        double p = (double) chuVi()/2;
        System.out.println(this.name+ " là tam giác cân");
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
