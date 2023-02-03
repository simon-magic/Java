package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudentTest {
    public static void main(String[] args) {
        ArrayList<ArrayListStudent> students = new ArrayList<>();
        students.add(new ArrayListStudent("2000271001", "叶孤城", 23, "护理一班"));
        students.add(new ArrayListStudent("2000271002", "东方不败", 26, "中文一班"));
        students.add(new ArrayListStudent("2000271003", "西门吹雪", 25, "临床一班"));
        students.add(new ArrayListStudent("2000271004", "梅超风", 27, "药学一班"));

        // 遍历学生信息
        for (int i = 0; i < students.size(); i++) {
            ArrayListStudent s = students.get(i);
            System.out.println(s.getStudyNumber()+"\t" + s.getName()+"\t" + s.getAge()+"\t" + s.getClassName());
        }

        // 定义方法完成学号搜索功能
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学号查询学生对象：");
            String studyNumber = sc.next();
            // 调用方法查询
            ArrayListStudent s = getStudentById(students, studyNumber);
            if(s == null){
                System.out.println("查无此人。");
            }else {
                System.out.println("查询学生信息如下：");
                System.out.println(s.getStudyNumber()+"\t" + s.getName()+"\t" + s.getAge()+"\t" + s.getClassName());
            }

        }

    }

    /**
     * 根据学生学号查询学生对象返回
     * @param students      存储全部学生对象的集合
     * @param studyNumber   搜索的学生的学号
     * @return              学生对象 | null
     */
    public static ArrayListStudent getStudentById(ArrayList<ArrayListStudent> students, String studyNumber){
        for (int i = 0; i < students.size(); i++) {
            ArrayListStudent s = students.get(i);
            if (s.getStudyNumber().equals(studyNumber)){
                return s;
            }
        }
        return null;

    }

}
