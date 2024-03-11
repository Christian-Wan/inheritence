public class Compsci extends Student{

    private boolean hasWrittenCode;

    public Compsci(int GPA, int numberOfAp) {
        super (GPA, numberOfAp);
        hasWrittenCode = false;
    }

    public void writeCode() {
        hasWrittenCode = true;
        System.out.println("I have written some code");
    }

    public boolean isHasWrittenCode() {
        return hasWrittenCode;
    }
}
