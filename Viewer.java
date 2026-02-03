class Viewer {
    
    public int viewerId;
    public String name;

     public Viewer(int viewerId, String name) {
        this.viewerId = viewerId;
        this.name = name;
    }
    
     public String identify() {
        return "Viewer ID: " + viewerId + ", Name: " + name;
         
    }
}
