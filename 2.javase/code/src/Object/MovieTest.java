package Object;

public class MovieTest {
    public static void main(String[] args) {
        // 1. 设计电影类
        Movie m1 = new Movie("长津湖", 9.7, "吴京");
        Movie m2 = new Movie("我和我的父辈", 9.6, "吴京");
        Movie m3 = new Movie("扑水少年", 9.5, "王川");

        // 2. 定义电影类型数组
        Movie[] movies = new Movie[3];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;

        // 3. 遍历每个电影，展示其信息
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.print("电影名：" + m.getName() + "\t");
            System.out.print("评分：" + m.getScore() + "\t");
            System.out.print("主演：" + m.getActor() + "\t");
            System.out.println("");
        }
    }
}
