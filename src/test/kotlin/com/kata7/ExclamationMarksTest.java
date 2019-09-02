package com.kata7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExclamationMarksTest {

    @Test
    public void testing() {
        String input01 = "No seriously! Seriously!! Wow";
        String s = input01.replaceAll("!+", "");
        assertEquals("No seriously Seriously Wow", s);

        String input02 = "!!No! seriously! !Seriously!! !!Wow!";
        s = input02.replaceAll("!+ ", " ").replaceAll("!+$", "");
        assertEquals("!!No seriously !Seriously !!Wow", s);

    }

    @Test
    public void testBasic() {
        assertEquals("nothing to do", ExclamationMarks.removeBang("nothing to do"));
        assertEquals("should remove bangs from the end of words",
                "No seriously Seriously Wow", ExclamationMarks.removeBang("No seriously! Seriously!! Wow"));
        assertEquals("should remove bangs from the end of words only",
                "!!No seriously !Seriously !!Wow", ExclamationMarks.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
    }
}