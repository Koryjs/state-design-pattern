import java.util.ArrayList;
public class MusicBox {
    private State englishState ;
    private State frenchState;
    private State spanishState;
    private State state;
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = new EnglishState(this);
    }
    public void pressStarButton() {
        state.pressStarButton();
    }
    public void pressHappyButton() {
        state.pressHappyButton();
    }
    public void pressEnglishButton() {
        state.pressEnglishButton();;
    }
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }
    public void setState (State state) {
        this.state = state;
    }
    public State getEnglishState() {
        return englishState;
    }
    public State getFrenchState() {
        return frenchState;
    }
    public State getSpanishState() {
        return spanishState;
    }
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println(songName);
        for (int a = 0; a < lyrics.size(); a++) {
            System.out.println(lyrics.get(a));
        }
    }
}
