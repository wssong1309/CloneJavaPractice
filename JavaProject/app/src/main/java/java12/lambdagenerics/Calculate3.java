package java12.lambdagenerics;

@FunctionalInterface
public interface Calculate3<T> {
    T cal(T a, T b);
}
