package singleton;

/**
 * Singleton "prequiçoso"
 */

public class SingletonLazy {
    private static SingletonLazy intancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getIntancia(){
        if(intancia == null){
            intancia = new SingletonLazy();
        }
        return intancia;
    }

}
