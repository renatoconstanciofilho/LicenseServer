package br.furb.licenseServer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LicenseService {

    private List<License> licenseList;
    private static final int LICENSE_NUMBER = 5;
    private static final int LICENSE_SIZE = 5;

    public LicenseService() {
        this.licenseList = new ArrayList<>();
        for(int i = 0; i< LICENSE_NUMBER; i++){
            licenseList.add(new License(i+1, codeGenerator(LICENSE_SIZE)));
        }
    }

    private String codeGenerator(int size) {
        return Long.toHexString(Double.doubleToLongBits(Math.random()));
    }
    
    public License licenseGet(){
        for(License l: licenseList){
            if(l.isAvaliable()) {
                return l;
            }
        }
        return null;
    }

    public License licenseRenew(License l){
        return null;
    }

    public Boolean licenseReturn(String code){
        for(License l: licenseList){
            if(code.equals(l.getCode())){
                l.setAvaliable(true);
                return true;
            }
        }
        return false;
    }
}
