package proj1.tamamtamam.thewall;

class Post {
    private int id;
    private String imageUrl;
    private String title;
    private String place;
    private String price;

    Post(int id, String title, String place, String price, String imageUrl) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.price = price;
        this.imageUrl = imageUrl;

    }

    public String getPlace() {
        return place;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
