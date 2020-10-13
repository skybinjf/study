package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 请求者角色，由键盘类扮演
 *
 * @author Sky
 * @date 2020-10-13 14:37.
 */
public class Keypad {

    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }
    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }
    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play() {
        playCommand.execute();
    }
    public void rewind() {
        rewindCommand.execute();
    }
    public void stop() {
        stopCommand.execute();
    }

}
