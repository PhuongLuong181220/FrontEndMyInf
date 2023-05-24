package Day8.animal;

public class Duck implements RunITF, SwimITF{
    @Override
    public void run() {
        System.out.println("vit chay");
    }

    @Override
    public void swim() {
        System.out.println("vit boi");

    }
}
