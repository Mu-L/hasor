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
import net.hasor.db.types.TypeHandler;
import net.hasor.db.types.UnknownTypeHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * （可选）标记在字段上表示映射到的列
 * @version : 2020-10-31
 * @author 赵永春 (zyc@hasor.net)
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    /** 列名，为空的话表示采用字段名为列名 see: {@link #name()} */
    public String value() default "";

    /** 列名，为空的话表示采用类名为表名 see: {@link #value()} */
    public String name() default "";

    /** 指定使用的 typeHandler（功效和 Mybatis 的 TypeHandler 相同） */
    public Class<? extends TypeHandler<?>> typeHandler() default UnknownTypeHandler.class;

    /** 参与更新（在配置了 @Table 注解时，通过 net.hasor.db.lambda.LambdaOperations 接口操作才有效。） */
    public boolean update() default true;

    /** 参与新增（在配置了 @Table 注解时，通过 net.hasor.db.lambda.LambdaOperations 接口操作才有效。） */
    public boolean insert() default true;
}
