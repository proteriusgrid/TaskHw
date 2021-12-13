package TaskHWL10.Task2;

public class Main {
    public static void main( String[] args ) {

        Student student= new Student("Viktor", "Fedorov", "Group 301",4.2);
        Aspirant aspirant = new Aspirant ("Peter", "Ivanov", "Group 601", 5 , "work");
        Student aspirantTwo = new Aspirant ("Alex", "Ivanov", "Group 602", 4.6, "workTwo");


        Student[] students = {student,aspirant,aspirantTwo};
        for (Student stud : students) {

            System.out.print( stud.group + " - ");
            System.out.print( stud.firstName + " ");
            System.out.println(stud.lastName + " - " );

            System.out.print( stud.averageMark+ " = ");

            System.out.println(stud.getScholarship());
//            System.out.println(stud.work);
        }
    }
}
