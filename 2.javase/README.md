## 1.基础语法
### 1.1 注释
```aidl
# 单行注释
// 注释内容，只能写一行

# 多行注释
/*
    注释内容1
    注释内容2
*/

# 文档注释：此内容可以提取到一个程序说明文档中去的
/**
    注释内容
    注释内容
*/    
```

### 1.2 字面量
```aidl
# 概念：字面量就是告诉程序员，数据在程序中的书写格式。

# 变量：存储一个数据的内存区域，存储的数据可以变化。
# 注意：变量先申明再使用。
int a = 10;

# 数据类型：基本数据类型，引用数据类型(如：String)。
# 基本数据类型：4大类8种。
整数：        字节长度
    byte        1
    short       2
    int         4
    long        8
浮点数：
    float       4
    double      8
字符：
    char        2
布尔：
    boolean     1

# 关键字：保留的单词，有特殊功能。
class, break, if, while等

# 标识符：由一些字符组成的名称，给类、方法、变量等取名字。
# 要求：由数字、字母、下划线、$组成，不能以数字开头，区分大小写。
# 命名规范：
变量名称：studyNumber
类名称：  HelloWorld
```

## 2. 类型转换
### 2.1 自动类型转换
```aidl
# 类型范围小的变量，可以直接赋值给类型范围大的变量。
# byte --> short --> int --> long --> float --> double
#          char  --> int
byte a = 12;
char b = 'a';
int c = a;
int d = b;
System.out.println(c); //12
System.out.println(d); //97
```

### 2.2 表达式中类型转换
```aidl
# 在表达式中，表达式的最终结果类型由表达式中的最高类型决定；
# 在表达式中，byte，short，char是直接转换为int类型参与运算。
byte a = 1;
int b = 2;
char c = 'a';
int d = a + b + c;
System.out.println(d);  // 100
```

### 2.3 强制类型转换
```aidl
# 类型大范围的数据，不能直接赋值给类型小范围的数据。
# 可以使用这种方法强制转换：
    数据类型 变量2 = (数据类型)变量1；
# 注意：强制转换可能造成数据溢出，double转int直接丢掉小数部分返回。
int a = 20;
byte b = (byte)a;
```

## 3. 运算符
### 3.1 算术运算符
```aidl
+ 加
- 减
* 乘
/ 除
% 取余

# 加号出了作为算法运算符，还可以当作连接符
System.out.println("a="+a)
```

### 3.2 自增自减运算符
```aidl
++ 自增
-- 自减
```

### 3.3 赋值运算符
```aidl
+=  加后赋值
-=  减后赋值
*=  乘后赋值
/=  除后赋值
%=  取余后赋值
```

### 3.4 关系运算符
```aidl
==  判断是否相等
!=  判断是否不等
>   判断是否大于
>=  判断是否大于等于
<   判断是否小于
<=  判断是否小于等于
```

### 3.5 逻辑运算符
```aidl
&   逻辑与
|   逻辑或
!   逻辑非
^   逻辑异或（两个不同才是true）

&&  短路与（判断结果和“&”一样，但是如果左边是“false”，则右边不执行）
||  短路或（判断结果和“|”一样，但是如果左边是“true”，则右边不执行）
```

### 3.6 三元运算符
```aidl
# 条件表达式 ? 值1 : 值2
# 首先判断条件表达式，如果是true，则返回值1，否则返回值2.

# 例子1：两数判断最大值
int a = 100;
int b = 90;
int c = a > b ? a:b;
System.out.println(c)

# 例子2：三数判断最大值
int d = 10;
int e = 20;
int c = 30;
int max = d > e ? d > c ? d:c : e > c ? e:c
System.out.println(max)
```

### 3.7 运算符优先级
```aidl
优先级     运算符
1           ()
2           ! ~ ++ 
3           * / %
4           + -
......
注意：（）优先级最高。
```

## 4. 分支结构
### 4.1 if
```aidl
# if格式：
if(条件表达式){
    语句体；
}

if(条件表达式){
   语句体1；
} else {
    语句体2；
}

if(条件表达式1){
    语句体1；
} else if(条件表达式2){
    语句体2；
} else{
    语句体3；
}
```

