import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

public class Test {
    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIntancia();
        System.out.println(eager);
        eager = SingletonEager.getIntancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getIntancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getIntancia();
        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrar("Boo", "78946513");
    }
}
