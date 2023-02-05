package Extends;

public class This {
    private String name;
    private String schoolName;

    public This() {
    }

    // 如果不填schoolName，则此变量使用默认变量
    public This(String name){
        this(name, "SZU");
    }

    public This(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
