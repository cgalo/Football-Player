//Class for these type of players: Tight end, Running back and/or receiver
public class OtherPlayerTypes extends Player {

    //Stats for other typer of players like tight end, running back or receiver
    private int receptions      ;
    private int receptionYards  ;
    private int rushingYards    ;
    private int rushes          ;
    private int touchdowns      ;
    private int fumbles         ;

    public OtherPlayerTypes (String position, String name, float weight, int age ) {

        super ( position, name, weight, age ) ;

        this.receptions     = 0 ;
        this.receptionYards = 0 ;
        this.rushes         = 0 ;
        this.rushingYards   = 0 ;
        this.touchdowns     = 0 ;
        this.fumbles        = 0 ;

    }

    //toString method to call all the stats of the following type of players: Receiver, ,
    @Override
    public String toString () {

        return  "\n\tPlayer's Info: "    +

                //First returns players general information: position, name, weight and age
                "\nPosition         = " +   position         +
                "\nName             = " +   name             +
                "\nWeight           = " +   weight           +
                "\nAge              = " +   age              +

                //Return QBs stats
                "\nReception        = "  +  receptions       +
                "\nReception Yards  = "  +  receptionYards   +
                "\nRushes           = "  +  rushes           +
                "\nRushing Yards    = "  +  rushingYards     +
                "\nTouchdowns       = "  +  touchdowns       +
                "\nFumbles          = "  +  fumbles          ;
    }

    //Getter and Setters

    public int getReceptions() { return receptions; }

    public void setReceptions(int receptions) { this.receptions = receptions; }

    public int getReceptionYards() { return receptionYards; }

    public void setReceptionYards(int receptionYards) { this.receptionYards = receptionYards; }

    public int getRushes() { return rushes; }

    public void setRushes(int rushes) { this.rushes = rushes; }

    public int getRushingYards() { return rushingYards; }

    public void setRushingYards(int rushingYards) { this.rushingYards = rushingYards; }

    public int getTouchdowns() { return touchdowns; }

    public void setTouchdowns(int touchdowns) { this.touchdowns = touchdowns; }

    public int getFumbles() { return fumbles; }

    public void setFumbles(int fumbles) { this.fumbles = fumbles; }

}
