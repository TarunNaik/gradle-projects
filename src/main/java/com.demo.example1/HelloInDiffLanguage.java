package com.demo.example1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HelloInDiffLanguage {

    public static void main(String[] args) throws IOException {
        String language = args[0];

        InputStream inputStream = HelloInDiffLanguage.class.getClassLoader().getResourceAsStream(language+".txt");
        assert inputStream != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

        System.out.println(reader.readLine());

    }
}