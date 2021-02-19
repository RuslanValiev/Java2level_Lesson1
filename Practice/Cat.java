package Practice;

public class Cat implements Participants{

    private int canRun = 150;
    private int canJump = 15;

    public Cat(int canRun, int canJump) {
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public void Jump() {
        System.out.println("Cat is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Cat is running!");
    }
}
