package GameofThrones;

import java.util.PrimitiveIterator;

public class GameofThrones {
    private String characterName;
    private String house;
    private Double tactical;
    private Double army;
    private Double knowledge;

    public GameofThrones(String characterName, String house) {
        this.characterName = characterName;
        this.house = house;
    }

    public void avgRating()throws InvalidForTheThrone{
        Double avg=army+knowledge+tactical;
        avg/=3;
        if(avg<8.0)
            throw new InvalidForTheThrone();
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {

        this.house = house;
    }

    public Double getTactical() {
        return tactical;
    }

    public void setTactical(Double tactical) throws InValidRatings {
        if(tactical<0.0){
            throw new InValidRatings("negative");
        } else if (tactical>10.0) {
            throw new InValidRatings("overloaded");

        } else{
            this.tactical = tactical;
        }

    }

    public Double getArmy() {
        return army;
    }

    public void setArmy(Double army) throws InValidRatings{
        if(army<0.0){
            throw new InValidRatings("negative");
        } else if (army>10.0) {
            throw new InValidRatings("overloaded");

        } else{
            this.army = army;
        }
    }

    public Double getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Double knowledge) throws InValidRatings{
        if(knowledge<0.0){
            throw new InValidRatings("negative");
        } else if (knowledge>10.0) {
            throw new InValidRatings("overloaded");

        } else{
            this.knowledge = knowledge;
        }
    }
}
