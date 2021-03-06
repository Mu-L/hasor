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
package net.hasor.db.lambda;
import net.hasor.db.lambda.page.Page;
import net.hasor.db.metadata.ColumnDef;
import net.hasor.utils.reflect.SFunction;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Query 复杂操作构造器。
 * @version : 2020-10-31
 * @author 赵永春 (zyc@hasor.net)
 */
public interface QueryFunc<T, R> {
    /**
     * 查询指定列。
     * 在分组查询下：返回所有分组列 */
    public R selectAll();

    /**
     * 查询指定列。
     * 在分组查询下：设置参数中，只有 group by 列才会被查询。 */
    public R select(String... columns);

    /**
     * 查询指定列。
     * 在分组查询下：设置参数中，只有 group by 列才会被查询。 */
    public default R select(SFunction<T> property) {
        return select(Collections.singletonList(property));
    }

    /**
     * 查询指定列。
     * 在分组查询下：设置参数中，只有 group by 列才会被查询。 */
    public R select(List<SFunction<T>> properties);

    /**
     * 按条件过滤查询指定列。
     * 在分组查询下：设置参数中，只有 group by 列才会被查询。 */
    public R select(Predicate<ColumnDef> tester);

    /**分组，类似：group by xxx */
    public default R groupBy(SFunction<T> property) {
        return groupBy(Collections.singletonList(property));
    }

    /**分组，类似：group by xxx */
    public R groupBy(List<SFunction<T>> properties);

    /** 排序，类似：order by xxx */
    public default R orderBy(SFunction<T> property) {
        return orderBy(Collections.singletonList(property));
    }

    /** 排序，类似：order by xxx */
    public R orderBy(List<SFunction<T>> properties);

    /** 排序(升序)，类似：order by xxx desc */
    public default R asc(SFunction<T> property) {
        return asc(Collections.singletonList(property));
    }

    /** 排序(升序)，类似：order by xxx desc */
    public R asc(List<SFunction<T>> properties);

    /** 排序(降序)，类似：order by xxx desc */
    public default R desc(SFunction<T> property) {
        return desc(Collections.singletonList(property));
    }

    /** 排序(降序)，类似：order by xxx desc */
    public R desc(List<SFunction<T>> properties);

    /** 设置分页信息 */
    public R usePage(Page pageInfo);

    /** 获取对应的分页对象 */
    public Page pageInfo();

    /** 生成分页对象 */
    public R initPage(int pageSize, int pageNumber);
}
