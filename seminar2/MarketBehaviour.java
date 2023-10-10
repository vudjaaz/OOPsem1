package seminar2;

import java.util.*;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
