package lab5.p4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class HtmlAnalyzer {

    public static HashMap<String, Integer> getTags(String html) {
        String regex = "<[!A-Za-z][^<>]*>";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(html);
        String[] searchResults = match.results().map(MatchResult::group).toArray(String[]::new);

        ArrayList<String> tags = new ArrayList<>();
        for (String searchResult :
                searchResults) {
            int firstSpaceIndex = searchResult.indexOf(' ');
            if (firstSpaceIndex != -1) {
                String tag = searchResult.substring(0, firstSpaceIndex) + ">";
                tags.add(tag);
            } else {
                tags.add(searchResult);
            }
        }

        HashMap<String,Integer> tagsMap = new HashMap<>();
        for (String tag :
                tags) {
            if (!tagsMap.containsKey(tag)) {
                tagsMap.put(tag, 1);
            } else {
                int prevValues = tagsMap.get(tag);
                tagsMap.put(tag, (prevValues + 1));
            }
        }
        return tagsMap;
    }
}
