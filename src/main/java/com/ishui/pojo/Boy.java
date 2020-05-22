package com.ishui.pojo;

import java.util.Objects;

/**
 * @Project: untitled14
 * @Package: com.ishui.pojo
 * @Author:[李晓晖]
 * @date 2020-04-16 10:02
 * @Description: [该类的功能]
 */
public class Boy {
    private int id;
    private String address;
    private Integer age;
    private String username;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boy boy = (Boy) o;
        return id == boy.id &&
                Objects.equals(address, boy.address) &&
                Objects.equals(age, boy.age) &&
                Objects.equals(username, boy.username) &&
                Objects.equals(sex, boy.sex);
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, age, username, sex);
    }
}
