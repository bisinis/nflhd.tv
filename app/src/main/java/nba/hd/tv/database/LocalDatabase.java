package nba.hd.tv.database;

import com.google.gson.Gson;
import nba.hd.tv.models.FullData;

public class LocalDatabase {
    public static FullData fullData = new FullData();
    public static String stringJson= "{}";

    static {
        Gson gson = new Gson();
        fullData = gson.fromJson(stringJson, FullData.class);
    }

}
