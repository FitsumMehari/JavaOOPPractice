
package staff;

class RegularTypist extends Typist {
    private int remuneration;

    public RegularTypist(int code, String name, int speed, int remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public int getRemuneration() {
        return remuneration;
    }
}