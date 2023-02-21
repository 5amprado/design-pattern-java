package singleton;

/**
 * Singleton "apressado"
 */

public class SingletonEager {
    private static SingletonEager intancia = new SingletonEager();

    private SingletonEager(){super();}

    public static SingletonEager getIntancia(){return intancia;}
}