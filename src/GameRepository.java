import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GameRepository {
    private List<Game> games = new ArrayList<>();
    private Reader reader = new Reader() {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return 0;
        }

        @Override
        public void close() throws IOException {

        }
    };

    public void read() throws IOException {
        List<String> gameName = reader.read(0);
        List<String> meta = reader.read(1);
        List<String> ben = reader.read(2);
        List<String> date = reader.read(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
        for(int i=0; i < gameName.size(); ++i)
        {
            LocalDate date1 = LocalDate.parse(date.get(i),formatter);
            Game g = new Game(gameName.get(i),Integer.parseInt(meta.get(i)),
                    Float.parseFloat(ben.get(i)), date1);
            games.add(g);
        }
    }
    public void write(){
        for (Game g:games)
        {
            System.out.println(g.toString());
        }
    }

    public List<Game> meta(){
        List<Game> g = games.stream()
                .sorted(Comparator.comparingInt(Game::getMetapuntk).reversed())
                .collect(Collectors.toList());
        return g;
    }

    public List<Game> date(){
        List<Game> g = games.stream()
                .sorted(Comparator.comparing(Game::getDatum).reversed())
                .sorted(Comparator.comparing(Game::getGameName))
                .collect(Collectors.toList());
        return g;
    }

    public List<Game> score(){
        List<Game> g = games.stream()
                .filter(o->o.getBenpunkt()>9)
                .collect(Collectors.toList());
        return g;
    }


}

