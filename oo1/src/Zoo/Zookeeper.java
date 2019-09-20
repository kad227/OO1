package Zoo;

public class Zookeeper {

    private static void getName(Animal animal){
        animal.getName("\n");
        System.out.println(animal.getClass().getSimpleName());

    }


    public static void main(String[] args) {
        System.out.println("counting The zoo animals");
        Dog dog1 = new Dog();
        dog1.setName("Doggie");
        getName(dog1);

        Dog dog2 = new Dog();
        dog2.setName("Douglas");
        getName(dog2);

        Cat cat1 = new Cat();
        cat1.setName("Charmer");
        getName(cat1);

        Cat cat2 = new Cat();
        cat2.setName("Cathy");
        getName(cat2);

        Rhino rhino1 = new Rhino();
        rhino1.setName("Ryan");
        getName(rhino1);

        Rhino rhino2 = new Rhino();
        rhino2.setName("Ramdan");
        getName(rhino2);

        Wolf wolf1 = new Wolf();
        wolf1.setName("Waleed");
        getName(wolf1);

        Wolf wolf2 = new Wolf();
        wolf2.setName("Will");
        getName(wolf2);

        System.out.println("Wake Up!");
        dog1.wakeup();
        dog2.wakeup();
        cat1.wakeup();
        cat2.wakeup();
        rhino1.wakeup();
        wolf1.wakeup();
        wolf2.wakeup();
        rhino2.wakeup();


        System.out.println("Eat!");
        dog1.eat();
        dog2.eat();
        wolf1.eat();
        rhino2.eat();

        System.out.println("Time to open the zoo!");
        cat1.makeNoise();
        dog1.makeNoise();
        cat2.makeNoise();
        wolf1.makeNoise();
        rhino1.makeNoise();
        cat1.makeNoise();
        wolf2.makeNoise();
        cat2.makeNoise();

        System.out.println("The zoo is closed");
        cat1.roam();
        wolf2.roam();
        rhino1.roam();
        dog2.roam();
        cat2.makeNoise();

        System.out.println("Time to sleep");
        cat1.sleep();
        dog1.sleep();
        dog2.sleep();
        rhino1.sleep();
        rhino2.sleep();
        wolf1.sleep();
        wolf2.sleep();
        cat2.makeNoise();
        cat2.sleep();







}

}
