package Actors;

import Utils.Globals;
import com.badlogic.gdx.math.Vector2;

public class Player extends BaseEntity {

    public Player(Vector2 position, int name) {
        super(position, Globals.SIZE, name);
    }

    public void validateMovement(float newX, float newY) {
        if (!(newX > W) && !(newX < 0) && !(newY > H) && !(newY < 0)) {
            this.x = newX;
            this.y = newY;
        }
    }


}
