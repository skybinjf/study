package com.study.pattern.graphic.behavioral.mediator.house;

/**
 * 具体中介者类：房屋中介
 *
 * @author Sky
 * @date 2020-10-14 15:38.
 */
public class HouseMediator extends Mediator {

    @Override
    void operation(Person person, String message) {
        if (person instanceof RenterPerson) {
            // 将租屋的需求消息传递给注册了的房东们
            for (Person landlord : landlordList) {
                landlord.getMessage(message);
            }
        } else if (person instanceof LandlordPerson) {
            // 将房东的出租房消息传递给 注册了的 房屋求租者们
            for(Person renter : renterList){
                renter.getMessage(message);
            }

        }
    }
}
