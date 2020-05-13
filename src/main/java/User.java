public class User {
    private int id;
    private String name;
    private Server server;

    public User(int id, String name, Server server)
    {
        this.id=id;
        this.name=name;
        this.server =server;
        server.RegisterUser(this);
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

}
