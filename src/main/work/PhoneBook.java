package main.work;

import java.util.ArrayList;
import java.util.Comparator;

// Lớp quản lý danh bạ, kế thừa từ Phone
public class PhoneBook extends Phone {
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        // kiểm tra xem tên đã có chưa
        for (PhoneNumber pn : phoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                // nếu số chưa có thì thêm vào
                if (!pn.getPhones().contains(phone)) {
                    pn.getPhones().add(phone);
                }
                return; // thoát vì đã xử lý xong
            }
        }
        // nếu chưa có thì tạo mới
        phoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        phoneList.removeIf(pn -> pn.getName().equalsIgnoreCase(name));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pn : phoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                pn.getPhones().clear(); // xóa số cũ
                pn.getPhones().add(newphone); // thêm số mới
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pn : phoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy: " + pn.getName() + " -> " + pn.getPhones());
                return;
            }
        }
        System.out.println("Không tìm thấy: " + name);
    }

    @Override
    public void sort() {
        phoneList.sort(Comparator.comparing(PhoneNumber::getName));
    }
}