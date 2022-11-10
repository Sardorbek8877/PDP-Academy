package Homework.uz.pdp.online.model;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setId(123456);
        user.setUsername("Sardorbek1122");
        user.setEmail("example@gmail.com");
        user.setPassword("Password1234");
        user.setName("Sardorbek");
        user.setAddress("Sample Street 68");
        user.changePassword();

        User[] dddd = new User[5];
    }
}
