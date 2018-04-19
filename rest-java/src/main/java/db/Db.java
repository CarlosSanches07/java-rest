package db;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Db
 */
public class Db {
    public String uri;

    public Db(String uri) {
        this.uri = uri;
    }

    public ArrayList<Object> getList() {
        ArrayList<Object> data = null;
        try {
            Object obj = new JSONParser().parse(new FileReader(this.uri));
            JSONObject json = (JSONObject) obj;
            data = new ArrayList<Object>();
            JSONArray jsonData = (JSONArray) json.get("userList");
            Iterator<Object> i = jsonData.iterator();
            while(i.hasNext()){
                data.add(i.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public void create(Object data) {
        try{
            Object obj = new JSONParser().parse(new FileReader(this.uri));
            JSONObject json = (JSONObject) obj;
            JSONArray jsonData = (JSONArray) json.get("userList");
            jsonData.add(data);
            json.put("userList", jsonData);
            FileWriter f = new FileWriter(new File(this.uri));
            System.out.println(json.toJSONString());
            f.write(json.toJSONString());
            f.flush();
            f.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}