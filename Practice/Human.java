package Practice;

public class Human implements Participants {
    boolean ready = true;
    String name;
    private int canRun;
    private int canJump;


    public Human(String name, int canRun, int canJump) {
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

    public String getName() {
        return name;
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
