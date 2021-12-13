package TaskHWL10.Task1;



public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кот ест.");
    }

    @Override
    public String makeNoise() {
        return "Мяу";
    }

    @Override
    public String toString() {
        return " Cat { " + " food= " + getFood() + '\'' +", location= " + getLocation() + '\'' +'}';
    }
}
