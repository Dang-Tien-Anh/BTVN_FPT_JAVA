package main.work;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    // Constructor
    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        this.diemToan = kiemTraDiem(diemToan);
        this.diemVan = kiemTraDiem(diemVan);
        this.diemAnh = kiemTraDiem(diemAnh);
    }

    // Ràng buộc: điểm chỉ từ 0 -> 10
    private double kiemTraDiem(double diem) {
        if (diem < 0) return 0;
        if (diem > 10) return 10;
        return diem;
    }

    // Tính điểm trung bình
    public double tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3.0;
    }

    // Xếp loại theo điểm trung bình
    public String xepLoai() {
        double tb = tinhDiemTB();
        if (tb >= 8) return "Giỏi";
        else if (tb >= 6.5) return "Khá";
        else if (tb >= 5) return "Trung bình";
        else return "Yếu";
    }

    // In thông tin học sinh
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Văn: " + diemVan);
        System.out.println("Điểm Anh: " + diemAnh);
        System.out.println("Điểm TB: " + tinhDiemTB());
        System.out.println("Xếp loại: " + xepLoai());
    }
}
