package inc.nucleargames.butlers;

import inc.nucleargames.butlers.interfaces.IButler;

/**
 * Implementation of person, who greets every guest.
 */
class ButlerImpl implements IButler {
    /**
     * Constructor.
     */
    ButlerImpl() {}

    /**
     * Greet every guest.
     * @return String with greeting.
     */
    @Override
    public String greet() {
        return "Hello and welcome!";
    }
}
