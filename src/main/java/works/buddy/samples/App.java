package works.buddy.samples;

import works.buddy.samples.vulnerabilities.SQLInjectionExample;
import works.buddy.samples.vulnerabilities.HardcodedSecretsExample;
import works.buddy.samples.vulnerabilities.InsecureDeserializationExample;


public class App {
    public static void main(String[] args) {
        SQLInjectionExample sqlExample = new SQLInjectionExample();
        sqlExample.vulnerableMethod("admin' OR '1'='1"); // Simulate SQL Injection

        InsecureDeserializationExample deserializationExample = new InsecureDeserializationExample();
        deserializationExample.vulnerableMethod("someBase64EncodedData");

        HardcodedSecretsExample secretsExample = new HardcodedSecretsExample();
        secretsExample.printSecret();
    }
}
