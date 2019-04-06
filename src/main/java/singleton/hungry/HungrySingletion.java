package singleton.hungry;

public class HungrySingletion {

    private static final HungrySingletion obj = new HungrySingletion();

    private HungrySingletion() {}

    public static HungrySingletion getInstance() {return obj;}

}
