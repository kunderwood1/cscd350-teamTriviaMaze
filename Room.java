public class Room {
    private boolean hasExit = false;
    private boolean hasEntrance = false;
    private boolean visited = false;
    private int[] coordinates;

    public Room(int[] coords) {
        setCoordinates(coords);
    }

    private void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }


    public boolean getHasExit() {
        return hasExit;
    }


    public boolean getHasEntrance() {
        return hasEntrance;
    }


    public void isVisited() {
        this.visited = true;
    }


    public boolean getVisited() {
        return visited;
    }


    private char whatIsInRoom() {
        boolean[] arr = {getHasExit()};
        int numOfTrue = 0;
        for (boolean b : arr) {
            if (b)
                numOfTrue++;
        }//end for
        if (numOfTrue == 1) {
            if (getHasExit())
                return 'O';
            else if (getHasEntrance())
                return 'I';
        }
        return ' ';
    }
    @Override
    public String toString() {
        isVisited(); //can only be drawn if it was visited.
        char c = whatIsInRoom();

        //Needs work when drawing out the room info.
        if (this.coordinates[1] == 0) { //left side
            if (this.coordinates[0] == 0) {
                return "***%*" + c + "|%*-*"; //upper corner
            }//end if
            else if (this.coordinates[0] == 4) {//lower corner
                return "*-*%*" + c + "|%***";
            }else {
                return "*-*%*" + c + "|%*-*"; //West walls
            }//end if

        } else if (this.coordinates[1] == 4) { //right side
            if (this.coordinates[0] == 0) {
                return "***%|" + c + "*%*-*"; //upper corner
            }else if (this.coordinates[0] == 4) { //lower corner
                return "*-*%|" + c + "*%***";
            }else {
                return "*-*%|" + c + "*%*-*"; //East Wall
            }
        } else {
            if (this.coordinates[0] == 0) {//North Wall
                return "***%|" + c + "|%*-*";
            }else if (this.coordinates[0] == 4) {//South Wall
                return "*-*%|" + c + "|%***";
            }else {
                return "*-*%|" + c + "|%*-*"; //base room
            }
        }
    }
}
