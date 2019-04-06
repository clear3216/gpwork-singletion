package singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton obj = new SeriableSingleton();

    private SeriableSingleton() {}

    public static SeriableSingleton getInstance() {return obj;}

    private Object readResolve() {return obj;}

}
