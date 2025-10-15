public class AppWeb {
    private LogInService logInService;
    private Database database;

    public AppWeb(LogInService logInService, Database database) {
        this.logInService = logInService;
        this.database = database;
    }

    public void start(User user) {
        logInService.log(user);
    }
}
