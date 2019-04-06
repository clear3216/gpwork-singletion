package singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton obj;

    private LazySimpleSingleton() {}

    public static LazySimpleSingleton getInstance() {
        if(obj == null) {
            obj = new LazySimpleSingleton();
        }
        return  obj;
    }

}
