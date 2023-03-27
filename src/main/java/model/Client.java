package model;

public class Client {
    int id;
    String name;
    String email;
    String phone;

    public Client() {
    }

    public Client(String name, String email, String number){
        this.name=name;
        this.email=email;
        this.phone=number;
    }

    public Client(int id,String name, String email, String phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
