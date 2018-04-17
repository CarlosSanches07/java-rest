package user;

import java.util.ArrayList;

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
        Client c = new Client();
        c.setName("saasldfjdks");
        Client c2 = new Client();
        c2.setName("asjdiyuewbf");
        ArrayList<Client> l = new ArrayList<Client>();
        l.add(c);
        l.add(c2);

        return l;
    }

    /**
     * @param client the client to create
     */
    public void create(Client client) {
        client = new Client();
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