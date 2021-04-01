package quotes;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class QuoteTest extends TestCase {

    public void QuoteTestToString() {
        Quote quote1 = new Quote("author1", "nlikes", "something profound");
        Quote quote2 = new Quote("author2", "nlikes", "something else profound");

        assertEquals("toString should work as expected",
                "Quote{, author='author1', likes=nlikes, text='something profound'}", quote1.toString());
        assertEquals("toString should work as expected",
                "Quote{, author='author2', likes=nlikes, text='something else profound'}", quote2.toString());
    }
}