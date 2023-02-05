package Extends;

public class NewPhone extends Phone{
    // 方法重写
    @Override   // 重写校验注解，加上之后，这个方法必须是正确重写的，这样更安全。
    public void call(){
        super.call();
        System.out.println("视频通话");
    }

    @Override
    public void sendMsg(){
        super.sendMsg();
        System.out.println("发图片");
    }

}
