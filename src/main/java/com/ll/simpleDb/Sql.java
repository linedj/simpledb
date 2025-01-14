package com.ll.simpleDb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sql {

    private StringBuilder sqlBuilder;

    public Sql() {
        this.sqlBuilder = new StringBuilder();
    }

    public Sql append(String sqlLine) {
        sqlBuilder.append(sqlLine);
        return this;
    }

    public Sql append(String sqlLine, Object... args) {
        sqlBuilder.append(sqlLine);
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
        return Boolean.FALSE;
    }
}