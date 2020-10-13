package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 停止具体命令角色类
 *
 * @author Sky
 * @date 2020-10-13 14:35.
 */
public class StopCommand implements Command {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
