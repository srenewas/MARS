package com.seenu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PassMobilesAsKey {
    String name;
    int id;
    String model;

    public PassMobilesAsKey(String name, int id, String model) {
        this.name = name;
        this.id = id;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PassMobilesAsKey that = (PassMobilesAsKey) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, model);
    }

    @Override
    public String toString() {
        return "PassMobilesAsKey{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PassMobilesAsKey p1 = new PassMobilesAsKey("Sony",1,"Xperia");
        PassMobilesAsKey p2 = new PassMobilesAsKey("Sony",1,"Xperia");
        Map<PassMobilesAsKey, String> map = new HashMap<>();
        map.put(p1,"Seenu");
        //map.entrySet().stream().forEach(System.out::println);
        System.out.println(map.get(p2));

    }
}
