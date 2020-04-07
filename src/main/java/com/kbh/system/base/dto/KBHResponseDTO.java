package com.kbh.system.base.dto;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("prototype")
@Data
public class KBHResponseDTO {

    private String resultType;

    private ArrayList<ResponseDataDTOBase> data;

}