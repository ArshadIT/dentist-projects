package com.denstistservice.controller;

import com.denstistservice.entity.JWTRequest;
import com.denstistservice.entity.JWTResponse;
import com.denstistservice.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JWTResponse createJwtToken(@RequestBody JWTRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);

    }

}
