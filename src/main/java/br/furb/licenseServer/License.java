package br.furb.licenseServer;

import java.time.Instant;

public class License {

    private int id;
    private String code;
    private boolean avaliable;
    private Instant releaseTime;
    private Client client;

    public License(int id, String code) {
        setId(id);
        setCode(code);
        setAvaliable(true);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public Instant getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Instant releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Client getClient() {
        return client;
    }
}
