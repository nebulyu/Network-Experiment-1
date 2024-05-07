package Server.src.com.nebulyu.dao;

import com.nebulyu.config.Config;

import java.util.HashMap;
import java.util.Map;

public class DaoFactory {
    private static Map<String, UserDao> userDaoMap = new HashMap<String, UserDao>();
    public static void initDao(){
        userDaoMap.put("sqlite",new UserDaoSqlite());
    }
    //	private static String DBTYPE = "oracle";
    public static UserDao getUserDao(){
        return new UserDaoSqlite();
    }
}
