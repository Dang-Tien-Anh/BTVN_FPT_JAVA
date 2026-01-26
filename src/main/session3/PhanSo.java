package main.session3;

public class PhanSo {
    private Integer tuSo;
    private Integer mauSo;

    public PhanSo() {
    }

    public PhanSo(Integer tuSo, Integer mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public Integer getTuSo() {
        return tuSo;
    }

    public void setTuSo(Integer tuSo) {
        this.tuSo = tuSo;
    }

    public Integer getMauSo() {
        return mauSo;
    }

    public void setMauSo(Integer mauSo) {
        this.mauSo = mauSo!=0?mauSo:1;
    }

    public void rutGon(){
        // tìm UCLN của tuso và mauso
        int ucln = 1;
        for(int i=2;i<Math.abs(getTuSo());i++){
            if(getTuSo()%i==0 && getMauSo()%i==0){
                ucln = i;
            }
        }
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public void add(PhanSo a){
        // this
        setMauSo(this.mauSo * a.getMauSo());
        setTuSo(this.tuSo* a.getMauSo() + this.mauSo * a.getTuSo());
        rutGon();
    }

}
