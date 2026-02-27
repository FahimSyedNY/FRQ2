public class HiddenWordTester {
    public static void main(String[] args) {
        System.out.println("--- test 1 ---");
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
        System.out.println("--- test 2 ---");
        puzzle = new HiddenWord("TANGERINE");
        System.out.println(puzzle.getHint("EXPERTISE"));
        System.out.println(puzzle.getHint("PARALYZED"));
        System.out.println(puzzle.getHint("LIFEHACKS"));
        System.out.println(puzzle.getHint("ERINETANG"));
        System.out.println(puzzle.getHint("NNNNNNNNN"));
        System.out.println(puzzle.getHint("LLLLLLLLL"));
        System.out.println(puzzle.getHint("TYNGEREIN"));
        System.out.println(puzzle.getHint("TANGERINE"));
    }
}
