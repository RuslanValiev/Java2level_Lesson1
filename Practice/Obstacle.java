package Practice;

public abstract class Obstacle {
    int dimension;

    public Obstacle(int dimension) {
        this.dimension = dimension;
    }

    abstract void passTheTest(Participants participants);
}
