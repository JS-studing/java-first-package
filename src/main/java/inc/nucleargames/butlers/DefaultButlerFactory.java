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
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(value = " -> new", pure = true)
    public static IButler Create() {
        return new ButlerImpl();
    }
}
