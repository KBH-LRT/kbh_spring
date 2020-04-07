package com.kbh.system.interfaces;

import com.kbh.system.base.dto.KBHResponseDTO;
import com.kbh.system.base.dto.RequestDataDTOBase;

public interface BaseLogicInterface {
    public KBHResponseDTO excute(RequestDataDTOBase requestDataDTOBase);
}
