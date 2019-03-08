/*Author: Carlos Galo
IDE: IntelliJ
*/

import java.util.*;
import java.io.*;

public class Player {

    //Player class basic information
    protected String position       ;
    protected String name           ;
    protected float  weight         ;
    protected int    age            ;

    public Player () {

        this.position = null        ;
        this.name     = null        ;
        this.weight   = 0.0f        ;
        this.age      = 0           ;
    }

    public Player ( String nPosition, String nName, float nWeight, int nAge ) {

        this.position = nPosition   ;
        this.name     = nName       ;
        this.weight   = nWeight     ;
        this.age      = nAge        ;
    }

    public static void main ( String [] args ) throws IOException {

        //Open scanner and playerinfo.txt file
        Scanner scan  = new Scanner ( new File ( "playerinfo.txt" ) ) ;

        ArrayList < Player > playerArrayList = new ArrayList < Player > () ;


        //Start scanning through playerinfo.txt file
        while ( scan.hasNextLine () )  {
            //Use numPlayers function to determine how many players are in the file
            for ( int i = 0; i < numPlayers () ; i ++ ) {

                Player player       = new Player     ()                        ;
                player.setPosition  ( scan.nextLine  () )                      ;
                player.setName      ( scan.nextLine  () )                      ;
                player.setWeight    ( Float.valueOf     (scan.nextLine  () ) ) ;
                player.setAge       ( Integer.valueOf   (scan.nextLine  () ) ) ;

            //    playerArrayList.add(player);

                switch ( player.getPosition () ) {
                    case "Quarterback":

                        Quarterback quarterback = new Quarterback ( player.getPosition () , player.getName ()   ,
                                                                    player.getWeight   () , player.getAge  () ) ;

                        //Get and save qb0 stats, all stats are saved as Integer
                        quarterback.setPassAttempts    ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the Passes Attempted
                        quarterback.setPassCompletions ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the Passes Completed
                        quarterback.setPassingYard     ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the Passing Yards
                        quarterback.setRushingYards    ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the Rushing Yards
                        quarterback.setRushingAttempts ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the Rushing Attempts
                        quarterback.setTouchdowns      ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the touchdowns
                        quarterback.setInterceptions   ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the Interceptions
                        quarterback.setFumbles         ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects the fumbles
                        quarterback.setSacks           ( Integer.valueOf ( scan.nextLine () ) ) ; //Collects sacks completed

                        playerArrayList.add ( quarterback ) ;
                        break;

                    case "Defense" :

                        DefensePlayer defensePlayer = new DefensePlayer ( player.getPosition () , player.getName ()   ,
                                                                          player.getWeight   () , player.getAge  () ) ;
                        //Save tackles as integer
                        defensePlayer.setTackles       ( Integer.valueOf ( scan.nextLine () ) ) ;
                        //Save sacks as float
                        defensePlayer.setSacks         ( Float.valueOf   ( scan.nextLine () ) ) ;
                        //Save interceptions as integer
                        defensePlayer.setInterceptions ( Integer.valueOf ( scan.nextLine () ) ) ;

                        //Add player to ArrayList
                        playerArrayList.add ( defensePlayer ) ;

                        break;

                    //Else for player types such as: Receivers,
                    default:
                        OtherPlayerTypes otherPlayerType = new OtherPlayerTypes ( player.getPosition () , player.getName ()   ,
                                                                                  player.getWeight   () , player.getAge  () ) ;

                        //Save and add receptions to player
                        otherPlayerType.setReceptions       ( Integer.valueOf ( scan.nextLine () ) ) ;
                        //Save and add receptions yards to player
                        otherPlayerType.setReceptionYards   ( Integer.valueOf ( scan.nextLine () ) ) ;
                        //Save and add rushes to player
                        otherPlayerType.setRushes           ( Integer.valueOf ( scan.nextLine () ) ) ;
                        //Save and add rushing yards to player
                        otherPlayerType.setRushingYards     ( Integer.valueOf ( scan.nextLine () ) ) ;
                        //Save and add touchdowns to player
                        otherPlayerType.setTouchdowns       ( Integer.valueOf ( scan.nextLine () ) ) ;
                        //Save and add fumbles to player
                        otherPlayerType.setFumbles          ( Integer.valueOf ( scan.nextLine () ) ) ;

                        //Add player to arrayList
                        playerArrayList.add( otherPlayerType );

                } //End of switch statement

            }//End of for loop

            //End of txt file, break out of loop
            break;


        } //; End of while loop

        //Close file scanner
        scan.close () ;


        //Print playersListArray
        for ( Player player : playerArrayList ) {
            System.out.println ( player ) ;
        }

    }

    //Function will calculate how many players are in the txt file
    public static int numPlayers () throws IOException {

        int tot_players = 0;

        try (Scanner scan = new Scanner(new File ("playerinfo.txt"))) {

            while (scan.hasNextLine()) {

                String strLine = scan.nextLine();
                if ( strLine.contains ( "Defense"   ) || strLine.contains ( "Quarterback"   )   ||
                     strLine.contains ( "Tight End" ) || strLine.contains ( "Running Back"  )   ||
                     strLine.contains ( "Receiver"  ) ) {
                    tot_players++;
                }
            }

        }
        //Catch for File scanner
        catch ( IOException e )  {
            e.printStackTrace () ;
        }
        //Return total players in file
        return tot_players;
    }


    //Getter and setters for Player

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
