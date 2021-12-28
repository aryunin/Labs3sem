package Lab3;

class Student {
    private String name;
    private String university;
    private int age;

    public Student(String name) {
        this.name = name;
        university = null;
        age = -1;
    }

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
        this.age = -1;
    }

    public Student(String name, String university, int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        if(university != null) System.out.println("University: " + university);
        if(age != -1) System.out.println("Age: " + age);
    }
}
