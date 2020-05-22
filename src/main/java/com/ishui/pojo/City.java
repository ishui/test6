package com.ishui.pojo;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project: untitled14
 * @Package: com.ishui.pojo
 * @Author:[李晓晖]
 * @date 2020-04-15 17:38
 * @Description: [该类的功能]
 */
public class City {
    private short cityId;
    private String city;
    private short countryId;
    private Timestamp lastUpdate;

    public short getCityId() {
        return cityId;
    }

    public void setCityId(short cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public short getCountryId() {
        return countryId;
    }

    public void setCountryId(short countryId) {
        this.countryId = countryId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return cityId == city1.cityId &&
                countryId == city1.countryId &&
                Objects.equals(city, city1.city) &&
                Objects.equals(lastUpdate, city1.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, city, countryId, lastUpdate);
    }
}
