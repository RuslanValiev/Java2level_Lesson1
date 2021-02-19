package Practice;

public class Treadmill extends Obstacle{

    public Treadmill(int dimension) {
        super(dimension);
    }

    @Override
    void passTheTest(Participants participants) {
        if (participants.getCanRun() >= dimension) participants.Run();
        else System.out.println(participants.getName() + " can not to run this treadmill!");
    }
}
