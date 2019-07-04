package proj1.tamamtamam.thewall;

class Post {
    private int id;
    private String image;
    private String title;
    private String place;
    private String date;

    Post(int id, String title, String place, String date) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }
}
