
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.LoginRequest;
import com.portfolio.MCC.Entity.LoginResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://portfoliomcc-38e6c.firebaseapp.com/", "http://localhost:4200/", "https://portfoliomcc-38e6c.web.app"})
public class LoginController {
    @PostMapping("auth/login")
    public LoginResponse login(@RequestBody LoginRequest LoginRequest){
     
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setType("Baerer");
        loginResponse.setToken("gjhghjghgjhgh");
        loginResponse.setExpire_In("365");
        loginResponse.setRefresh_Token("hghjghjghgjhg");
        
        return loginResponse;
    }
}
