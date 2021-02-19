package Practice;

public class Test {

    public static void main(String[] args) {
        Participants[] participants = {
                new Human("Ivan", 12, 1),
                new Cat( "Vasya", 15, 2),
                new Robot("Alfa",  20, 5)};

        Obstacle[] obstacles = {
                new Wall(3),
                new Treadmill(18)};

        for (int i = 0; i < obstacles.length; i++) {
            if (obstacles[i] instanceof Treadmill) {
                for (int j = 0; j < participants.length; j++) {
                    obstacles[i].passTheTest(participants[j]);
                }
            }
        }

    }


}



