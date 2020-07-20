class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            Enum<Direction> direction = robot.getDirection();
            if (Direction.RIGHT.equals(direction)) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (Direction.UP.equals(direction)) {
                robot.turnLeft();
            } else if (Direction.DOWN.equals(direction)) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            Enum<Direction> direction = robot.getDirection();
            if (Direction.LEFT.equals(direction)) {
                robot.turnRight();
                robot.turnRight();
            } else if (Direction.UP.equals(direction)) {
                robot.turnRight();
            } else if (Direction.DOWN.equals(direction)) {
                robot.turnLeft();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            Enum<Direction> direction = robot.getDirection();
            if (Direction.UP.equals(direction)) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (Direction.LEFT.equals(direction)) {
                robot.turnLeft();
            } else if (Direction.RIGHT.equals(direction)) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
               robot.stepForward();
           }
        } else if (robot.getY() < toY) {
            Enum<Direction> direction = robot.getDirection();
            if (Direction.DOWN.equals(direction)) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (Direction.RIGHT.equals(direction)) {
                robot.turnLeft();
            } else if (Direction.LEFT.equals(direction)) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }

        }


}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}