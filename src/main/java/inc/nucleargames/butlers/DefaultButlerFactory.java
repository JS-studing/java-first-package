package inc.nucleargames.butlers;

import inc.nucleargames.butlers.interfaces.IButler;

/**
 * Factory for creating butlers.
 */
public final class DefaultButlerFactory {

    /**
     * Constructor.
     */
    private DefaultButlerFactory() {}

    /**
     * Create butler.
     * @return IButler.
     */
    public static IButler Create() {
        return new ButlerImpl();
    }
}
