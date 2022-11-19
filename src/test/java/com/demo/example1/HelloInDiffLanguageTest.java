package com.demo.example1;

import org.junit.jupiter.api.Test;
import java.io.IOException;

public class HelloInDiffLanguageTest {
    @Test
    public void helloTest() throws IOException{
        HelloInDiffLanguage.main(new String[]{"en"});
    }
}