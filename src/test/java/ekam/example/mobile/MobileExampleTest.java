package ekam.example.mobile;

import com.testvagrant.ekam.testBases.testng.MobileTest;
import ekam.example.mobile.screens.LoginScreen;
import org.testng.annotations.Test;

import static com.testvagrant.ekam.commons.LayoutInitiator.Screen;

@Test(groups = "mobile")
public class MobileExampleTest extends MobileTest {

    @Test
    public void loginWithValidCredentials() {
        Screen(LoginScreen.class)
                .login("standard_user", "secret_sauce");
    }
}
