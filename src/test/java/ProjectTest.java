import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProjectTest {
    @Test
    public void test_project_1(){assertEquals ("Not a triangle",(Project.triangle(1, 2, 4)));
    }

}
