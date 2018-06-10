package br.furb.licenseServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LicenseController {

    @Autowired
    private final LicenseService licenseService;

    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @GetMapping()
    public ResponseEntity get(){
        License l = licenseService.licenseGet();
        if(l == null)
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        else {
            l.setAvaliable(false);
            return ResponseEntity.status(200).body(l);
        }
    }

    @PostMapping("/{code}")
    public ResponseEntity returnLicense(@PathVariable(value = "code") String licenseCode){
        licenseService.licenseReturn(licenseCode);
        return ResponseEntity.ok().build();
    }
}
