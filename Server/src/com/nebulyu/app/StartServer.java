package Server.src.com.nebulyu.app;

import com.nebulyu.config.Config;
import Server.src.com.nebulyu.server.Server;

import java.io.IOException;

public class StartServer {
    public static void main(String[] args) throws IOException {
        new Config().init();
        new Server();
    }
}
