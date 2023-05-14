package characters;


public class Phoebe extends FriendBaseEntity {

    public Phoebe(String name, String[] lines) {
        super(name, lines);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 2);
            System.out.println(this.getCharacterName() + ": " + this.getLines()[0]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 4);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[1]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 3);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[2]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
