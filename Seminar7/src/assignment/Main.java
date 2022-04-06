package assignment;

public class Main {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification pushNotification = factory.createNotification("push");
        pushNotification.notifyUser();
    }
}

class PozitieXOY {
    int x;
    int y;
}

class Copac {
    float inaltime;
    String culoareFrunze;
    String tipCoroana;
    PozitieXOY locPlantare;

    @Override
    public boolean equals(Copac c) {
        if(c.inaltime == this.inaltime &&
                c.culoareFrunze == this.culoareFrunze &&
                c.tipCoroana == this.tipCoroana) {
            return true;
        }
        return false;
    }

    public Copac clone()
    {
        Copac clone = new Copac();
        clone.inaltime = this.inaltime;
        clone.culoareFrunze = this.culoareFrunze;
        clone.tipCoroana = this.tipCoroana;
        return clone;
    }
}