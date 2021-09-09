class SingletonPattern{
    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern (){}

    public satic SingletonPattern getInstance(){
        return instance;

    }
}

class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;

    }
}
class SingletonSynchronizedMtehod{
    private static SingletonSynchronizedMethod instance;
    private SingletonSynchronizedMethod(){}
    public static synchronized singletonSynchronizedMethod getInstance(){
        if (instance == null){
            instance = new SingletonSynchronizedMtehod();
        }

        return instance;
    }
}
class SingletonSynchronized{
    private static SingletonSynchronized instance;
    private SingletonSynchronized(){}
    public static synchronized singletonSynchronize getInstance(){
        if (instance == null) {
            synchornized(SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronizedMtehod();
                }
            }
        }

        return instance;
    }
}
public class SingletonExample{
    public static void main(string[] ages){
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        singleton instance1 = singleton.getInstance();
        system.out.println(instance1);

        singleton instance2 = singleton.getInstance();
        system.out.println(instance2);


    }

}