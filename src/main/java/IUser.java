public interface IUser {
    void SendMessage(int userId, String message);
    void ReceiveMessage(String userName, String message);
    int getId();
    String getName();
    boolean getIsBusy();
}
