import java.util.ArrayList;
public class EnglishState implements State{
    private MusicBox box;
    public EnglishState(MusicBox box) {
        this.box = box;
    }
    public void pressStarButton() {
        String lyrics = "Twinkle, twinkle, little star How I wonder what you are Up above the world so high Like a diamond in the sky Twinkle, twinkle, little star. 6 ";
        ArrayList<String> arr = new ArrayList<String>();
        String catcher = "";
        int sequencer = 0;
        while (!catcher.equals("6")) {
            catcher = lyrics.substring(sequencer, lyrics.indexOf(" "));
            lyrics = lyrics.substring(lyrics.indexOf(" ")+1);
            if (!catcher.equals("6"))
                arr.add(catcher);
        }
        box.playSong("Twinkle twinkle Little Star", arr);
    }
    public void pressHappyButton() {
        String lyrics = "If you're happy and you know it clap your hands If you're happy and you know it clap your hands If you're happy and you know it And you really want to show it If you're happy and you know it clap your hands 6 ";
        ArrayList<String> arr = new ArrayList<String>();
        String catcher = "";
        int sequencer = 0;
        while (!catcher.equals("6")) {
            catcher = lyrics.substring(sequencer, lyrics.indexOf(" "));
            lyrics = lyrics.substring(lyrics.indexOf(" ")+1);
            if (!catcher.equals("6"))
                arr.add(catcher);
        }
        box.playSong("If You're Happy And You Know It", arr);
    }
    public void pressEnglishButton() {
        System.out.println("You are already in English Mode");
    }
    public void pressFrenchButton() {
        FrenchState french = new FrenchState(box);
        box.setState(french);
    }
    public void pressSpanishButton() {
        SpanishState spanish = new SpanishState(box);
        box.setState(spanish);
    }
}