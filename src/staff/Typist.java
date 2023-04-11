
package staff;


class Typist extends Staff {
    private int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
