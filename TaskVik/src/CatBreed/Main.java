package TasksHWLOther.CatBreed;

public class Main {
    public static void main( String[] args ) {

        Persidska persidska = new Persidska(" Персидський", "Барсик");
        persidska.CatsInfo();

        Siamska siamska= new Siamska("Сиамский","Пушок" );
        siamska.CatsInfo();

        YardCats yardCats = new YardCats("Дворовой","Семен");
        yardCats.CatsInfo();
    }
}
