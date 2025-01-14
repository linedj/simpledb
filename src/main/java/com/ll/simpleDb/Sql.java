package com.ll.simpleDb;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sql {

    private final SimpleDb simpleDb;
    private final StringBuilder sqlBuilder;

    public Sql(SimpleDb simpleDb) {
        this.sqlBuilder = new StringBuilder();
        this.simpleDb = simpleDb;
    }

    public Sql append(String sqlLine) {
        this.sqlBuilder.append(sqlLine);
        this.sqlBuilder.append(" ");
        return this;
    }

    public Sql append(String sqlLine, Object... args) {
        this.sqlBuilder.append(sqlLine);
        this.sqlBuilder.append(" ");
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
        return simpleDb.selectRows(sqlBuilder.toString());
    }

    public Map<String, Object> selectRow() {
        return simpleDb.selectRow(sqlBuilder.toString());
    }

    public LocalDateTime selectDatetime() {
        return simpleDb.selectDatetime(sqlBuilder.toString());
    }

    public Long selectLong() {
        return simpleDb.selectLong(sqlBuilder.toString());
    }

    public String selectString() {
        return simpleDb.selectString(sqlBuilder.toString());
    }

    public Boolean selectBoolean() {
        return simpleDb.selectBoolean(sqlBuilder.toString());
    }
}