### 4.2 switch
```aidl
# switch格式：
switch(表达式){
    case 值1：
        执行代码...；
        break；
    case 值2：
        执行代码...；
        break；
    ...
    default：
        执行代码n;
}

# 注意事项：
    case不能重复；
    case不能是变量，必须是确定的值；
    漏写break，会发生穿透。
```

### 4.3 for
```aidl
# for格式：
for (int i=0; i<10; i++){
    System.out.println(i)
}

# 例子1：求1-5之和
int sum = 0; 
for (int i=1; i<=5; i++){
    sum += i
}
System.out.println(sum)

# 例子2：求水仙花数
for (int i=100; i<=999; i++){
    int ge = i%10;
    int shi = i/10%10;
    int bai = i/100;
    if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
        System.out.println(i)
    }
}
```

### 4.4 while
```aidl
# 格式：
int i = 0;
while (i<10){
    System.out.println(i);
    i++
}

# for和while使用场景的区别：当不知道循环多少次的时候，使用while。
```

### 4.5 do while
```aidl
# 格式：
int i = 0;
do{
    System.out.println(i);
    i++;
}while(i<=3);

# 注意：do-while一定会先执行一次循环体。
```

### 4.6 死循环
```aidl
# 格式1：
for(;;){
    循环体；
}

# 格式2：
while(true){
    循环体；
}

# 格式3：
do{
    循环体；
}while(true);
```

### 4.7 跳出控制语句
```aidl
# break：跳出并结束当前所在循环；
# continue：跳出本次循环，进入下一次循环。

# 注意：break只能用于循环当中，或者结束所在switch所在分支；
        continue只能用于循环当中。
```

### 4.8 案例：随机数Random类
```aidl
# 使用方法：
Random r = new Random();
int data = r.nextInt(10);
System.out.println(data);

# 例子：随机生成一个1-100之间的数字，提示用户猜测，猜大提示过大，猜小提示过小，直至结束。
Random r = new Random();
int luckyNumber = r.nextInt(100)+1;
Scanner sc = new Scanner(System.in);
while(true){
    System.out.println("请输入一个1-100之间的数字：");
    int guessData = sc.nextInt();
    if (guessData > data){
        System.out.println("数字过大");
    }else if (guessData < data){
        System.out.println("数字过小");
    }else{
        System.out.println("恭喜猜对了")；
        break;
    }
}
```

## 5. 数组
### 5.1 数组定义
```aidl
# 静态初始化数组
// 完整格式：
数组类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3...};
doubel[] scores = new double[]{90.5, 80.5, 78.2};
int[] ages = new int[]{12, 24, 36};
// 简化格式：
数组类型[] 数组名 = {元素1，元素2，元素3...};
doubel[] scores = {90.5, 80.5, 78.2}; 

# 取值：
System.out.println(ages[0]);    // 12
# 赋值：
ages[0] = 20;
# 长度：
System.out.println(ages.length);    // 3
# 最大索引：
System.out.println(ages.length-1);  // 2

# 动态初始化
数组类型[] 数组名 = new 数据类型[长度];
int[] arr = new int[3];

# 动态初始化默认值
数据类型                    默认值
byte short char int long    0
float double                0.0
boolean                     false
类 接口 数组 String           null
```

### 5.2 数组遍历
```aidl
int[] ages = new int[]{10, 20, 30, 40};
for (i=0; i<ages.length; i++){
    System.out.println(ages[i]);
}

```
### 5.3 案例分析
```aidl
# 例子1：数组求和
int[] money = new int[]{100, 200, 300, 400};
int sum = 0;
for (i=0; i<money.length; i++){
    sum += money[i];
}
System.out.println("数组求和等于："+sum);

# 例子2：数组求最大的元素
int[] money = new int[]{100, 200, 300, 400};
int max = money[0];
for (i=1; i<money.length; i++){
    if (max < money[i]){
        max = money[i];
    }
}
```

