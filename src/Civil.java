public class Civil extends Student{
    private boolean concreteInStomach;

    public Civil(int GPA, int numberOfAp) {
        super (GPA, numberOfAp);
        concreteInStomach = false;
    }

    public void eatConcrete() {
        concreteInStomach = true;
        System.out.println("Concrete yummy");
    }

    public boolean isConcreteInStomach() {
        return concreteInStomach;
    }
}
