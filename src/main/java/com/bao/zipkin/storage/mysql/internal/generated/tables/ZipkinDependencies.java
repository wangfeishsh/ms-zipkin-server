/**
 * Copyright 2015-2016 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * This class is generated by jOOQ
 */
package com.bao.zipkin.storage.mysql.internal.generated.tables;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import com.bao.zipkin.storage.mysql.internal.generated.Zipkin;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZipkinDependencies extends TableImpl<Record> {

    private static final long serialVersionUID = 78992984;

    /**
     * The reference instance of <code>zipkin.zipkin_dependencies</code>
     */
    public static final ZipkinDependencies ZIPKIN_DEPENDENCIES = new ZipkinDependencies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>zipkin.zipkin_dependencies.day</code>.
     */
    public final TableField<Record, Date> DAY = createField("day", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.parent</code>.
     */
    public final TableField<Record, String> PARENT = createField("parent", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.child</code>.
     */
    public final TableField<Record, String> CHILD = createField("child", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.call_count</code>.
     */
    public final TableField<Record, Long> CALL_COUNT = createField("call_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>zipkin.zipkin_dependencies</code> table reference
     */
    public ZipkinDependencies() {
        this("zipkin_dependencies", null);
    }

    /**
     * Create an aliased <code>zipkin.zipkin_dependencies</code> table reference
     */
    public ZipkinDependencies(String alias) {
        this(alias, ZIPKIN_DEPENDENCIES);
    }

    private ZipkinDependencies(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ZipkinDependencies(String alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Zipkin.ZIPKIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinDependencies as(String alias) {
        return new ZipkinDependencies(alias, this);
    }

    /**
     * Rename this table
     */
    public ZipkinDependencies rename(String name) {
        return new ZipkinDependencies(name, null);
    }
}