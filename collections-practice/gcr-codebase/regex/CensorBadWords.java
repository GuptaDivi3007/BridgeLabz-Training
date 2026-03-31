public class CensorBadWords {
    
    public static String censorBadWords(String text, String[] badWords) {
        if (text == null) {
            return null;
        }
        String result = text;
        
        for (String bad : badWords) {
            String pattern = "\\b" + bad + "\\b";
            result = result.replaceAll("(?i)" + pattern, "****");
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        String output = censorBadWords(input, badWords);
        System.out.println(output);
    }
}
