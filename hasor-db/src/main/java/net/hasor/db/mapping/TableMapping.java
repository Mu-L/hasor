/*
 * Copyright 2002-2010 the original author or authors.
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
package net.hasor.db.mapping;
import net.hasor.db.lambda.generation.GenerationType;
import net.hasor.db.metadata.CaseSensitivityType;
import net.hasor.db.metadata.TableDef;

import java.util.List;

/**
 * 查询的表
 * @version : 2020-10-31
 * @author 赵永春 (zyc@hasor.net)
 */
public interface TableMapping extends TableDef {
    public Class<?> entityType();

    /** 主键生成策略 */
    public GenerationType generationKey();

    /** 是否将类型下的所有字段都自动和数据库中的列进行映射匹配，true 表示自动。false 表示必须通过 @Property 注解声明。 */
    public boolean isAutoProperty();

    public CaseSensitivityType getCaseSensitivity();

    public List<String> getPropertyNames();

    public List<ColumnMapping> getProperties();

    public ColumnMapping getMapping(String propertyName);

    public List<String> getColumnNames();

    public List<ColumnMapping> getMappingByColumnName(String columnName);
}