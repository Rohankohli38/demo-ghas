package works.buddy.samples;

import works.buddy.samples.vulnerabilities.SQLInjectionExample;
import works.buddy.samples.vulnerabilities.HardcodedSecretsExample;

public class App {
    public static void main(String[] args) {
        SQLInjectionExample sqlExample = new SQLInjectionExample();
        sqlExample.vulnerableMethod("admin' OR '1'='1"); // Simulate SQL Injection

        HardcodedSecretsExample secretsExample = new HardcodedSecretsExample();
        secretsExample.printSecret();
    }
}
