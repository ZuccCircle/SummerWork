package com.zucc.circle.summerwork.Entity;

/**
 * Created by 圆圈 on 2017-07-09.
 */

public class ExpendEntity {
    public ExpendEntity(String name, String money, String type, String note) {
        this.name = name;
        this.money = money;
        this.type = type;
        this.note = note;
    }
    public ExpendEntity() {

    }
    String money;
    String name;
    String type;
    String start_time;
    String note;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
