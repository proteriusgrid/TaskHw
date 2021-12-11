package TaskHWL10.Task1;

public class Main {
    public static void main( String[] args ) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Корма для собак. ", " Сад возле дома ");
        animals[1] = new Cat("Корм для котов .", " Квартира ");
        animals[2] = new Horse("Комбикорм для лошадей.", "Конный клуб");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }

}
