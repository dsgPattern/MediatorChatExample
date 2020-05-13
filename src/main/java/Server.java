import java.util.HashMap;
import java.util.Map;

public class Server implements IServer{
    private Map<Integer, IUser> users = new HashMap<>();

    public Server()
    {

    }

    public void RegisterUser(IUser user)
    {
        if(users.containsKey(user.getId())) return;
        for (IUser existingUser:users.values()) {
            existingUser.ReceiveMessage(user.getName(), " is logged in");
        }

        users.put(user.getId(), user);
    }

    public void Unregister(IUser user)
    {
        if(!users.containsKey(user.getId())) return;
        users.remove(user.getId());
    }

    public void SendMessage(int userIdSender, int userIdReceiver, String message){
        IUser user = users.get(userIdReceiver);
        if(user==null || user.getIsBusy()) return;
        IUser senderUser = users.get(userIdSender);
        user.ReceiveMessage(senderUser.getName(), message);
    }
}
