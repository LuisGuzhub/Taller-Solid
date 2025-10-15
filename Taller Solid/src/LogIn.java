public interface LogInService {
    void log(User user);
}


public class LogIn implements LogInService {
    private Database database;

    public LogIn(Database database) { this.database = database; }

    @Override
    public void log(User user) {
        System.out.println("Has access to the website");
        database.insertUser(user);
    }
}