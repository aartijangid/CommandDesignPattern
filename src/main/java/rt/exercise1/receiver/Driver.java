package rt.exercise1.receiver;

public class Driver {
    private int[] position = {0, 0};

    private int direction = 0;

    int getDirection() {
        return direction;
    }

    void setDirection(int direction) {
        this.direction = direction;
    }

    public int[] getPosition() {
        return position;
    }

    public void move() {

        if (this.direction == 0)
            position[0]++;
        else if (this.direction == 90)
            position[1]++;
        else if (this.direction == 180)
            position[0]--;
        else if (this.direction == 270)
            position[1]--;
    }

    public void turnLeft() {
        this.direction += 90;
        if (direction == 360)
            direction = 0;
    }

    public void turnRight() {
        if (this.direction == 0)
            this.direction = 270;
        else
            this.direction -= 90;
    }
}
