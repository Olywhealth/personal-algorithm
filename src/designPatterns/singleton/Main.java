package designPatterns.singleton;

public class Main {


    public static void main(String[] args) {
        SingletonEager s1 = SingletonEager.getInstance();
        SingletonEager s2 = SingletonEager.getInstance();
        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());
    }
}
