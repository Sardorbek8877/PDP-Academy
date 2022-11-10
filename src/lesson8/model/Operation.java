package lesson8.model;

public class Operation implements Operationable{

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
