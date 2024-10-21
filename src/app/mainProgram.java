package app;

public class mainProgram {

    public static void main(String[] args) {

    Person cat = new Person("Bony",5,"Mouse catcher");
    Person mouse = new Person("Jerry", 1, "Cheese biter");
    Person woman = new Person("Lady", 61, "Housewife");

    System.out.println(cat);
    System.out.println(mouse);
    System.out.println(woman);

    cat.setProfession("Food taster");

    System.out.println("(Після оновлення професії)");
    System.out.println(cat);

    }

}
