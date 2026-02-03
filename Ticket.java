class Ticket {
    public int ticketId;

    // Aggregation
    public Viewer viewer;
    // Composition
    public Movie movie;
    
    public Ticket(int ticketId, Viewer viewer, Movie movie) {
        this.ticketId = ticketId;
        this.viewer = viewer;
        this.movie = movie;
    }
    
    public double calculateTotal() {
        return movie.getPrice();
    }

    public String identify() {
        return "Ticket ID: " + ticketId;
    }
}
