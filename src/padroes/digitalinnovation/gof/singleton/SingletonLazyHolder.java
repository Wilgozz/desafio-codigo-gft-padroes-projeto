package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @Author Kamylle Willgozz
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
