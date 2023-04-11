
package staff;

class CasualTypist extends Typist {
    private int dailyWages;

    public CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public int getDailyWages() {
        return dailyWages;
    }
}