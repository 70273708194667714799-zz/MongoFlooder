package gg.arcanecici.mongoflooder;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.IOException;

/**
 * @author ArcaneCiCi ~ Best CheatBreaker Developer WorldWide <3
 */

public class Loader {

    public static void main(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("url").withRequiredArg().required().ofType(String.class);

        OptionSet options;

        try {
            options = parser.parse(args);
        } catch (OptionException ex) {
            System.out.println("Usage: java -jar MongoFlooder.jar --url <Mongo URI>");
            System.out.println(ex.getMessage());
            System.exit(1);
            return;
        }

        String inputUrl = (String) options.valueOf("url");

        try {
            new MongoFlooder(inputUrl);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

}
