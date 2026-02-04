package main.work;

public class PhoneBook extends Phone {
    private PhoneNumber[] phoneList;
    private int count;

    public PhoneBook() {
        phoneList = new PhoneNumber[100]; // fixed size
        count = 0;
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (int i = 0; i < count; i++) {
            if (phoneList[i].name.equalsIgnoreCase(name)) {
                phoneList[i].addPhone(phone);
                return;
            }
        }
        phoneList[count++] = new PhoneNumber(name, phone);
    }

    @Override
    public void removePhone(String name) {
        for (int i = 0; i < count; i++) {
            if (phoneList[i].name.equalsIgnoreCase(name)) {
                // shift left
                for (int j = i; j < count - 1; j++) {
                    phoneList[j] = phoneList[j + 1];
                }
                count--;
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (int i = 0; i < count; i++) {
            if (phoneList[i].name.equalsIgnoreCase(name)) {
                phoneList[i].updatePhone(newphone);
                return;
            }
        }
        System.out.println("Name not found!");
    }

    @Override
    public void searchPhone(String name) {
        for (int i = 0; i < count; i++) {
            if (phoneList[i].name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + phoneList[i]);
                return;
            }
        }
        System.out.println("Not found!");
    }

    @Override
    public void sort() {
        // simple bubble sort by name
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (phoneList[j].name.compareToIgnoreCase(phoneList[j + 1].name) > 0) {
                    PhoneNumber temp = phoneList[j];
                    phoneList[j] = phoneList[j + 1];
                    phoneList[j + 1] = temp;
                }
            }
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(phoneList[i]);
        }
    }
}