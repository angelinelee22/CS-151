public class InstagramAccount implements Comparable<InstagramAccount> {
    String userName;
    private int numberOfPosts;
    private int numberOfFollowing;


    public InstagramAccount(String userName, int numberOfPosts, int numberOfFollowing) {
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
        this.numberOfFollowing = numberOfFollowing;
    }

    @Override
    public String toString() {
        // To nicely print each object
        // May be helpful for debugging
        return this.userName + " posts " + this.numberOfPosts + " following " + this.numberOfFollowing;
    }

    @Override
    public int compareTo(InstagramAccount acc) {
        if((this.numberOfPosts - acc.numberOfPosts) != 0) {
            return -(this.numberOfPosts - acc.numberOfPosts);
        } else {
            return -(this.numberOfFollowing - acc.numberOfFollowing);
        }
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstagramAccount) {
            InstagramAccount other = (InstagramAccount) obj;
            return this.compareTo(other) == 0;
        }
        return false;
    }
    
}