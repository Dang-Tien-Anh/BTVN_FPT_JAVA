package main.work;

public class PhoneNumber {
    String name;
    String[] phones;
    int phoneCount;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phones = new String[10]; // fixed size for simplicity
        this.phones[0] = phone;
        this.phoneCount = 1;
    }

    public void addPhone(String phone) {
        // only add if not already there
        for (int i = 0; i < phoneCount; i++) {
            if (phones[i].equals(phone)) {
                return; // already exists
            }
        }
        if (phoneCount < phones.length) {
            phones[phoneCount++] = phone;
        }
    }

    public void updatePhone(String newphone) {
        phones[0] = newphone;
        phoneCount = 1; // reset to just one number
    }

    public String toString() {
        String result = name + " : ";
        for (int i = 0; i < phoneCount; i++) {
            result += phones[i] + " ";
        }
        return result;
    }
}