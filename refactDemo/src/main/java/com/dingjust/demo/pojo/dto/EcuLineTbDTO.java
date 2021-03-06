/*
 *
 *  Dingjust Cloud Platform
 *
 *  Copyright (c) 2018 Dingjust
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of Dingjust
 *  ("Confidential Information"). You shall not disclose such
 *  Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with Dingjust.
 *
 */
package com.dingjust.demo.pojo.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Line entity.
 *
 * @author lichunfeng
 * @version 1.0
 */
public class EcuLineTbDTO implements Serializable {
    private Long id;
    private String lineName;
    private String lineAttr;
    private String lineFlag;
    private LocalDateTime lineTime;
    private String lineBz;
    private Integer lineNo;
    private EcuDTO ecu;

    public EcuLineTbDTO() {

    }

    public EcuLineTbDTO(Long id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineAttr() {
        return lineAttr;
    }

    public void setLineAttr(String lineAttr) {
        this.lineAttr = lineAttr;
    }

    public String getLineFlag() {
        return lineFlag;
    }

    public void setLineFlag(String lineFlag) {
        this.lineFlag = lineFlag;
    }

    public LocalDateTime getLineTime() {
        return lineTime;
    }

    public void setLineTime(LocalDateTime lineTime) {
        this.lineTime = lineTime;
    }

    public String getLineBz() {
        return lineBz;
    }

    public void setLineBz(String lineBz) {
        this.lineBz = lineBz;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EcuDTO getEcu() {
        return ecu;
    }

    public void setEcu(EcuDTO ecu) {
        this.ecu = ecu;
    }
}
