package example.codeclan.com.moviehomework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MoviesTest {
    @Test
    public void getTitlesTest() {
        Title title = new Title() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public void getLength() {

            }
        };
        assertEquals("Home Alone 2", title.getTitle());
    }

    @Test
    public void setupTitlesTest() {
        Title title = new Title() {
            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public void getLength() {

            }
        }
    }
}
