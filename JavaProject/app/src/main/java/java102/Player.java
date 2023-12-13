package java102;

import java.util.List;

public class Player {
    // [1] Producer Extends (read) P.E
    public static void play(List<? extends Content> playList) { // extends -> Upperbound
        for (Content c : playList) {
            System.out.println("재생: " + c.getTitle());
        }
    }

    // [2] Consumer Super (write) C.S
    public static void addRecommendedContent(List<? super Music> playList) {
        Music music = new Music("chatGPT4 Song");
        playList.add(music);
        // playList.add(new Movie("Star Wars"));
    }
}
