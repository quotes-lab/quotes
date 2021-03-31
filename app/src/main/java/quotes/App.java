/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        //open file and push json to array
        List<Quote> quotes = getQuotes();
        //get a single random quote
        Quote quote = quotes.get(((int)(Math.random() * (quotes.size()-1))));
        String formattedQuote = String.format("%s said: %s", quote.author, quote.text);
        //print quote
        System.out.println(formattedQuote);
    }

    public static List<Quote> getQuotes()throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader reader;
        try {
            reader = new FileReader("app/src/test/resources/recentquotes.json");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }

        //https://howtodoinjava.com/gson/gson-parse-json-array/
        Type userListType = new TypeToken<ArrayList<Quote>>(){}.getType();
        return gson.fromJson(reader, userListType);
    }
}