### 5.4 内存分析
```aidl
int[] money = new int[]{100, 200, 300, 400};
# 注意：money 存放的是 数组的地址
```

## 6. 方法
### 6.1 定义
```aidl
# 定义格式：
修饰符 返回值类型 方法名(形参列表){
    方法体代码（需要执行的功能代码）;
    return 返回值;
}
# 调用格式：
方法名(...)

例子1：
public static int add(int a, int b){
    int c = a + b;
    return c;
}

例子2：
public static void print(){
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
}
```

### 6.2 案例
```aidl
# 案例1：定义一个方法，返回计算1-n的和。
public static int sum(int n){
    int sum = 0;
    for (int i=1; i<=n; i++){
        sum += i;
    }
    System.out.println("sum="+sum);
}

# 案例2：判断整数是奇数还是偶数。
public static void fun(int n){
    if (n%2 == 0){
        System.out.println(n + "是偶数");
    }else{
        System.out.println(n + "是奇数");
    }
}

# 案例3：数组求最大值。
int[] a = new int[]{10, 20, 30};
public static int maxArr(int[] a){
    max = a[0];
    for (int i=1; i<a.length; i++){
        if (max < a[i]){
            max = a[i];
        }
    }
}
```

### 6.3 参数传递
```aidl
# 基本数据类型参数传递
传递实参给形参的时候，传递的是实参中的值，也就是值传递。
public static void main(String[] args){
    int a = 10;
    change(a);
    System.out.println(a);
}
public static void change(int a){
    System.out.println(a);
    a = 20;
    System.out.println(a);
}
// 结果为：10 20 10

# 引用数据类型参数传递
传递实参给形参的时候，传递的是实参保存的地址值。
public static void main(String[] args){
    int[] arr = new int[]{10,20,30};
    change(arr);
    System.out.println(arr[1]);
}
public static void change(int[] arr){
    System.out.println(arr[1]);
    arr[1] = 222;
    System.out.println(arr[1]);
}
// 结果为：20 222 222
```

### 6.4 方法重载
```aidl
# 定义：同一个类中，出现多个方法名称相同，但是形参列表不同，这些方法就是重载方法。
public class Method{
    public static void main(String[] args){
        fire();
        fire("美国");
        fire("美国", 1000);
    }
    public static void fire(){
        System.out.println("发射！");
    }
    public static void fire(String location){
        System.out.println("向" + location + "发射！");
    }
    public static void fire(String location, int number){
        System.out.println("向" + location + "发射" + number + "枚炮弹！");
    }
}
```

### 6.5 单独使用return关键词
```aidl
public class Test{
    public static void main(String[] args){
        chu(1, 10);
    }
    public static void chu(int a, int b){
        if (b==0){
            System.out.println("输入有误！");
            return；
        }else{
            System.out.println("结果是：" + a/b);
        }
    }
}
```

## 7. 对象
### 7.1 创建
```aidl
# 创建类
public class 类名{
    1. 成员变量（代表属性，一般是名词）
    2. 成员方法（代表行为，一般是动词）
    3. 构造器
    4. 代码块
    5. 内部类
}

例如：
public class Car{
    // 属性（成员变量）
    String name;
    double price;
    // 行为（方法）
    public void start(){}
    public void run(){}
} 

# 创建类的对象
类名 对象名 = new 类名();
Car c = new Car();

# 注意事项：
1. 类名大写；
2. 一个Java文件中可以定义多个class（类），但是只能有一个是public。
```


### 7.2 案例
代码详见：[Object](code/src/Object/Shopping.java)

### 7.3 构造器
```aidl
# 作用：定义在类中，可以初始化一个类的对象，并返回对象的地址。
# 格式：
修饰符 类名(形参列表){
    ...
}
public class Car{
    // 无参构造器
    public Car(){}
    // 有参构造器
    public Car(String name, double price){}
}

# 调用：
类 变量名称 = new 构造器;
car c1 = new car();
car c2 = new car("奔驰", 39.8); 

# 注意：
1. 任何类定义出来，默认自带了无参数构造器
```
代码详见：[CarTest](code/src/Object/CarTest.java)

