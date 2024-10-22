package app;

public class Person {

    public String name;
    public int edge;
    public String profession;

    public Person(String name, int edge, String profession) {
        this.name = name;
        this.edge = edge;
        this.profession = profession;
    }

    public void setProfession(String name){

        this.profession = name;

    }

    @Override
    public String toString() {
        return "Ім'я: " + name +
               ", Вік: " + edge +
                ", Професія: " + profession;
    }

}
