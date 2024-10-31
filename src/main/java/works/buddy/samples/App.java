package com.example;

import com.example.vulnerabilities.SQLInjectionExample;
import com.example.vulnerabilities.XSSExample;
import com.example.vulnerabilities.InsecureDeserializationExample;
import com.example.vulnerabilities.HardcodedSecretsExample;

public class App {
    public static void main(String[] args) {

        HardcodedSecretsExample secretsExample = new HardcodedSecretsExample();
        secretsExample.printSecret();
    }
}
