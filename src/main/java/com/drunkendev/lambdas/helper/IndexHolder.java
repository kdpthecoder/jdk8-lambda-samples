/*
 * IndexHolder.java    Feb 2 2014, 03:34
 *
 * Copyright 2014 Drunken Dev.
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

package com.drunkendev.lambdas.helper;


/**
 * Represents an index to allow for incrementing/decrementing within a lambda
 * context as only (effective) final variables may be altered.
 *
 * @author  Brett Ryan
 */
public class IndexHolder {

    private int index;

    /**
     * Creates a new {@code IndexHolder} instance.
     */
    public IndexHolder() {
    }

    public int getIndex() {
        return index;
    }

    public int preIncrement() {
        return ++index;
    }

    public int postIncrement() {
        return index++;
    }

    public int preDecrement() {
        return --index;
    }

    public int postDecrement() {
        return index--;
    }

}