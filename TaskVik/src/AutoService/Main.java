package TasksHWLOther.AutoService;

public class Main {
    public static void main( String[] args ) {

        Reader reader1 = new Reader("VW " , 1234,"T5","2004","380912345678", 2.5 ,"Minibus","White");
        Reader reader2 = new Reader("BMW " , 1002,"M3","2021","380922345678", 3.0 ,"Coupe","Red");
        Reader reader3 = new Reader("Ford " , 1234,"f-150 raptor","2021","380932345678", 3.5,"Pickup truck","Black");

        Reader[] readers = { reader1, reader2, reader3};

        List list1 = new List("Ford f-150 ", " Bob ");
        List list2 = new List("ford mustang gt500 ", " Max ");
        List list3 = new List("Audi R8 ", " John ");
        List[] lists={list1,list2,list3};

        printReaders(readers);
        printLists(lists);


        reader1.takeList("Audi R8, Emma","VW Golf, Mia");
        reader2.takeList("audi rs7, Sergii  ", "McLaren P1, Bob");
        reader3.takeList(list1,list2,list2);

        reader1.returnList(2);
        reader2.returnList("McLaren Speedtail, Volodymyr");
        reader3.returnList(list3);

    }


    private static void printLists(List[] lists){
        System.out.println("Take a lists : ");
        for (List list: lists){
            System.out.println(list.getInfo());
        }
        System.out.println();
    }
    private static void printReaders(Reader[] readers){
        System.out.println("Reader list: ");
        for (Reader reader: readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}
