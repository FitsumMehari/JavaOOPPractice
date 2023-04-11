
package staff;

class Officer extends Staff {
    private String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}