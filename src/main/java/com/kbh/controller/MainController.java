package com.kbh.controller;

import com.kbh.dto.KBH001RequestDTO;
import com.kbh.service.KBH001Service;
import com.kbh.system.base.dto.KBHResponseDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://10.16.136.169:8081", "http://localhost:8081" })
@RestController
public class MainController {

    // IoC service pagekage
    ApplicationContext appContext = new AnnotationConfigApplicationContext("com.kbh.service");

    // login request
    @RequestMapping(value = "/KBH001", method = RequestMethod.GET)
    public KBHResponseDTO KBH001Controller(KBH001RequestDTO requestDTO) {

        // 登陆服务--单例
        KBH001Service kbh001Service = appContext.getBean(KBH001Service.class);

        
        kbh001Service.excute(requestDTO);

        return new KBHResponseDTO();
    }
}