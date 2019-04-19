package construction.singleton;

public class SimpleSingleton {

    //niebezpieczna wielowątkowo implementacja
    private static SimpleSingleton ourInstance = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return ourInstance;
    }

    private SimpleSingleton() {
    }

    //bezpieczna wielowątkowo aplikacja

//    public static SimpleSingleton getInstance() {
//        return SimpleSingleton.SimpleSingletonHolder.INSTANCE;
//    }
//
//    private static class SimpleSingletonHolder {
//        private static final SimpleSingleton INSTANCE = new SimpleSingleton();
//    }
}
