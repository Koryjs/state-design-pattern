import java.util.ArrayList;
public class FrenchState implements State {
    private MusicBox box;
    public FrenchState(MusicBox box) {
        this.box = box;
    }
    public void pressStarButton() {
        String lyrics = "Scintille, scintille, petite étoile Comme je me demande ce que tu es Au-dessus du monde si haut Comme un diamant dans le ciel Scintille, scintille, petite étoile. 6 ";
        ArrayList<String> arr = new ArrayList<String>();
        String catcher = "";
        int sequencer = 0;
        while (!catcher.equals("6")) {
            catcher = lyrics.substring(sequencer, lyrics.indexOf(" "));
            lyrics = lyrics.substring(lyrics.indexOf(" ")+1);
            arr.add(catcher);
        }
        box.playSong("Scintille, scintille, petite étoile", arr);
    }
    public void pressHappyButton() {
        String lyrics = "Si vous êtes heureux et que vous le savez, tapez dans vos mains Si vous êtes heureux et que vous le savez, tapez dans vos mains Si vous êtes heureux et que vous le savez Et que vous voulez vraiment le montrer Si vous êtes heureux et que vous le savez, tapez dans vos mains tes mains 6 ";
        ArrayList<String> arr = new ArrayList<String>();
        String catcher = "";
        int sequencer = 0;
        while (!catcher.equals("6")) {
            catcher = lyrics.substring(sequencer, lyrics.indexOf(" "));
            lyrics = lyrics.substring(lyrics.indexOf(" ")+1);
            arr.add(catcher);
        }
        box.playSong("If You're Happy And You Know It", arr);
    }
    public void pressEnglishButton() {
        EnglishState english = new EnglishState(box);
        box.setState(english);
    }
    public void pressFrenchButton() {
        System.out.println("You are already in French Mode");
    }
    public void pressSpanishButton() {
        SpanishState spanish = new SpanishState(box);
        box.setState(spanish);
    }
}
