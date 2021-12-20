package TasksHWLOther.CatBreed;

public class Main {
    public static void main( String[] args ) {

        Persidska persidska = new Persidska(" Персидський", "Барсик", "Белый");
        persidska.CatsInfo();

        Siamska siamska= new Siamska("Сиамский","Пушок","Светло коричневый" );
        siamska.CatsInfo();

        YardCats yardCats = new YardCats("Дворовой","Семен","Черный");
        yardCats.CatsInfo();
    }
}
