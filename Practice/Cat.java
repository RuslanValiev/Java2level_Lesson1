package Practice;

public class Cat implements Participants{
    boolean ready = true;
    String name;
    private int canRun;
    private int canJump;

    public Cat(String name, int canRun, int canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public boolean getReady() {
        return ready;
    }

    @Override
    public boolean setReady() {
        return ready = false;
    }

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

    @Override
    public void Jump() {
        System.out.println("Cat is jumping!");
    }

    @Override
    public void Run() {
        System.out.println("Cat is running!");
    }
}
