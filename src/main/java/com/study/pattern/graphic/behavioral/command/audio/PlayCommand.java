package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 播放具体命令角色类
 *
 * @author Sky
 * @date 2020-10-13 14:32.
 */
public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
