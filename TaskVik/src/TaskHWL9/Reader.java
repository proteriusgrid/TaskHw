package TaskHWL9;

public class Reader {
    private String fio;
    private int numberTicket;
    private String faculty;
    private String dob;
    private String phoneNumber;

    public Reader(String fio, int numberTicket, String faculty, String dob, String phoneNumber) {

        this.fio = fio;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.dob = dob;
        this.phoneNumber = phoneNumber;

    }

    public Reader() {

    }
    public String getFio(){

        return fio;
    }

    public void setFio(String fio){

        this.fio= fio;
    }
    public int getNumberTicket(){

        return  numberTicket;
    }

    public  void setNumberTicket(
            int numberTicket){
        this.numberTicket = numberTicket;
    }

    public String getFaculty(){

        return faculty;
    }
    public String getDob() {

        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {

        return phoneNumber;
    }

    public void setPhone(String phone) {

        this.phoneNumber = phone;
    }
    public void takeBook(int numberTicket) {

        System.out.println(this.fio + " took " + numberTicket + " books.");
    }

    public void takeBook(String... books) {

        System.out.println(this.fio + " took the following books: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " took the following books: ");
        for (Book book : books) {
            System.out.println(book.getName() + ", author - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int numberTicket) {
        System.out.println(this.fio + " returned " + numberTicket + " books.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " returned the following books: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " returned the following books: ");
        for (Book book : books) {
            System.out.println(book.getName() + ", author - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" + "fio='" + fio + '\'' + ", number=" + numberTicket + ", faculty='" + faculty + '\'' + ", dob='" + dob + '\'' +
                ", phone='" + phoneNumber + '\'' + '}';
    }


}
