package Practice;

public class Robot implements Participants{

    private int canRun = 200;
    private int canJump = 20;

    public Robot(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public void Jump() {
        System.out.println("Robot is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Robot is running!");
    }
}
