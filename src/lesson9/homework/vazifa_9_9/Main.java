package lesson9.homework.vazifa_9_9;

public class Main {

    public static void main(String[] args) {

        String matn1 = "Bu Lambda Expression matnlarni tekshiradi.";
        String matn2 = "Lambda";

        CheckString check = (str1, str2) -> {
            return str1.contains(str2);
        };

        System.out.println(check.checkString(matn1, matn2));
    }
}
