package TaskHWL11.Task3;

public class Gitara implements Instrument {
    private  int cordNumber;

    public  int getCordNumber(){
        return cordNumber;

    }
    public void setCordNumber(int cordNumber){
        this.cordNumber= cordNumber;
    }

    @Override
    public void play(){
        System.out.println("Играет гитара");

    }
    @Override
    public boolean equals(Object object){
        if (this == object ) return true;
        if (!(object instanceof  Gitara)) return false;

        Gitara gitara= (Gitara) object;
        return cordNumber == gitara.cordNumber;

    }


    @Override
    public  int hashCode(){
        return cordNumber;
    }


    @Override
    public String toString(){
        return "Gitara" +" { "+ "cordNumber = " + cordNumber+ " }";
    }



}
