package Pages;

public class LoginPage extends Page implements PageInterface{

    private String userName;
    private String password;

    public LoginPage(String pageName, int pageID, String URL) {
        super();
    }

    public LoginPage() {

    }

    public void populateCredentials(String userName, String password) {

        System.out.println(String.format("credentials are populated: %s, %s", userName, password));
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void getDeveloperName() {
        System.out.println(" John Smith ");
    }
}
