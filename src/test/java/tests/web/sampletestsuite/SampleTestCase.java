/**
* @author: mohammad.faizan
*
*/
package tests.web.sampletestsuite;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.WsStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.Validator;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;
import java.io.IOException;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import steps.common.*;
import com.qmetry.qaf.automation.util.PropertyUtil;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;



 

public class SampleTestCase extends WebDriverTestCase {

   private QAFExtendedWebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
       driver = getDriver();
    }

    @Test ( groups =  {} )
    public void SampleTestCaseTest() throws Exception {
				 
    
                 CommonStep.get("https://www.qmetry.com/"); 
                 CommonStep.waitForEnabled("link.visit.support"); 
                 CommonStep.click("link.visit.support"); 

				 
    }

}

