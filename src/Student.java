public class Student {
    private int GPA;
    private int numberOfAp;

    public Student(int GPA, int numberOfAp) {
        this.GPA = GPA;
        this.numberOfAp = numberOfAp;
    }

    public void doHomework() {
        System.out.println("I have done HW");
    }

    public int getGPA() {
        return GPA;
    }

    public int getNumberOfAp() {
        return numberOfAp;
    }
}
