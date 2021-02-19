package Practice;

public class Human implements Participants {

    private int canRun = 100;
    private int canJump = 10;

    public Human(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public int getCanRun() {
        return canRun;
    }

    public int getCanJump() {
        return canJump;
    }

    @Override
    public void Jump() {
        System.out.println("Human is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Human is running!");
    }
}
