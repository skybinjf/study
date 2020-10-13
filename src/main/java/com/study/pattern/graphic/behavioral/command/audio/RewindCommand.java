package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 倒带具体命令角色类
 *
 * @author Sky
 * @date 2020-10-13 14:34.
 */
public class RewindCommand implements Command {

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
