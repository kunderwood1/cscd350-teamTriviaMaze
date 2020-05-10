public class mazebuilder {

    public maze newMaze(int choice) {
        if(choice == 1){
            return new maze(5,choice);
        }else if(choice == 2){
            return new maze(5,choice);
        }else if(choice == 3){
            return new maze(5,choice);
        }else{
            System.out.println("You should not have gotten here...");
            System.out.println("returning the easy mode since you cant follow directions.");
            return new maze(5,1);
        }
    }
}
