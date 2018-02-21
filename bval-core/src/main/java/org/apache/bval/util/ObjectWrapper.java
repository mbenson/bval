/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */
package org.apache.bval.util;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ObjectWrapper<T> implements Consumer<T>, Supplier<T> {
    private T value;

    public ObjectWrapper() {
        this(null);
    }

    public ObjectWrapper(T value) {
        super();
        this.value = value;
    }

    @Override
    public void accept(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }

    public Optional<T> optional() {
        return Optional.ofNullable(value);
    }
}
