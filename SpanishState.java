import java.util.ArrayList;
public class SpanishState implements State {
    private MusicBox box;
    public SpanishState(MusicBox box) {
        this.box = box;
    }
    public void pressStarButton() {
        String lyrics = "Centellea, centellea, estrellita Cómo me pregunto qué eres Por encima del mundo tan alto Como un diamante en el cielo Centellea, centellea, estrellita. 6 ";
        ArrayList<String> arr = new ArrayList<String>();
        String catcher = "";
        int sequencer = 0;
        while (!catcher.equals("6")) {
            catcher = lyrics.substring(sequencer, lyrics.indexOf(" "));
            lyrics = lyrics.substring(lyrics.indexOf(" ")+1);
            arr.add(catcher);
        }
        box.playSong("Centellea, centellea, estrellita", arr);
    }
    public void pressHappyButton() {
        String lyrics = "Si eres feliz y lo sabes, aplaude Si eres feliz y lo sabes, aplaude Si eres feliz y lo sabes Y realmente quieres demostrarlo Si eres feliz y lo sabes, aplaude tus manos 6 ";
        ArrayList<String> arr = new ArrayList<String>();
        String catcher = "";
        int sequencer = 0;
        while (!catcher.equals("6")) {
            catcher = lyrics.substring(sequencer, lyrics.indexOf(" "));
            lyrics = lyrics.substring(lyrics.indexOf(" ")+1);
            arr.add(catcher);
        }
        box.playSong("Si eres feliz y lo sabes", arr);
    }
    public void pressEnglishButton() {
        EnglishState english = new EnglishState(box);
        box.setState(english);
    }
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish Mode");
    }
    public void pressFrenchButton() {
        FrenchState french = new FrenchState(box);
        box.setState(french);
    }
}
