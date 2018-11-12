package pl.finsys.inheritance_and_interfaces;

public class Review {

    private int id;
    private String description;
    private int rating;

    public Review(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return id + " " + description + " " + rating;
    }

}
