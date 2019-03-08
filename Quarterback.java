public class Quarterback extends Player {

    //Quarterback Stats
    private int passAttempts    ;
    private int passCompletions ;
    private int passingYard     ;
    private int rushingYards    ;
    private int rushingAttempts ;
    private int touchdowns      ;
    private int interceptions   ;
    private int fumbles         ;
    private int sacks           ;


    public Quarterback ( String position, String name, float weight, int age ) {

        //Call the position, name, weight and age from Player parent class
        super ( position, name, weight, age ) ;

        this.passAttempts    = 0 ;
        this.passCompletions = 0 ;
        this.passingYard     = 0 ;
        this.rushingYards    = 0 ;
        this.rushingAttempts = 0 ;
        this.touchdowns      = 0 ;
        this.interceptions   = 0 ;
        this.fumbles         = 0 ;
        this.sacks           = 0 ;

    }

    //toString method to call all the stats of the quarter back
    @Override
    public String toString() {

        return  "\n\tPlayer's Info: "       +

                //First returns players general information: position, name, weight and age
                "\nPosition         = " +   position          +
                "\nName             = " +   name              +
                "\nWeight           = " +   weight            +
                "\nAge              = " +   age               +

                //Return QBs stats
                "\nPass Attempts    = " +   passAttempts+
                "\nPass Completions = " +   passCompletions   +
                "\nPassing Yard     = " +   passingYard       +
                "\nRushing Yards    = " +   rushingYards      +
                "\nRushing Attempts = " +   rushingAttempts   +
                "\nTouchdowns       = " +   touchdowns        +
                "\nInterceptions    = " +   interceptions     +
                "\nFumbles          = " +   fumbles           +
                "\nSacks            = " +   sacks             ;
    }


    //Getters and Setters

    public int getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(int passAttempts) {
        this.passAttempts = passAttempts;
    }

    public int getPassCompletions() {
        return passCompletions;
    }

    public void setPassCompletions(int passCompletions) { this.passCompletions = passCompletions; }

    public int getPassingYard() {
        return passingYard;
    }

    public void setPassingYard(int passingYard) {
        this.passingYard = passingYard;
    }

    public int getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    public int getRushingAttempts() {
        return rushingAttempts;
    }

    public void setRushingAttempts(int rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }
}


