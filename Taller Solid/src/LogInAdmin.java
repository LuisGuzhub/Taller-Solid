public class LogInAdmin implements LogInService {
    private Database database;
    private AdminVerifier adminVerifier;

    public LogInAdmin(Database database, AdminVerifier adminVerifier) {
        this.database = database;
        this.adminVerifier = adminVerifier;
    }

    @Override
    public void log(User user) {
        if (!adminVerifier.isAdmin(user)) return;
        System.out.println("Has access to the website in admin mode");
        database.insertUser(user);
    }
}