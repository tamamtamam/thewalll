package proj1.tamamtamam.thewall;

class Post {
    private int id;
    private String image;
    private String title;
    private String place;
    private String price;

    Post(int id, String title, String place, String price) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.price = price;

    }

    public String getPlace() {
        return place;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
