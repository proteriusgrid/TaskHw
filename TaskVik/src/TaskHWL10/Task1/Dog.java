package TaskHWL10.Task1;

public class Dog extends Animal{

    private String name;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String makeNoise() {
        return "Гав-гав!";
    }

//    @Override
//    public boolean equals(Object object) {
//
//        if (this == object) return true;
//        if (!(object instanceof Dog)) return false;
//        if (!super.equals(object)) return false;
//
//        Dog dog = (Dog) object;
//        return name != null ? name.equals(dog.name) : dog.name == null;
//    }

//    @Override
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
//    }

    @Override
    public String toString() {
        return " Dog { " + " food = " + getFood() + '\'' + ", location = " + getLocation() + '\'' +'}';
    }
}
