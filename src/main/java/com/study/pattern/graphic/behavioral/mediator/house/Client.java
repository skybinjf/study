package com.study.pattern.graphic.behavioral.mediator.house;

/**
 * 客户端测试类
 *
 * @author Sky
 * @date 2020-10-14 15:44.
 */
public class Client {

    public static void main(String[] args) {
        // 实例化房屋中介
        Mediator mediator = new HouseMediator();

        // 房东和租客
        Person landlordA = new LandlordPerson("房东李", mediator);
        Person landlordB = new LandlordPerson("房东林", mediator);
        Person renter = new RenterPerson("小A", mediator);

        // 房东注册中介
        mediator.registerLandlord(landlordA);
        mediator.registerLandlord(landlordB);

        // 租客注册中介
        mediator.registerRenter(renter);

        // 求租者发布求租信息
        renter.sendMessage("求在天河公园附近租套房子，价格 1000 元左右一个月");
        System.out.println("------------------------------");

        // 房东 A 发送房屋出租消息
        landlordA.sendMessage("天河公园学院站三巷27号四楼有一房一厅出租，1200/月，光线好，近公交站");
        // 房东 B 发送房屋出租消息
        landlordA.sendMessage("天河公园学院站三巷23号三楼有三房一厅出租，5600/月");
    }
}
