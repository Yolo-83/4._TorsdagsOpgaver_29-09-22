public class TestStudents {

    public static void main(String[] args) {
        Student a = new Student("Maria");
        Student b = new Student("Brian");
        Student c = new Student("Per");

        Course math = new Course("Math");
        Course history = new Course("History");
        Course english = new Course("English");
        Course biology = new Course("Biology");
        Course danish = new Course("Danish");
        Course physics = new Course("Physics");

        System.out.println(math);
        System.out.println(history);
        System.out.println(english);
        System.out.println(biology);
        System.out.println(danish);
        System.out.println(physics);


        a.addCourse(history);
        a.addCourse(english);
        a.addCourse(biology);
        a.addCourse(danish);

        b.addCourse(math);
        b.addCourse(english);

        c.addCourse(math);
        c.addCourse(biology);
        c.addCourse(physics);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}