# 加载图片

我们将创建一个 Image 接口和实现了 Image 接口的实体类。ProxyImage 是一个代理类，减少 RealImage 对象加载的内存占用。

ProxyPatternDemo，我们的演示类使用 ProxyImage 来获取要加载的 Image 对象，并按照需求进行显示。

### 步骤 1
创建一个接口：Image

### 步骤 2
创建实现接口的实体类：RealImage 和 ProxyImage 

### 步骤 3
当被请求时，使用 ProxyImage 来获取 RealImage 类的对象