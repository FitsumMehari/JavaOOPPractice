package staff;

public class Main {

    public static void main(String[] args) {
        Staff s = new Staff(1, "John");
        Teacher t = new Teacher(2, "Jane", "Maths", "ABC Publication");
        Officer o = new Officer(3, "Jack", "Grade A");
        Typist ty = new Typist(4, "Jill", 60);
        RegularTypist rt = new RegularTypist(5, "Jim", 70, 5000);
        CasualTypist ct = new CasualTypist(6, "Joe", 50, 1000);

        System.out.println("Staff: " + s.getName());
        System.out.println("Teacher: " + t.getName() + ", Subject: " + t.getSubject() + ", Publication: " + t.getPublication());
        System.out.println("Officer: " + o.getName() + ", Grade: " + o.getGrade());
        System.out.println("Typist: " + ty.getName() + ", Speed: " + ty.getSpeed());
        System.out.println("Regular Typist: " + rt.getName() + ", Speed: " + rt.getSpeed() + ", Remuneration: " + rt.getRemuneration());
        System.out.println("Casual Typist: " + ct.getName() + ", Speed: " + ct.getSpeed() + ", Daily Wages: " + ct.getDailyWages());
    }
}
