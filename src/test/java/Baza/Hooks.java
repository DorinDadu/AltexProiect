package Baza;

import org.junit.After;
import org.junit.Before;
import propertiesUtility.PropertiesObject;

import java.util.HashMap;

public class Hooks extends SharedData {
    public HashMap<String, String> inputData;

    @Before
    public void prepareEnvironment() {
        InitializeDriver();
        String className = this.getClass().getSimpleName();
        PropertiesObject testData = new PropertiesObject("testsResources/" + className + "Resource");
        inputData = testData.getAllKeyValues();
    }

    @After
    public void clearEnvironment() {
        TearDown();
    }


}
