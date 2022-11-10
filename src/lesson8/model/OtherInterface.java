package lesson8.model;

public interface OtherInterface {

    default void about(){
        System.out.println("OtherInterface about method is called");
    }
}
