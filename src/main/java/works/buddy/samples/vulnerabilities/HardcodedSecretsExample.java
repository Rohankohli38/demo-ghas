// src/main/java/works/buddy/samples/vulnerabilities/HardcodedSecretsExample.java
package works.buddy.samples.vulnerabilities;

public class HardcodedSecretsExample {
    private static final String SECRET_KEY = "mySecret123"; // Hardcoded secret key

    public void printSecret() {
        System.out.println("The secret key is: " + SECRET_KEY);
    }
}
