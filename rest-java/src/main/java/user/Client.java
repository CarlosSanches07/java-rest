package user;

import db.Db;
import java.util.ArrayList;
import org.json.simple.JSONObject;

public class Client {
    private int id;
    private String name;
    private String password;
    private String email;
    private String tel;

    /**
     * @return the id
      */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    /**
     * @return the client list
        
     */
    public ArrayList<Client> list() {
        Db db = new Db("C:\\Users\\carlos.roberto\\Documents\\java-rest\\rest-java\\src\\main\\java\\db\\db.json");
        ArrayList<Client> l = new ArrayList<Client>();
        for (Object item : db.getList()) {
            JSONObject obj =(JSONObject) item;
            Client c = new Client();
            c.setId( Integer.parseInt(obj.get("id").toString()));
            c.setName( (String) obj.get("name"));
            c.setEmail( (String) obj.get("email"));
            c.setPassword( (String) obj.get("password"));
            c.setTel( (String) obj.get("tel"));
            l.add(c);
        }
        return l;
    }

    /**
     * @param client the client to create
     */
    public void create(Object client) {
        System.out.println(client);
        Db db = new Db("C:\\Users\\carlos.roberto\\Documents\\java-rest\\rest-java\\src\\main\\java\\db\\db.json");
        db.create(client); 
    }

    /**
     * @param id the client id
     * @return the client
     */
    public Client read(int id) {
        return new Client();
    }

    /**
     * @param id the client id
     */
     public void update(int id) {
        //find client by id;
     }

     /**
      * @param id the client id
      */
     public void delete(int id) {
        //find by id and remove it
     }


}