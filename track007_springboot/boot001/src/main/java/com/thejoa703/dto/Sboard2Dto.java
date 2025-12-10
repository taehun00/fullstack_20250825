package com.thejoa703.dto;

import java.sql.Date;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sboard2Dto {

    private int id;
    private int appUserId;
    private String btitle;
    private String bcontent;
    private String bpass;
    private String bfile;
    private int bhit;
    private String bip; 
    private Date createdAt;
}
