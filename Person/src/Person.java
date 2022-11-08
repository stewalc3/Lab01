import java.util.Calendar;

public class Person {
   private String ID;
   private String firstName;
   private String lastName;
   private String title;
   private int YOB;
   Calendar c = Calendar.getInstance();


    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    public String toCSVDataRecord() {
        return ID + "," + firstName + "," + lastName + "," + title + "," + YOB;
    }
    public String fullName() {
        return firstName + " " + lastName;
    }
    public String formalName() {
        return title + " " + fullName();
    }
    public int getAge() {
        return c.get(Calendar.YEAR)- YOB;
    }
    public int getAge(int year) {
        return c.get(Calendar.YEAR)- year;
    }

}

