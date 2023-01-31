package strings;

import java.util.UUID;

public class Uuid {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.split("-")[0]);
    }
}
