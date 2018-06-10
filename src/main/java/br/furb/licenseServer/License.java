package br.furb.licenseServer;

public class License {

    private int id;
    private String code;
    private boolean avaliable;

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

}
