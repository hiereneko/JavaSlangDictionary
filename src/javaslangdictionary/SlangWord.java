package javaslangdictionary;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SlangWord {
    public String word;
    public List<String> definitions;
    
    public SlangWord() {
        definitions = new ArrayList<>();
    }
    public SlangWord(String w, List<String> d) {
        word = w;
        definitions = d;
    }
    public SlangWord(String line) {
        String[] slangData = line.split("`");
        word = slangData[0];
        definitions = Arrays.asList(slangData[1].split("\\| "));
    }

    public String toString() {
        String res = "Slang: " + word + "\nMeanings: ";
        for (int i = 0; i < definitions.size(); ++i)
            res += definitions.get(i) + (i < definitions.size() - 1 ? " | " : "");
        return res;
    }
}
