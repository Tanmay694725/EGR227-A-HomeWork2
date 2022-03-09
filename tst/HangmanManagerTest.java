import org.junit.*;     // JUnit tools

import java.util.*;     // Collections
import java.io.*;// File access


/**
 * Modify this comment
 */
public class HangmanManagerTest {

    /* Loads the words in fileName and returns the set of all words in that file*/
    private Set<String> getDictionary(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            Set<String> dictionary = new HashSet<>();
            while (fileScanner.hasNext()) {
                dictionary.add(fileScanner.next());
            }
            return dictionary;
        } catch (FileNotFoundException e) {
            Assert.fail("Something went wrong.");      //Something went wrong
        }
        /* Should never be reached. */
        return new HashSet<>();
    }

    /**
     * Add comments
     */
    @Test
    public void constructorTest() {
        Set<String> d = txtGetter();
        constructorHappyCase(d, 8, 3);
        constructorHappyCase(d, 6, 4000);
        constructorHappyCase(d, 12, 1200);
        constructorHappyCase(d, 1, 0);
        constructorFail(null, 10, 10);
        constructorFail(null, 10, 10);
        constructorFail(d, -10, 4);
        constructorFail(d, 3, -16);
        constructorFail(d, -1, 8);
        constructorFail(d, -8, -10);
        constructorFail(null, 0, 0);
    }
}