### 7.4 this
```aidl
# 作用：可以用于指定访问当前对象的成员变量、成员方法。
public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("无参构造器被调用。");
    }
    public Car(String name, double price){
        System.out.println("有参数构造器被调用。");
        this.name = name;
        this.price = price;
    }
}
```
代码详见：[Car](code/src/Object/Car.java)

### 7.5 封装
```aidl
# 原则：对象代表什么，就得封装对应的数据，并提供数据对应的行为。
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

public class AgeTest {
    public static void main(String[] args) {
        Age a = new Age();
        a.setAge(30);
        int age = a.getAge();
        System.out.println("年龄是：" + age);
    }
}
```
代码详见：[age](code/src/Object/AgeTest.java)

### 7.6 JavaBean
```aidl
# 书写要求：
1. 成员变量使用private修饰；
2. 提供成员变量对应的setXxx() / getXxx()方法；
3. 必须提供一个无参构造器，有参构造器可写可不写。
```
代码详见：[User](code/src/Object/UserTest.java)

### 7.7 成员变量和局部变量
|  区别  |        成员变量        |         局部变量         |
|:----:|:------------------:|:--------------------:|
| 类中位置 |       类中，方法外       |        常见于方法中        |
| 默认值  |        有默认值        |      没有默认值，需要赋值      |
| 生命周期 | 随着对象的创建而存在，对象消失则消失 | 随着方法的调用而存在，方法运行结束则消失 |
| 作用域  |        全对象内        |        所属方法内         |

### 7.8 案例
```aidl
# 案例：模仿电影信息展示。
```
代码详见：[Movie](code/src/Object/MovieTest.java)

## 8. String
### 8.1 创建
```aidl
# 概述：java.lang.String类代表字符串，String类定义的对象用于指向字符串对象，然后操作该字符串。
# 特点：String类创建之后不能被修改。

String address = "深圳";
address += "大学";
address += "计算机与软件学院";
System.out.println(address);    // 深圳大学计算机与软件学院

解释：创建的String"深圳"、"大学"、"计算机与软件学院"都无法改变，address改变的原因是
每次连接都指向了新的对象，比如连接"大学"之后，address就指向了对象"深圳大学"的地址，
之前的String对象"深圳"和"大学"都没有改变。

# 构造方法：
方法一：String address = "深圳";
方法二：使用String类的构造器创建对象。
```
|       构造器        |        说明         |
|:----------------:|:-----------------:|
| public String()  |   空白字符串对象（几乎不用）   |
| public String(String original) |   传入字符串内容（几乎不用）   |
| public String(char[] chs) | 根据字符数组的内容，创建字符串对象 |
| public String(byte[] chs) | 根据字节数组的内容，创建字符串对象 |
```aidl
# 以""方式给出的字符串对象，在字符串常量池中存储，相同的内容只会存储一份。
# 通过构造器new对象，则每new一次就会产生一个新对象，放在堆内存中。
public class StringConstruct {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   // true

        char[] chars1 = new char[]{'a', 'b', 'c'};
        String s3 = new String(chars1);
        String s4 = new String(chars1);
        System.out.println(s3 == s4);   // false

    }
}
```
详见代码：[StringConstruct](code/src/String/StringConstruct.java)


### 8.2 常见面试题
```aidl
# 代码运行结果：
public class InterviewQuestion {
    public static void main(String[] args) {
        String s1 = new String("abc");  // 此行创建了两个对象，一个放在字符串常量池中，一个放在堆内存中。
        String s2 = "abc";  // 此行没有创建对象，如果没有上一行，则创建一个对象放在字符串常量池中。
        System.out.println(s1 == s2);   // false
        System.out.println("----------------------------");
        
        String s3 = "abc";
        String s4 = "ab";
        String s5 = s4 + "c";
        System.out.println(s3 == s5);   // false
        System.out.println("----------------------------");

        String s6 = "a" + "b" + "c";
        System.out.println(s3 == s6);   // true. 原因是：java存在编译优化机制，程序在编译时："a" + "b" + "c"会直接转成"abc".
    }
}
```
详见代码：[InterviewQuestion](code/src/String/InterviewQuestion.java)

