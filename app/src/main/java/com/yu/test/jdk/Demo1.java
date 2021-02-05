package com.yu.test.jdk;

import com.yu.pojo.Animal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {

    @Test
    public void test1() {
        List<Animal> animals = getList();
        //      [大象, 大象, 狗, 猫]
        List<String> collect = animals.stream().map(Animal::getName).collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * 分组
     */
    @Test
    public void test2() {
        List<Animal> animals = getList();
        //{大象=[com.yu.pojo.Animal@21588809, com.yu.pojo.Animal@2aae9190], 狗=[com.yu.pojo.Animal@2f333739], 猫=[com.yu.pojo.Animal@77468bd9]}
        Map<String, List<Animal>> collect = animals.stream().collect(Collectors.groupingBy(Animal::getName));
        System.out.println(collect);
    }

    public List<Animal> getList() {
        Animal animal1 = new Animal("大象", 1);
        Animal animal2 = new Animal("大象", 2);
        Animal animal3 = new Animal("狗", 5);
        Animal animal4 = new Animal("猫", 8);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        return animals;
    }
}
