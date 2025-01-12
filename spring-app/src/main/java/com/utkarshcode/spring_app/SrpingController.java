package com.utkarshcode.spring_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SrpingController {

    @RequestMapping("/strcodetest")
    public String StrCodetest(){
        return "String Code test for dev ";
    }
}



