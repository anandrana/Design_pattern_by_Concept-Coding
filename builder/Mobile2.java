package com.progrank.builder;

public class Mobile2 {

    private String name;
    private String color;
    private String processor;
    private String ram;

    public Mobile2(String name, String color, String processor, String ram) {
        this.name = name;
        this.color = color;
        this.processor = processor;
        this.ram = ram;
    }

    public Mobile2(String name,String color,String processor){
        this(name,color,processor,null);
    }

    public Mobile2(String name,String color){
        this(name,color,null,null);
    }

    public Mobile2(String name){
        this(name,null,null,null);
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
        return "Mobile2{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
