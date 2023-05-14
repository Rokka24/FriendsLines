package util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LinesUtil {

    public String[] getJoeyLines() {
        return new String[]{"Hey, hey.",
                "Yes, I am. As of today, I am officially Joey Tribbiani, actor slash model.",
                "You know those posters for the City Free Clinic?",
                "No, but I hear lyme disease is open, so... (crosses fingers)",
                "Thanks."};
    }

    public String[] getChandlerLines() {
        return new String[]{"Hey.",
                "And this from the cry-for-help department. Are you wearing makeup?",
                "That's so funny, 'cause I was thinking you look more like Joey Tribbiani, man slash woman. Phoebe: What were you modeling for?",
                "Do you know which one you're gonna be?",
                "Good luck, man. I hope you get it."};
    }

    public String[] getPhoebeLines() {
        return new String[]{"Hey.",
                "What were you modeling for?",
                "You know, the asthma guy was really cute."};
    }

    public String[] getMonicaLines() {
        return new String[]{"Oh, wow, so you're gonna be one of those \"healthy, healthy, healthy guys\"?"};
    }
}