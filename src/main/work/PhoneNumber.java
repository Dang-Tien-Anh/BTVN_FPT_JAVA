package main.work;

import java.util.ArrayList;

// Lớp lưu thông tin một người và danh sách số điện thoại của họ
public class PhoneNumber {
    String name;
    ArrayList<String> phones;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone); // thêm số đầu tiên
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }
}