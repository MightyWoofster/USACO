package School;
public class Song {
    public static void main(String[] args){
        Verse chorus = new Verse("Twinkle, twinkle, little star,\nHow I wonder what you are!");
        Verse verse1 = new Verse("Up above the world so high,\nLike a diamond in the sky.");
        Verse verse2part1 = new Verse("When the blazing sun is gone,\nWhen he nothing shines upon,");
        Verse verse2part2 = new Verse("Then you show your little light,\nTwinkle, twinkle, all the night.");
        System.out.println(chorus.getLyrics());
        System.out.println(verse1.getLyrics());
        System.out.println(chorus.getLyrics());
        System.out.println(verse2part1.getLyrics());
        System.out.println(verse2part2.getLyrics());
        System.out.println(chorus.getLyrics());
    }
}
