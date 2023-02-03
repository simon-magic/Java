package ArrayList;

import java.util.ArrayList;

public class ArrayListMoviesTest {
    public static void main(String[] args) {
        // 1. 定义电影类
        // 2. 创建三个电影对象
        ArrayListMovies m1 = new ArrayListMovies("《肖生克的救赎》", 9.7, "罗宾斯");
        ArrayListMovies m2 = new ArrayListMovies("《霸王别姬》", 9.7, "张国荣");
        ArrayListMovies m3 = new ArrayListMovies("《阿甘正传》", 9.5, "汤姆·汉克斯");

        // 3. 创建一个电影类型的ArrayList集合，存储三部电影对象
        ArrayList<ArrayListMovies> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);

        // 4. 遍历电影类型的集合中每个电影对象，访问它的信息
        for (int i = 0; i < movies.size(); i++) {
            ArrayListMovies m = movies.get(i);
            System.out.println("电影名称：" + m.getName());
            System.out.println("电影得分：" + m.getScore());
            System.out.println("电影主演：" + m.getActor());
            System.out.println("-----------------------");
        }
    }
}
