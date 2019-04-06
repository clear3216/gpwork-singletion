package singleton.lazy;

public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton obj;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if(obj == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (obj == null) {
                    obj = new LazyDoubleCheckSingleton();
                }
            }
        }
        return  obj;
    }

}
