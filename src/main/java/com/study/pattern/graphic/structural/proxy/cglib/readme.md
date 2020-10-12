# Cglib动态代理

Cglib(Code Generation Library) 是个功能强大、高性能、开源的代码生成包，它可以为没有实现接口的类提供代理。具体而言，Cglib 继承被代理的类，覆写其业务方法来实现代理。因为采用继承机制，所以不能对 final 修饰的类进行代理。

Cglib 动态代理的特点如下：
- 需要引入 Cglib 的 jar 文件，但 Spring 的核心包内已包含 Cglib 功能，所以直接引入 spring-core-xxx.jar 即可。
- Cglib 动态代理虽然不需要接口信息，但是它拦截并包装被代理类的所有方法。
- 委托类不能为 final，否则报错 java.lang.IllegalArgumentException: Cannot subclass final class xxx。
- 不会拦截委托类中无法重载的 final/static 方法，而是跳过此类方法只代理其他方法。