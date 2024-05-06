package src.solvingASimpleQuiz.polymorphism;

class Notification {
    protected String msg;

    public Notification(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println(getMsg());
    }

    public String getMsg() {
        return msg;
    }
}

class Warning extends Notification {

    public Warning(String msg) {
        super(msg);
    }
    @Override
    public String getMsg() {
        return "WARN: " + msg;
    }
}

class Alarm extends Notification {

    public Alarm(String msg) {
        super(msg);
    }
    @Override
    public void show() {
        System.out.println("ALARM: " + msg);
    }

    public static void main(String[] args) {
        Notification notif = new Notification("No problems");

        Notification warn = new Warning("Money ends");

        Notification alarm = new Alarm("The ship sank");

        alarm.show();
        warn.getMsg();
        alarm.getMsg();
        notif.show();
        warn.show();
    }
}