### 8.3 String常见API
```aidl
# 案例1：字符串的内容比较，推荐使用String类提供的“equals”方法。
## equals: 只关心字符内容是否一致；
## equalsIgnoreCase: 忽略大小写。

## 错误示范：
// 1. 正确登录名和密码
String okName = "simon";
String okPassword = "123456";
// 2. 用户输入登录名和密码
Scanner sc = new Scanner(System.in);
System.out.println("登录名称：");
String name = sc.next();
System.out.println("登陆密码：");
String password = sc.next();
// 3. 判断用户登录名称密码是否和正确登录名密码相等
// 此种写法错误：字符串内容比较不适合用“==”比较。
if (okName == name && okPassword == password){
    System.out.println("登陆成功！");
}else {
    System.out.println("登入失败！");
}

## 正确示范：
if (okName.equals(name) && okPassword.equals(password)){
    System.out.println("登陆成功！");
}else {
    System.out.println("登入失败！");
}

// 4. 验证码：忽略大小写
String sysCode = "aBc1";
System.out.println("验证码：");
String code1 = sc.next();
System.out.println(sysCode.equalsIgnoreCase(code1));
```
代码详见：[StringEquals](code/src/String/StringEquals.java)

```aidl
案例2：其他例子
// 1. length: 字符串长度
System.out.println("--------------------");
String name = "我爱你中国";
System.out.println(name.length());  // 5

// 2. charAt(int index): 获取某个索引位置的字符
System.out.println("--------------------");
System.out.println(name.charAt(1)); // 爱
System.out.println("--------------------");
// 遍历字符串中每个字符
for (int i = 0; i < name.length(); i++) {
    System.out.println(name.charAt(i));
}

// 3. toCharArray: 把字符串转换为字符数组
System.out.println("--------------------");
char[] chars = name.toCharArray();
System.out.println(chars);
for (int i = 0; i < chars.length; i++) {
    System.out.println(chars[i]);
}

// 4. substring(int beginIndex, end endIndex): 根据索引进行截取，左闭右开
//    substring(int beginIndex): 从索引处一直截取到末尾
System.out.println("--------------------");
String name1 = name.substring(0, 3);
System.out.println(name1);  // 我爱你
String name2 = name.substring(3);
System.out.println(name2);  // 中国

// 5. replace(charSequence target, sharSequence replacement): 使用新值代替旧值，得到新的字符串
System.out.println("--------------------");
String name3 = name.replace("中国", "祖国");
System.out.println(name3);  // 我爱你祖国

// 6. contains(charSequence s): 是否包含某字符
System.out.println("--------------------");
System.out.println(name.contains("中国"));    // true

// 7. startsWith(String prefix, int toffset): 判断是否是以某个字符（串）开始的，第二个参数是从哪个索引开始
System.out.println("--------------------");
System.out.println(name.startsWith("我爱你")); // true
System.out.println(name.startsWith("我爱你", 1));  // false

// 8. split(string regex): 根据规则切割字符串，得到字符串数组返回
System.out.println("--------------------");
String name4 = "张三，李四，王五，赵六";
String[] name5 = name4.split("，");
for (int i = 0; i < name5.length; i++) {
    System.out.println(name5[i]);
}
```

