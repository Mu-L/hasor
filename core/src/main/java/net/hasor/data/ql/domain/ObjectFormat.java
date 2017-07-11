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
package net.hasor.data.ql.domain;
import net.hasor.data.ql.domain.inst.CompilerStack;
import net.hasor.data.ql.domain.inst.InstQueue;
/**
 * 函数调用的返回值处理格式，Object格式。
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class ObjectFormat extends Format {
    private ObjectExpression format;
    public ObjectFormat(ObjectExpression format) {
        super();
        this.format = format;
    }
    //
    //
    @Override
    public void doCompiler(InstQueue queue, CompilerStack stackTree) {
        queue.inst(ASM);
        this.format.doCompiler(queue, stackTree);
        queue.inst(ASE);
    }
}