package GameofThrones;

public class Main {
    public static void main(String[] args){
        GameofThrones character1= new GameofThrones("Sansa","Stark");
//        GameofThrones character2= new GameofThrones("Arya","Stark");
//        GameofThrones character3= new GameofThrones("Sersei","Lanister");
//        GameofThrones character4= new GameofThrones("Jaime","Lanister");
//        GameofThrones character5= new GameofThrones("Daenerys", "Targaryen");
//        GameofThrones character6= new GameofThrones("Viserys","Targaryen");
        setArmy(character1,6.0);
        setTactic(character1,6.0);
        setKnwoledge(character1,8.0);
        setKnwoledge(character1,-8.0);
        setArmy(character1,36.0);
        setTactic(character1,-60.0);
        averageRating(character1);
    }
    public static void setArmy(GameofThrones character,Double rating){
        try {
            character.setArmy(rating);
        } catch (InValidRatings e) {
            System.out.println(e);;
        }
    }
    public static void setKnwoledge(GameofThrones character,Double rating){
        try {
            character.setKnowledge(rating);
        } catch (InValidRatings e) {
            System.out.println(e);;
        }
    }
    public static void setTactic(GameofThrones character,Double rating){
        try {
            character.setTactical(rating);
        } catch (InValidRatings e) {
            System.out.println(e);;
        }
    }
    public static void averageRating(GameofThrones character)
    {
        try {
            character.avgRating();
            System.out.println("Good luck!");
        } catch (InvalidForTheThrone e) {
            System.out.println(e);
        } finally {
            System.out.println("Valar Morghulis");
        }

    }
}
