package br.furb.licenseServer;

public class Client {

    private String id;
    private int renewTime;

    public Client(String id, int renewTime) {
        this.id = id;
        this.renewTime = renewTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(int renewTime) {
        this.renewTime = renewTime;
    }
}
