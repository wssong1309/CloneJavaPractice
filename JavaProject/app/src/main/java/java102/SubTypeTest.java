package java102;

import java.util.ArrayList;
import java.util.List;

public class SubTypeTest {
    public static void main(String[] args) {
        // List<Content> musicList = new ArrayList<Music>(); //error
        List<Music> musicList = new ArrayList<Music>();
        musicList.add(new Music("스마트IT 노래1"));
        musicList.add(new Music("세명대학교 노래1"));

        Player.play(musicList);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Player.addRecommendedContent(musicList);
        Player.play(musicList);

        List<Content> contents = new ArrayList<>();
        contents.add(new Music("Smart Song 03"));
        contents.add(new Music("Smart Song 04"));

        Player.play(contents);
    }
}
