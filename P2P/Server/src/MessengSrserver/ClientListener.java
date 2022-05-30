package MessengSrserver;


public interface ClientListener
{
    void signIn(String userName, String password);
    void signOut(String userNamme);
    void clientStatus(String status);
    void mapped(String nam,String ip);
}
