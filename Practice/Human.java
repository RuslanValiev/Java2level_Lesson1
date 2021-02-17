package Practice;

public class Human implements Run, Jump {

    private int canRun = 100;
    private int canJump = 10;

    @Override
    public void Jump() {
        System.out.println("Human is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Human is running!");
    }
}
