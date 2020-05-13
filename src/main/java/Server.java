import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<Integer, User> users = new HashMap<>();

    public Server()
    {

    }

    public void RegisterUser(User user)
    {
        if(users.containsKey(user.getId())) return;
        users.put(user.getId(), user);
    }

    public void Unregister(User user)
    {
        if(!users.containsKey(user.getId())) return;
        users.remove(user.getId());
    }

    public void SendMessage(int userIdSender, int userIdReceiver, String message){
        User user = users.get(userIdReceiver);
        if(user==null) return;
        User senderUser = users.get(userIdSender);
        user.ReceiveMessage(senderUser.getName(), message);
    }
}
