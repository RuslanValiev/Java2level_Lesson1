package Practice;

public class Robot implements Runing, Jumping{

    private int canRun = 200;
    private int canJump = 20;

    @Override
    public void Jump() {
        System.out.println("Robot is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Robot is running!");
    }
}
