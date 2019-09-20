package Zoo;

public class Animal{

    private String animalName;

    public void setName(String name){
        animalName = name;
    }

    public void getName(){
        System.out.print(animalName);
    }

    public void getName(String add){
        System.out.print(animalName + add);
    }

    public void wakeup(){

        System.out.println(animalName+ " woke up");

    }

    public void eat(){
        System.out.println(animalName+ " is eating");
    }

    public void sleep(){
        System.out.println(animalName+ " is sleeping");
    }

}
