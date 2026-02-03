class Movie {
    public int movieId;
    public String title;
    public double price;

    public Movie(int movieId, String title, double price) {
        this.movieId = movieId;
        this.title = title;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String identify() {
        return "Movie: " + title + " (P" + price + ")";
    }
}
