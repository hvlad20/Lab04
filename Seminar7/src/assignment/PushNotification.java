package assignment;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("New alert!");
    }
}
