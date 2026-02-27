public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String hint = "";
        for (int i = 0; i < word.length(); i++) {
            char cha = guess.charAt(i);
            if(word.contains(cha + "")) {
                if (word.charAt(i) == cha) hint += cha;
                else hint += "+";
            } else hint += "*";
        }
        return hint;
    }
}
