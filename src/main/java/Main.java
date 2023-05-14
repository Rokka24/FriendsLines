import characters.*;
import util.LinesUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        FriendBaseEntity joey = new Joey("Joey", LinesUtil.getJoeyLines());
        FriendBaseEntity chandler = new Chandler("Chandler", LinesUtil.getChandlerLines());
        FriendBaseEntity phoebe = new Phoebe("Phoebe", LinesUtil.getPhoebeLines());
        FriendBaseEntity monica = new Monica("Monica", LinesUtil.getMonicaLines());

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(joey);
        executor.execute(chandler);
        executor.execute(phoebe);
        executor.execute(monica);

        executor.shutdown();
    }
}