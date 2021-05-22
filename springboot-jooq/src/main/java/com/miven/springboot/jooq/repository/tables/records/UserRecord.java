/*
 * This file is generated by jOOQ.
 */
package com.miven.springboot.jooq.repository.tables.records;


import com.miven.springboot.jooq.repository.tables.User;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record3<UInteger, String, Short> {

    private static final long serialVersionUID = 579848215;

    /**
     * Setter for <code>demo.user.id</code>. ID 主键
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>demo.user.id</code>. ID 主键
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>demo.user.name</code>. 名字
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demo.user.name</code>. 名字
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>demo.user.age</code>. 年龄
     */
    public void setAge(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>demo.user.age</code>. 年龄
     */
    public Short getAge() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, String, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, String, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return User.USER.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(Short value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(UInteger value1, String value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(UInteger id, String name, Short age) {
        super(User.USER);

        set(0, id);
        set(1, name);
        set(2, age);
    }
}