    public static void moveRobot(Robot robot, int toX, int toY) {
        rotateRobot(robot);
        if (robot.getX() < toX){
            robot.turnRight();
            while (robot.getX() != toX){
                robot.stepForward();
            }
        }
        if (robot.getX() > toX){
            robot.turnLeft();
            while (toX != robot.getX()){
                robot.stepForward();
            }
        }
        rotateRobot(robot);
        if (robot.getY() < toY){
            while (robot.getY() != toY ){
                robot.stepForward();
            }
        }
        if (robot.getY() > toY){
            robot.turnLeft();
            robot.turnLeft();
            while (robot.getY() != toY){
                robot.stepForward();
            }
        }
    }
    public static void rotateRobot (Robot robot){
        if (robot.getDirection() == Direction.DOWN){
            robot.turnLeft();
            robot.turnLeft();
        }
        else if (robot.getDirection() == Direction.LEFT){
            robot.turnRight();
        }
        else if (robot.getDirection() == Direction.RIGHT){
            robot.turnLeft();
        }
    }
