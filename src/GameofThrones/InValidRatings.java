package GameofThrones;

public class InValidRatings extends Exception{
    private String kind;
    public InValidRatings(String kind){
        this.kind=kind;
    }

    @Override
    public String toString() {
        if(kind.equals("negative"))
            return "Ratings cannot be negative";
        else if (kind.equals("overloaded")) {
            return "Ratings cannot be greater than 10";
        }
        else
            return "Unknown Exception";
    }
}
