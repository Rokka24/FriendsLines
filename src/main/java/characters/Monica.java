package characters;


public class Monica extends FriendBaseEntity {

    public Monica(String name, String[] lines) {
        super(name, lines);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 8);
            System.out.println(this.getCharacterName() + ": " + this.getLines()[0]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
