public class maze {
    private final int size;

    public maze(int size, int dif) {
        this.size =size;
        Room[][] maze = new Room[size][size];

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                maze[row][column] = makeRoom(row, column);
            }
        }
    }

    private Room makeRoom(int x, int y) {
        int[] coords = new int[]{x, y};
        return new Room(coords);
    }


}
