package characters;

import lombok.*;


@Getter
@Setter
@ToString(exclude = "lines")
@AllArgsConstructor
public abstract class FriendBaseEntity extends Thread {

    protected static final long SINGLE_TIMELAPSE_IN_MILLIS = 400L;

    private String characterName;
    private String[] lines;
}