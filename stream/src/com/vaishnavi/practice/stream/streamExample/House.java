package com.vaishnavi.practice.stream.streamExample;

public class House {
    private int id;
    private String design;
    private int rooms;
    private int floors;
    private double area; // in square feet

    public House(int id, String design, int rooms, int floors, double area) {
        this.id = id;
        this.design = design;
        this.rooms = rooms;
        this.floors = floors;
        this.area = area;
    }

    public int getId() { return id; }
    public String getDesign() { return design; }
    public int getRooms() { return rooms; }
    public int getFloors() { return floors; }
    public double getArea() { return area; }

    @Override
    public String toString() {
        return "House{id=" + id + ", design='" + design + "', rooms=" + rooms + ", floors=" + floors + ", area=" + area + " sqft}";
    }
}
