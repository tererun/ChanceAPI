package run.tere.api.game;

public interface GameController {

    boolean isForward();
    boolean isBackward();
    boolean isLeft();
    boolean isRight();
    boolean isShift();
    boolean isSpace();
    boolean isLeftClick();
    boolean isRightClick();

}
