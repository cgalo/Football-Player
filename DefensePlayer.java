public class DefensePlayer extends Player {

    //Defensive player stats
    private int   interceptions ;
    private int   tackles       ;
    private float sacks         ;

    public DefensePlayer (String position, String name, float weight, int age ) {

        //Call the position, name, weight and age from Player parent class
        super ( position, name, weight, age ) ;

        this.tackles       = 0      ;
        this.sacks         = 0.0f   ;
        this.interceptions = 0      ;

    }

    //toString method to call all the stats of the defensePlayer
    @Override
    public String toString() {

        return  "\n\tPlayer's Info: "       +

                //First returns players general information: position, name, weight and age
                "\nPosition      = " +  position        +
                "\nName          = " +  name            +
                "\nWeight        = " +  weight          +
                "\nAge           = " +  age             +
                //Return QBs stats
                "\nTackles       = " +  tackles         +
                "\nSacks         = " +  sacks           +
                "\nInterceptions = " +  interceptions   ;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public float getSacks() {
        return sacks;
    }

    public void setSacks(float sacks) {
        this.sacks = sacks;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }
}
