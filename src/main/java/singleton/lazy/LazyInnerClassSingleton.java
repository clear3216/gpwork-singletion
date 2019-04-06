package singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {}

    private static class InnerSingletionInstanceWrap {

        private static final LazyInnerClassSingleton obj = new LazyInnerClassSingleton();

    }

    public static LazyInnerClassSingleton getInstance() {
        return  InnerSingletionInstanceWrap.obj;
    }

}
