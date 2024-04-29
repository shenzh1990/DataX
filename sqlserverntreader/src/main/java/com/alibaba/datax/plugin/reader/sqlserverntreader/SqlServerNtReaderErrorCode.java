package com.alibaba.datax.plugin.reader.sqlserverntreader;

import com.alibaba.datax.common.spi.ErrorCode;

public enum SqlServerNtReaderErrorCode implements ErrorCode {
    ;

    private String code;
    private String description;

    private SqlServerNtReaderErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

}
