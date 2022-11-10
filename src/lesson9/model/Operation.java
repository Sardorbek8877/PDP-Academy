package lesson9.model;

@FunctionalInterface
public interface Operation<T> {
    T caculate( T a, T b );

}
