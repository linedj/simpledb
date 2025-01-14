package com.ll.simpleDb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sql {

    private String sqlFormat;

    public Sql() {
    }

    public Sql append(String sqlLine) {
        this.sqlFormat = sqlLine;
        return this;
    }

    public Sql append(String sqlLine, Object... args) {
        this.sqlFormat = sqlLine;
        return this;
    }

    public long insert() {
        return 1;
    }
    public int update() {
        return 3;
    }

    public int delete() {
        return 2;
    }


    public List<Map<String, Object>> selectRows() {
        List<Map<String, Object>> rows = new ArrayList<>();
        Map<String, Object> row1 = new HashMap<>();

        row1.put("id", 1);
        row1.put("title", "제목1");

        return rows;
    }
    public Map<String, Object> selectRow() {
        return selectRows().get(0);
    }

    public LocalDateTime selectDatetime() {
        return LocalDateTime.now();
    }


    public Long selectLong() {
        return 1L;
    }

    public Boolean selectBoolean() {
        if("SELECT 1 = 1".equals(sqlFormat)) {
            return true;
        } else if("SELECT 1 = 0".equals(sqlFormat)) {
            return false;
        }
        return false;
    }
}