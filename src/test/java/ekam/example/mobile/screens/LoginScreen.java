package ekam.example.mobile.screens;

import com.testvagrant.ekam.atoms.mobile.MobileScreen;
import com.testvagrant.ekam.reports.annotations.MobileStep;
import org.openqa.selenium.By;

public class LoginScreen extends MobileScreen {

    private final By usernameTextBox = queryByContentDesc("test-Username");
    private final By passwordTextBox = queryByContentDesc("test-Password");
    private final By loginButton = queryByContentDesc("test-LOGIN");
    private final By errorMessageContainer = query("//*[@content-desc = 'test-Error message']/*");

    @MobileStep(description = "Login")
    public LoginScreen login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLogin();
        return this;
    }

    @MobileStep(description = "Click Login")
    public LoginScreen clickLogin() {
        element(loginButton).click();
        return this;
    }

    @MobileStep(keyword = "And", description = "Enter Username")
    public LoginScreen setUsername(String username) {
        textbox(usernameTextBox).setText(username);
        return this;
    }

    @MobileStep(keyword = "And", description = "Enter password")
    public LoginScreen setPassword(String password) {
        textbox(passwordTextBox).setText(password);
        return this;
    }
}
