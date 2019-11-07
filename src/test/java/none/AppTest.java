package none;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import com.flextrade.jfixture.annotations.Fixture;
import com.flextrade.jfixture.rules.FixtureRule;

public class AppTest {

    @Rule public final FixtureRule jFixture = FixtureRule.initFixtures();

    @Fixture private SomeClass something;

    @Test
    public void testAThing() {
        System.out.println(something);
        Assert.assertTrue(true);
    }
}
