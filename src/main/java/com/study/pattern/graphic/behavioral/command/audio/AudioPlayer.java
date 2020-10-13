package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 接收者角色，由录音机类扮演
 *
 * @author Sky
 * @date 2020-10-13 14:29.
 */
public class AudioPlayer {

    public void play() {
        System.out.println("播放……");
    }
    public void rewind() {
        System.out.println("倒带……");
    }
    public void stop() {
        System.out.println("停止……");
    }
}
