package com.vaishnavi.ecommerce.model;

public class Review {
    public String heading;
    public int id;
    public String rating;
    public String description;

    @Override
    public String toString() {
        return "Review{" +
                "heading='" + heading + '\'' +
                ", id=" + id +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

