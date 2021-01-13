import java.time.LocalDate;

public class Game {
    private String gameName;

    private int metapuntk;
    private float benpunkt;
    private LocalDate datum;

    public Game(String name, int metapuntk, float benpunkt, LocalDate datum) {
        this.gameName = name;
        this.metapuntk = metapuntk;
        this.benpunkt = benpunkt;
        this.datum = datum;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String name) {
        this.gameName = name;
    }

    public int getMetapuntk() {
        return metapuntk;
    }

    public void setMetapuntk(int metapuntk) {
        this.metapuntk = metapuntk;
    }

    public float getBenpunkt() {
        return benpunkt;
    }

    public void setBenpunkt(float benpunkt) {
        this.benpunkt = benpunkt;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "game{" +
                "name='" + gameName + '\'' +
                ", metapuntk=" + metapuntk +
                ", benpunkt=" + benpunkt +
                ", datum=" + datum +
                '}';
    }
}
