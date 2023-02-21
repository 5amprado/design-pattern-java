package singleton;

/**
 * Singleton "Lazy Holder"
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder intancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getIntancia(){
        return InstanceHolder.intancia;
    }

}
