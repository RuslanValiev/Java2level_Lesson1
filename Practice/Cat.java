package Practice;

public class Cat implements Runing, Jumping{

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
