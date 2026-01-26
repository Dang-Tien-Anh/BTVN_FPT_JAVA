package main.work;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTK, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công: " + soTien);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0!");
        }
    }

    public void rutTien(double soTien) {
        if (soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công: " + soTien);
        } else {
            System.out.println("Số dư không đủ để rút!");
        }
    }

    public void hienThiSoDu() {
        System.out.println("Số dư hiện tại: " + soDu);
    }
}