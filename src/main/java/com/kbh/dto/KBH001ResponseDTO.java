package com.kbh.dto;

import com.kbh.system.base.dto.ResponseDataDTOBase;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class KBH001ResponseDTO extends ResponseDataDTOBase {

    private String userName;
}