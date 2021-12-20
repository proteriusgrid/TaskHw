package TasksHWLOther.CatBreed;

class Cats  {
    private String breed;
    private String name;

    private  String color;

    public  Cats(String breed,String name, String color) {
        this.breed = breed;
        this.name = name;
        this.color = color;



    }

    public Cats( String breed, String name ) {

    }


    public String getBreed() {
        return breed;
    }

    public void setBreed( String breed ) {
        this.breed = breed;
    }




    public String getColor(){
        return this.color;
    }

    public void CatsInfo(){
        System.out.println("Парода -  " + this.breed +  "; "+ " Кличка: " + this.name +  "." );
    }



}
