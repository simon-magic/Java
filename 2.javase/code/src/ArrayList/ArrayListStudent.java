package ArrayList;

public class ArrayListStudent {
    private String studyNumber;
    private String name;
    private int age;
    private String className;

    public ArrayListStudent() {
    }

    public ArrayListStudent(String studyNumber, String name, int age, String className) {
        this.studyNumber = studyNumber;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(String studyNumber) {
        this.studyNumber = studyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
