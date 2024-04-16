package studentgrade;

import junit.framework.TestCase;
import org.junit.Test;

/* JUnit 4.12.1 */
public class StudentGradeTest extends TestCase {

    public StudentGradeTest() {
    }

    @Test
    public void test_calculate_grade_between_90_and_100() {
        int mark = 95;
        String expectedGrade = "A";
        
        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void test_calculate_grade_between_80_and_89() {
        int mark = 85;
        String expectedGrade = "B";

        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }
    @Test
    public void test_calculate_grade_less_than_80() {
        int mark = 75;
        String expectedGrade = "F";

        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void test_calculate_grade_of_100() {
        int mark = 100;
        String expectedGrade = "A";

        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void test_calculate_grade_of_90() {
        int mark = 90;
        String expectedGrade = "A";

        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void test_calculate_grade_of_80() {
        int mark = 80;
        String expectedGrade = "B";

        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }
    @Test
    public void test_calculate_grade_of_79() {
        int mark = 79;
        String expectedGrade = "F";

        String actualGrade = StudentGrade.getGrade(mark);

        assertEquals(expectedGrade, actualGrade);
    }

}
