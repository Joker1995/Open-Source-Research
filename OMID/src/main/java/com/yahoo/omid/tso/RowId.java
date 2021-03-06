/**
 * Copyright (c) 2011 Yahoo! Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. See accompanying LICENSE file.
 */

package com.yahoo.omid.tso;

/**
 * The wrapper for row id
 * @author maysam
 *
 */
//未使用
public class RowId {

    /**
     * the unique row id
     */
    private long id;

    /**
     * getter and setter
     */
    public long get() {
        return id;
    }

    public void set(long id) {
        this.id = id;
    }

    /**
     * Constructor 
     * @param t
     */
    public RowId(long id) {
        this.set(id);
    }

    @Override
    public String toString() {
        return "RowId: " + id;
    }

    @Override
    public int hashCode() {
        return (int) id;
    }

    @Override
    public boolean equals(Object o) {
        return (id == ((RowId) o).id);
    }

}
