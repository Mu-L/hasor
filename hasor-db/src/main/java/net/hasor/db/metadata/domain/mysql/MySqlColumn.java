/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.db.metadata.domain.mysql;
import net.hasor.db.metadata.ColumnDef;

import java.sql.JDBCType;

/**
 * MySQL 列
 * @version : 2021-03-30
 * @author 赵永春 (zyc@hasor.net)
 */
public class MySqlColumn implements ColumnDef {
    private String     name;
    private boolean    nullable;
    private String     dataType;
    private String     columnType;
    private MySqlTypes sqlType;
    private JDBCType   jdbcType;
    private boolean    primaryKey;
    private boolean    uniqueKey;//如若存在联合唯一索引需要借助getUniqueKey 来查询具体信息，这里只会表示该列存在至少一个唯一索引的引用。
    private String     comment;
    //
    private Integer    datetimePrecision;
    private Integer    numericPrecision;
    private Integer    numericScale;
    private String     defaultValue;
    //
    private String     defaultCollationName;
    private String     defaultCharacterSetName;
    private Long       charactersMaxLength;
    private Integer    bytesMaxLength;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNullable() {
        return this.nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnType() {
        return this.columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public MySqlTypes getSqlType() {
        return this.sqlType;
    }

    public void setSqlType(MySqlTypes sqlType) {
        this.sqlType = sqlType;
    }

    public JDBCType getJdbcType() {
        return this.jdbcType;
    }

    public void setJdbcType(JDBCType jdbcType) {
        this.jdbcType = jdbcType;
    }

    public boolean isPrimaryKey() {
        return this.primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isUniqueKey() {
        return this.uniqueKey;
    }

    public void setUniqueKey(boolean uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Integer getNumericScale() {
        return this.numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultCollationName() {
        return this.defaultCollationName;
    }

    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    public String getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }

    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    public Long getCharactersMaxLength() {
        return this.charactersMaxLength;
    }

    public void setCharactersMaxLength(Long charactersMaxLength) {
        this.charactersMaxLength = charactersMaxLength;
    }

    public Integer getBytesMaxLength() {
        return this.bytesMaxLength;
    }

    public void setBytesMaxLength(Integer bytesMaxLength) {
        this.bytesMaxLength = bytesMaxLength;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
