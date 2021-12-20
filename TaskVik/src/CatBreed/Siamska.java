package TasksHWLOther.CatBreed;

public class Siamska extends Cats{
    private String breed;
    private String name;

    private  String color;

    public Siamska( String breed, String name ,String color ) {
        super(breed,name,color );
        this.breed = breed;
        this.name=name;
        this.color = color;


    }

//    public void setColor( String color ) {
//        this.color = color;
//    }
@Override
    public String getColor(){
        return this.color;
    }
}
