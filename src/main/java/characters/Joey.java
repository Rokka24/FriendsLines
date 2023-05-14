package characters;


public class Joey extends FriendBaseEntity {

    public Joey(String name, String[] lines) {
        super(name, lines);
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getCharacterName() + ": " + this.getLines()[0]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 4);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[1]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 3);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[2]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 4);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[3]);
            Thread.sleep(SINGLE_TIMELAPSE_IN_MILLIS * 2);

            System.out.println(this.getCharacterName() + ": " + this.getLines()[4]);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
