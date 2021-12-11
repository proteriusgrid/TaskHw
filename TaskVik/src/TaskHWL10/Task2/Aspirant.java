package TaskHWL10.Task2;

public class Aspirant  extends Student{
    String work;

    public Aspirant  (   String firstName, String lastName, String group, double averageMark, String work){

        super(firstName, lastName, group, averageMark);

        this.work= work;

    }
    void  printAspirant(){
        System.out.println(firstName);
    }

    @Override
    public double getScholarship(){
        return  averageMark ==5 ? 200 : 180;
//        return super.getScholarship();
    }

    public static void main( String[] args ) {
        Student student= new Student("Viktor", "Fedorov", "Group 301",4.2);
        Aspirant aspirant = new Aspirant ("Peter", "Ivanov", "Group 601", 5, "work");

        Student[] students = {student,aspirant};
        for (Student stud : students) {

            System.out.print( stud.group+ " - ");
            System.out.print( stud.firstName+ " ");
            System.out.print( stud.lastName+ " = ");

            System.out.println(stud.getScholarship());
        }
    }
}
