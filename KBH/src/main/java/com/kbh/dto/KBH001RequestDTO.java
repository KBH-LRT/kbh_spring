package com.kbh.dto;

import com.kbh.system.base.dto.RequestDataDTOBase;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class KBH001RequestDTO extends RequestDataDTOBase {

    private String userName;

    private String userPwd;

}