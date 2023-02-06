package Interface.Implements;

public class PingPongMan implements SportMan, Law{

    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "跑步锻炼");
    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛");
    }

    @Override
    public void rule() {
        System.out.println(name + "遵纪守法");
    }
}
