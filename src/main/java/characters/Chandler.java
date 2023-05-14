package characters;


public class Chandler extends FriendBaseEntity {

    public Chandler(String name, String[] lines) {
        super(name, lines);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS);
            System.out.println(this.getCharacterName() + ": " + this.getLines()[0]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 2);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[1]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 2);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[2]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 5);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[3]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 2);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[4]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
