package TasksHWLOther.CatBreed;

public class YardCats extends Cats{
    private String breed;
    private String name;

    private  String color;

    public YardCats( String breed, String name, String color ) {
        super(breed,name,color );
        this.breed = breed;
        this.name=name;
        this.color = color;
    }



    @Override
    public String getColor(){
        return this.color;
    }
}
