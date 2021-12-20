package TasksHWLOther.CatBreed;

public class Main {
    public static void main( String[] args ) {

        Persidska persidska = new Persidska(" Персидський", "Барсик", "Белый");
        persidska.CatsInfo();
        System.out.println("Цвет : " + persidska.getColor());






        Siamska siamska= new Siamska("Сиамский","Пушок","Светло коричневый");

      siamska.CatsInfo();
        System.out.println("Цвет :  " + siamska.getColor());





        YardCats yardCats = new YardCats("Дворовой","Семен", "Черный ");
        yardCats.CatsInfo();
          System.out.println("Цвет : " +yardCats.getColor());


    }
}
