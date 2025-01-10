import java.util.*;

class Solution {
    class Location{
        Position position;
        int step;

        Location(Position position, int step) {
            this.position = position;
            this.step = step;
        }

        Location left() {
            Position leftPosition = new Position(this.position.x - 1, this.position.y);
            return new Location(leftPosition, this.step + 1);
        }
        Location right() {
            Position rightPosition = new Position(this.position.x + 1, this.position.y);
            return new Location(rightPosition, this.step + 1);
        }
        Location up() {
            Position upPosition = new Position(this.position.x, this.position.y - 1);
            return new Location(upPosition, this.step + 1);
        }
        Location down() {
            Position downPosition = new Position(this.position.x, this.position.y + 1);
            return new Location(downPosition, this.step + 1);
        }
    }

    class Position {
        int x;
        int y;
        int step;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
        public int solution(int[][] maps) {
            boolean[][] visited = new boolean[maps.length][maps[0].length];
            Queue<Location> queue = new LinkedList<>();
            Position position = new Position(0, 0);
            queue.offer(new Location(position, 1));

            while (!queue.isEmpty()) {
                Location l = queue.poll();
                int x = l.position.x;
                int y = l.position.y;
                if (l.position.x == maps.length - 1 && l.position.y == maps[0].length - 1) {
                    return l.step;
                }
                if (x >= 0 && x < maps.length && y >= 0 && y < maps[0].length &&
                        !visited[x][y] && maps[x][y] == 1) {
                    visited[x][y] = true;
                    queue.offer(l.left());
                    queue.offer(l.right());
                    queue.offer(l.up());
                    queue.offer(l.down());
                }
            }
            return -1;
        }

}
