package setups;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends ChromeSetup{
    @Before
    public void before() throws Exception {
        chromeStart();
    }

    @After
    public void after() throws Exception {
        chromeStop();
    }
}
