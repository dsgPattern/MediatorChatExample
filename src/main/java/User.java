public class User implements IUser{
    private int id;
    private String name;
    private IServer server;
    private boolean isBusy;

    public User(int id, String name, IServer server)
    {
        this.id=id;
        this.name=name;
        this.server =server;
        //server.RegisterUser(this);
    }

    public void SendMessage(int userId, String message)
    {
        server.SendMessage(id, userId, message);
    }

    public void ReceiveMessage(String userName, String message){
        System.out.println(name + " Received message from " +userName +": " +message);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setIsBusy(boolean isBusy){
        this.isBusy=isBusy;
    }

    public boolean getIsBusy(){return isBusy;
    }
}
