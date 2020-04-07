package com.kbh.service;

import com.kbh.logic.LoginLogic;
import com.kbh.system.base.dto.KBHResponseDTO;
import com.kbh.system.base.dto.RequestDataDTOBase;
import com.kbh.system.interfaces.BaseServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KBH001Service implements BaseServiceInterface {

    @Autowired
    private LoginLogic logic;

    @Autowired
    private KBHResponseDTO data;

    @Override
    public KBHResponseDTO excute(RequestDataDTOBase requestDataDTOBase) {

        this.data = this.logic.excute(requestDataDTOBase);

        return this.data;
    }

}
