package TaskHWL11.Task3;

public class Main {
    public static void main( String[] args ) {
        Instrument[] instruments = new Instrument[3];

        instruments[0] = new Gitara();
        instruments[1] = new Drum();
        instruments[2] = new Pipe();

        for (Instrument instrument: instruments){
            instrument.play();
        }


    }
}
