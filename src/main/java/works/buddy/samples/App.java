package works.buddy.samples;

import works.buddy.samples.vulnerabilities.SQLInjectionExample;

public class App {
    public static void main(String[] args) {
        SQLInjectionExample sqlExample = new SQLInjectionExample();
        sqlExample.vulnerableMethod("admin' OR '1'='1"); // Simulate SQL Injection
    }
}
