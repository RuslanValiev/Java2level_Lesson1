package Practice;

public class Wall extends Obstacle{


    public Wall(int dimension) {
        super(dimension);
    }

    @Override
    void passTheTest(Participants participants) {
        if (participants.getCanJump() >= dimension){
            participants.Jump();
        }else System.out.println(participants.getName() + " can not to jump this wall!");
//        participants.setReady();
    }
}
