package Practice;

public class Cat implements Running, Jumping{

    private int canRun = 150;
    private int canJump = 15;

    @Override
    public void Jump() {
        System.out.println("Cat is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Cat is running!");
    }
}
