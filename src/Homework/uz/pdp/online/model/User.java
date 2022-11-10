package Homework.uz.pdp.online.model;

import java.util.Scanner;

public class User {

    int id;
    public String username;
    public String email;
    private String password;
    String name;
    String address;

    void changePassword(){
        Scanner kiritish = new Scanner(System.in);
        System.out.println("Eski parolni kiriting: ");
        String OldPassword = kiritish.nextLine();
        if(OldPassword.equals(password)){
            System.out.println("Yangi parolni kiriting: ");
            password = kiritish.nextLine();
            System.out.println("Parolingiz muvaffaqiyatli almashtirildi!");
        }
        else{
            System.out.println("Operatsiya bajarilmadi. Eski parol noto'g'ri!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
