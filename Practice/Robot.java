package Practice;

public class Robot implements Participants{
    String name;
    private int canRun;
    private int canJump;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCanRun() {
        return canRun;
    }

    @Override
    public int getCanJump() {
        return canJump;
    }



    public Robot(String name, int canRun, int canJump) {
        this.name = name;
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
