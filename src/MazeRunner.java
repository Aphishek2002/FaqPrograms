import java.util.*;

class MazeNode {
    int x, y, distance, num2;

    public MazeNode(int x, int y, int distance, int num2) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.num2 = num2;
    }
}

public class MazeRunner {
    public static int shortestPath(int[][] maze, int[] start, int[] end) {
        int rows = maze.length;
        int cols = maze[0].length;

        boolean[][] visited = new boolean[rows][cols];
        Queue<MazeNode> queue = new LinkedList<>();

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        queue.add(new MazeNode(start[0], start[1], 0, 0));
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            MazeNode current = queue.poll();

            if (current.x == end[0] && current.y == end[1]) {
                return current.distance;
            }

            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols &&
                        maze[newX][newY] != 1 && !visited[newX][newY] &&
                        (maze[newX][newY] != 3 || (newX == end[0] && newY == end[1])) &&
                        (maze[newX][newY] != 2 || current.num2 < 1)) {

                    int newNum2 = current.num2 + (maze[newX][newY] == 2 ? 1 : 0);
                    queue.add(new MazeNode(newX, newY, current.distance + 1, newNum2));
                    visited[newX][newY] = true;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // move to the next line after reading cols

        int[][] maze = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] rowValues = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                maze[i][j] = Integer.parseInt(rowValues[j]);
            }
        }

        int[] start = {scanner.nextInt(), scanner.nextInt()};
        int[] end = {scanner.nextInt(), scanner.nextInt()};

        int result = shortestPath(maze, start, end);
        if (result == -1) {
            System.out.println("STUCK");
        } else {
            System.out.println(result);
        }
    }
}
