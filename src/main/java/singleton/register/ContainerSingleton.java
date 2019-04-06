package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static final Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                try {
                    ioc.put(className, Class.forName(className).newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ioc.get(className);
        }
    }

}
