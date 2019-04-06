package singleton.hungry;

public class HungryStaticSingletion {

    private static final HungryStaticSingletion obj;

    static {
        obj = new HungryStaticSingletion();
    }

    private HungryStaticSingletion() {}

    public static HungryStaticSingletion getInstance() {
        return obj;
    }

}
