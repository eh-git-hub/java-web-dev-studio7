package org.launchcode.studio7;

public class BaseDisc {
    private String name;
    private int capacity;
    private String content;
    private String discType;

    public BaseDisc(String name, int capacity, String content, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.content = content;
        this.discType = discType;
    }

    public String discInfo(){
        return "Name: " + this.name + "\n"
                + "Capacity: " + this.capacity + "\n"
                + "Content: " + this.content + "\n"
                + "discType: " + this.discType;

    }

    public String getName() {
        return name;
    }

    public String getDiscType() {
        return discType;
    }
}
