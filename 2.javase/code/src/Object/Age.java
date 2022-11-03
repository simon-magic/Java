package Object;

public class Age {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age <= 200 && age >= 0){
            this.age = age;
        }else {
            System.out.println("年龄有误！");
        }
    }
}
