
package com.codeup.springblog.service;


import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String returnInCaps(String string) {
        return string.toUpperCase();
    }

}