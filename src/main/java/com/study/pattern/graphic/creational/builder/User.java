package com.study.pattern.graphic.creational.builder;

/**
 * Builder 模式，链式调用 Demo
 *
 * @author Sky
 * @date 2019-12-06 16:31.
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    /**
     * 私用构造方法，不让外部创建 User 对象
     */
    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    /**
     * 内部静态类，实现链式调用
     */
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        /**
         * 创建 User 对象
         */
        public User build() {
            User user = new User(this);
            if (user.getAge() < 0 || user.getAge() > 100) {
                throw new IllegalStateException("Age out of range: " + user.getAge());
            }
            return user;
        }

        /**
         * 测试
         * @param args
         */
        public static void main(String[] args) {
            User sky = new User.UserBuilder("Sky", "Bin").setAge(23).setPhone("15659820000").setAddress("深圳市南山区").build();
            System.out.println(sky.toString());
        }
    }

    /** --------------- begin User 的 getter, setter and toString --------------- */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    /** --------------- end User 的 getter, setter and toString --------------- */
}