### 8.4 案例
```aidl
# 开发验证码功能
public class StringSys {
    public static void main(String[] args) {
        // 1. 定义可能出现的字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        // 2. 循环五次，每次随机生成一个索引，提取对应字符连接起来
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            // 随机一个索引
            int index = r.nextInt(data.length());
            char c = data.charAt(index);
            code += c;

        }

        // 3. 输出字符串
        System.out.println(code);
    }
}
```
代码详见：[StringSys](code/src/String/StringSys.java)
```aidl
# 模拟用户登录功能，最多只给三次机会。
public class StringUser {
    public static void main(String[] args) {
        // 1. 定义正确的用户名和密码
        String okLoginName = "admin";
        String okPassword = "123456";

        // 2. 定义一个循环，循环3次
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            // 3. 判断是否登录成功
            if (okLoginName.equals(name) && okPassword.equals(password)){
                System.out.println("登陆成功！");
                break;
            }else{
                System.out.println("用户名或者密码错误，还剩" + (2-i) + "次机会！");
            }
        }
    }
}
```
代码详见：[StringUser](code/src/String/StringUser.java)
```aidl
# 电话号码屏蔽：中间四位变成*
public class StringPhoneNumber {
    public static void main(String[] args) {
        // 1. 输入一个手机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("输入手机号码：");
        String tel = sc.next();

        // 2. 截取手机号码前三位和后四位
        String before = tel.substring(0, 3);
        String after = tel.substring(7);
        String s = before + "****" + after;
        System.out.println(s);
    }
}
```
代码详见：[StringPhoneNumber](code/src/String/StringPhoneNumber.java)

## 9. 集合
### 9.1 概述
```aidl
# 数组定义之后，类型确定，长度固定。
# 集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。
# 集合非常适合做元素不确定，且要进行增删操作的场景。
# ArryList是集合的一种，支持索引。
```

### 9.2 使用方法
```aidl
# 添加数据 add(int index, E element);   add(E element);
public class ArrayListConstruct {
    public static void main(String[] args) {
        // 1. 创建ArrayList
        ArrayList list = new ArrayList();

        // 2. 添加数据
        list.add("Java");
        list.add(23);
        list.add(10.2);
        list.add(false);

        // 3. 打印查看
        System.out.println(list);   // [Java, 23, 10.2, false]
    }
}
```
代码详见：[ArrayListConstruct](code/src/ArrayList/ArrayListConstruct.java)

```aidl
# 泛型：ArrayList<E>，集合只能操作某种数据类型。
ArrayList<String>: 只能操作字符串类型的数据；
ArrayList<Interger>: 只能操作整数类型的数据。

public class ArrayListGeneric {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Java");
        a1.add("Mysql");
        a1.add("Git");

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(23);
        a2.add(100);
    }
}
```
代码详见：[ArrayListGeneric](code/src/ArrayList/ArrayListGeneric.java)

```aidl
# 常用API
public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Mysql");
        list.add("HTML");
        list.add("CSS");
        list.add("Javascript");

        // 1. public E get(int index): 获取指定索引除的元素
        System.out.println("--------------------");
        String e = list.get(1);
        System.out.println(e);  // "Mysql"

        // 2. public int size(): 获取集合中元素的个数
        System.out.println("--------------------");
        System.out.println(list.size());    // 5

        // 3. 集合的遍历
        System.out.println("--------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 4. public E remove(int index): 删除指定索引处的元素，返回被删的元素
        System.out.println("--------------------");
        System.out.println("被删之前的ArrayList：" + list);   // [Java, Mysql, HTML, CSS, Javascript]
        System.out.println("被删的元素是：" + list.remove(2)); // "HTML"
        System.out.println("被删之后的ArrayList：" + list);   // [Java, Mysql, CSS, Javascript]

        // 5. public boolean remove(Object o): 删除指定元素，返回删除是否成功
        // 注意：若指定元素出现多次，只删除排在第一个的位置
        System.out.println("--------------------");
        System.out.println(list.remove("Java"));    // true
        System.out.println("被删之后的ArrayList：" + list);   // [Mysql, CSS, Javascript]

        // 6. public E set(int index, E element): 修改指定位置的元素，并返回被修改的元素
        System.out.println("--------------------");
        System.out.println(list.set(0, "数据库")); // Mysql
        System.out.println(list);   // [数据库, CSS, Javascript]
    }
}
```
代码详见：[ArrayListApi](code/src/ArrayList/ArrayListApi.java)

### 9.3 案例
```aidl

```

## 10. static


## 11. 继承


## 12. 
