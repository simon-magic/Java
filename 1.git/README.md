## 0. 使用到的Linux命令
```java
// 查看当前目录
ls 

// 创建文件
touch filename

// 创建文件夹
mkdir foldername

// 删除文件
rm filename

// 删除文件夹
rm -r foldername

// vi编辑器
vi filename // 表示编辑filename文件
i           // 表示进入编辑模式
esc         // 表示进入预览模式
:wq         // 保存并关闭文件
```

## 1. Git安装和配置
```java
// 下载地址
https://git-scm.com/download

// 配置用户信息
git config --global user.name "wxzhou"
git config --global user.email "wxzhou20.qq.com"

// 查看配置信息
git config --global user.name
git config --global user.email

// 常用指令配置别名
touch .bashrc               // 用户目录下创建文件.bashrc
vi .bashrc                  // 编辑文件.bashrc
alias git-log='git log --pretty=oneline --all --graph --abbrev-commit'  // 用于输出git提交日志
alias ll='ls -al'           // 用于输出当前目录所有文件及基本信息
source .bashrc              // 使文件.bashrc立即生效
```

## 2. 基本操作指令
```java
// 初始化git仓库
git init

// 创建文件filename01.txt并提交
touch filename01.txt        // 创建文件
git add .                   // 添加到暂存区
git commit -m "备注"         // 添加到本地仓库    
git status                  // 查看修改状态
git-log                     // 查看提交日志
git reset --hard commitID   // 版本切换，其中commitID是提交版本的ID
git reflog                  // 查看已经删除的提交记录

// 添加文件到忽略列表
touch .gitignore            // 创建文件
vi .gitignore               // 进入vi编辑器，编辑忽略列表

// 分支
git branch                  // 查看本地分支
git checkout branch_name    // 切换分支
git checkout -b branch_name // 创建并切换分支
git merge branch_name       // 合并分支到当前分支
git branch -d branch_name   // 删除分支，需要做各种检查
git branch -D branch_name   // 删除分支，强制删除
```

## 3. 远程仓库
```java
// 注册码云，网站地址
https://gitee.com/signup

// 配置公钥
ssh-keygen -t rsa           // 生成公钥，不断回车即可，如果已存在公钥，则自动覆盖
cat ~/.ssh/id_rsa.pub       // 获取公钥
ssh -T git@gitee.com        // 验证是否配置成功

// 远程操作仓库
git remote add origin <url> // 添加远程仓库，远程仓库名称默认是origin，地址需要从码云上复制
git remote                  // 查看远程仓库

// 推送到远程仓库
git push --set-upstream origin master   // 其中--set-upstream表示与远程分支建立关联联系，下次则可以直接省略分支名和远程名
git push                    // 表示在建立联系之后，直接push即可

// 查看本地分支与远程分支之间的关联关系
git branch -vv

// 从远程仓库克隆
git clone <远程仓库路径> <本地目录>   // 从远程仓库中克隆到本地

// 从远程仓库进行抓取和拉取
git fetch origin [branch_name]     // 从远程仓库中branch_name分支中的更新都抓取到本地，但是不合并
git fetch                   // 不指定分支名和远程名，则抓取所有分支
git pull origin [branch_name]      // 拉取远程仓库中branch_name分支中的更新到本地，并且合并
```

## 4. 在IDEA中使用Git
```java
暂无
```