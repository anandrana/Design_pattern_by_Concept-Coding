package com.progrank.builder;

//telescoping Constructor scope
public class Mobile1 {

    private String name;
    private String color;
    private String processor;
    private String ram;

    public Mobile1(String name) {
        this.name = name;
    }

    public Mobile1(String name, String color) {

        this(name);
        this.color = color;
    }

    public Mobile1(String name, String color, String processor) {
        this(name,color);
        this.processor = processor;
    }

    public Mobile1(String name, String color, String processor, String ram) {
        this(name,color,processor);
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Mobile1{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
