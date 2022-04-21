package test;
import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TranscriptTest {

    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Nick", 1000);
        testTranscript.addGrade("CPSC-210", 3.5);
        testTranscript.addGrade("ENGL-201", 4.0);
        testTranscript.addGrade("CPSC-110", 3.1);
    }

    @Test
    public void testGetStudentName(){
        assertEquals(testTranscript.getStudentName(), "Nick");
    }

    @Test
    public void testGetStudentGPA(){
        assertEquals(testTranscript.getGPA(), 3.533333333333333, 0.1);

    }

    @Test
    public void testGetCourseAndGrade(){
        String actual = testTranscript.getCourseAndGrade("CPSC-210");
        String expected = "CPSC-210: 3.5";

        assertEquals(actual, expected);

    }
}