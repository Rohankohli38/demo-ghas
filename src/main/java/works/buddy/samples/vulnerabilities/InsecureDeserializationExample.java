// src/main/java/works/buddy/samples/vulnerabilities/InsecureDeserializationExample.java
package works.buddy.samples.vulnerabilities;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class InsecureDeserializationExample {
    public void vulnerableMethod(String base64Data) {
        try {
            byte[] data = Base64.getDecoder().decode(base64Data);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject(); // Insecure deserialization
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
