/*
 * Copyright 2002-2005 the original author or authors.
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
package net.hasor.db.dal;
import net.hasor.db.dal.repository.config.MultipleResultsType;
import net.hasor.db.dal.repository.config.ResultSetType;
import net.hasor.db.dal.repository.config.StatementType;

import java.lang.annotation.*;

/**
 * 存储过程
 * @version : 2021-05-19
 * @author 赵永春 (zyc@hasor.net)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Callable {
    public String value();

    public StatementType statementType() default StatementType.Callable;

    public int timeout() default -1;

    public int fetchSize() default 256;

    public ResultSetType resultSetType() default ResultSetType.DEFAULT;

    public MultipleResultsType multipleResult() default MultipleResultsType.LAST;

    public String resultDataQL() default "";
}
