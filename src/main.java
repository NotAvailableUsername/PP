import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

    /**
    public void sortMetacritic(List<String> jocuri){

    }

    public void writeFileMetacritic(List<String> jocuri) throws IOException {

        BufferedWriter writer  = null;

        try{
            FileWriter fstream = new FileWriter("top-games-metacritic", true);
            writer = new BufferedWriter(fstream);
            for(int i = 0; i < jocuri.size(); i++){
                writer.write(jocuri.get(i));
            }
        }
        catch (IOException e){
            System.err.println();
        }

    }

    public void writeFileDate(){

    }
     */
    public static void main(String[] args) throws FileNotFoundException {
        File fisier = new File("src/top-games-suffled.txt");
        String[] data = new String[0];
        Scanner scan = new Scanner(fisier);
        List<String> gamesFile = new ArrayList<>();
        Game game = new Game();
        while (scan.hasNextLine()) {
            data = scan.nextLine().split("\\*");
            gamesFile.add(data[0]);
            gamesFile.add(data[1]);
            gamesFile.add(data[2]);
            gamesFile.add(data[3]);
            System.out.println(Arrays.deepToString(data));
        }
        scan.close();
        System.out.println("de aici ii in array" + gamesFile);

    }
}
