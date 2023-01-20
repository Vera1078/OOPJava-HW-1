import javax.sound.midi.Soundbank;

public class Cat {

    public Person master;
    private String breed;
    private String name;

    public Cat (Person master, String breed, String name){
        this.master = master;
        this.breed = breed;
        this.name = name;

    }

    public Person getMaster() {
        return master;
    }
    public void setMaster (Person master){
        this.master = master;
    }
    public String getBreed(){
        return  breed;
    }

    public void setBreed (String breed){
        this.breed = breed;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void say(){
        System.out.println("-Мяяяяяу");
    }


    public String toString() {
        return("Хозяин: " + this.master + "; " + "Порода: " + this.breed + ", " + " Кличка: " + this.name);
    }
}
