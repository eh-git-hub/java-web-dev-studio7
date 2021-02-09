package org.launchcode.studio7.Test;

import org.junit.Test;
import org.launchcode.studio7.DVD;
import static org.junit.Assert.assertEquals;


public class LocationTest {

        @Test
        public void testDvdName(){
            DVD avengers = new DVD("Avengers", 50, "Action", "Blue-Ray");
            assertEquals(avengers.getName(), "Avengers");
        }
    }
