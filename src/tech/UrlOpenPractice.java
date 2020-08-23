package tech;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class UrlOpenPractice extends Thread {
    public static void main(String[] args) throws URISyntaxException, IOException {

            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://codeforces.com/profile/ajaygupta007"));

    }

}
