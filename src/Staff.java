public class Staff {
    private String name;
    private String post;

    public Staff(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return (getName() + " on position " + getPost());
    }
}
