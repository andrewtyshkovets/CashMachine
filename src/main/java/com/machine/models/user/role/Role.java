package com.machine.models.user.role;

import com.machine.models.Entity;

public enum Role implements Entity {

    CASHIER("cashier"),
    SENIOR_CASHIER("seniorCashier"),
    PRODUCT_OBSERVER("productObserver");

    private long id;
    private String name;

    Role(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Role{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}