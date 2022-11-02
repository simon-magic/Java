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


## 7. 对象


## 8. String


## 9. 集合


## 10. static


## 11. 继承


## 12. 
