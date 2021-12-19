package TasksHWLOther.CatBreed;

class Cats  {
    private String breed;
    private String name;

    public  Cats(String breed,String name) {
        this.breed = breed;
        this.name = name;


    }

    public String getBreed() {
        return breed;
    }

    public void setBreed( String breed ) {
        this.breed = breed;
    }

    public void CatsInfo(){
        System.out.println("Парода -  " + this.breed +  "; "+ " Кличка: " + this.name +"." );
    }
}
