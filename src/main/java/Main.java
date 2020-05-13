public class Main {
    public static void main(String[] args){
        Server server = new Server();
        User ionescu= new User(1, "Ionescu", server);
        User andrei = new User(2, "Andrei", server);
        User alin = new User(3, "Alin", server);

        server.RegisterUser(ionescu);
        server.RegisterUser(andrei);
        server.RegisterUser(alin);


        ionescu.SendMessage(3,"Message from Ionescu");
        server.Unregister(alin);
        ionescu.SendMessage(3,"Message from Ionescu");
        ionescu.SendMessage(2,"Message from Ionescu");

        server.RegisterUser(alin);
        alin.setIsBusy(true);
        andrei.SendMessage(3, "Message from Andrei");
    }
}
