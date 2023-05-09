package inc.nucleargames.butlers.tests;

import inc.nucleargames.butlers.DefaultButlerFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for DefaultButlerFactory.
 */
public class DefaultButlerFactoryTests {

    /**
     * Check butler creation.
     */
    @Test
    public void CheckButlerCreation() {
        final var butler = DefaultButlerFactory.Create();

        Assert.assertEquals("Hello and welcome!", butler.greet());
    }
}
