public class Program {

    public static void main(String[] args) {

        Person p = new Person("Sven", 37);
        Person p1 = new Person("Ilse", 35);
        Person p2 = new Person("Diter", 20);

        Cat push = new Cat ( p2, "sphinx", "Пушок");

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(push);
        System.out.println("------------------------");
        System.out.println("*** Беседа хозяин-кот ***");
//       котик подает голос
        push.say();
//        хозяин идет кормить котика
        p2.feed();

//        if (pushok.say()){
//
//
//        }
    }

}
