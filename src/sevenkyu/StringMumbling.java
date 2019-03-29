package sevenkyu;
import java.lang.StringBuilder;

public class StringMumbling {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        for(int characterIndex = 0; characterIndex < s.length(); characterIndex++){

            for(int timesAppended = 0; timesAppended <= characterIndex; timesAppended++) {
                if (timesAppended == 0){ result.append(s.toUpperCase().charAt(characterIndex)); }
                else { result.append(s.toLowerCase().charAt(characterIndex)); }
            }

            if (characterIndex <= s.length()-2){ result.append('-'); }
        }

        return result.toString();
    }
}
