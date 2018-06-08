package br.furb.licenseServer;

import java.time.Instant;
import java.util.List;
import java.util.Random;

public class LicenseService {

    private List<License> licenseList;
    private final int licenseNumber = 5;
    private final int licenseSize = 5;
    private final String randomChar = "abcdefghijlmnopqrstuvxwyzABCDEFAGIJKLMNOPQRSTUVXWYZ0123456789!@#$%&*-+=";

    public LicenseService() {
        for(int i=0; i<=licenseNumber; i++){
            licenseList.add(new License(i+1, codeGenerator(licenseSize)));
        }
    }

    private String codeGenerator(int size) {
        StringBuilder returnCode = new StringBuilder();

        for(int i=0; i<=size; i++){
            Random rnd = new Random();
            returnCode.append(randomChar.charAt(rnd.nextInt(randomChar.length())));
           }

        return returnCode.toString();
    }
    
    public License licenseGet(){
        for(License l: licenseList){
            if(l.isAvaliable()){
                l.setReleaseTime(Instant.now());
                l.setAvaliable(false);
                return l;
            }
        }
    }

    public License licenseRenew(License l){
        return null;
    }

    public String licenseReturn(License l){
        return null;
    }
}
