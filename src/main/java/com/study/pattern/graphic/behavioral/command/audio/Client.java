package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 客户端类，由茱莉小女孩扮演
 *
 * @author Sky
 * @date 2020-10-13 14:42.
 */
public class Client {

    public static void main(String[] args) {
        // 创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        // 创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        // 创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        // 测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
        System.out.println("");

        // ---------- 宏命令 -------------
        // 创建宏命令对象
        MacroCommand macroCommand = new MacroAudioCommand();
        // 记录操作指令
        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);
        macroCommand.add(playCommand);
        macroCommand.add(stopCommand);
        // 执行宏命令
        macroCommand.execute();
    }
}
