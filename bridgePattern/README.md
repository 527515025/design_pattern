## 桥接模式定义
桥接模式（Bridge Pattern），将抽象部分与它的实现部分分离，使它们都可以独立地变化。更容易理解的表述是：实现系统可从多种维度分类，桥接模式将各维度抽象出来，各维度独立变化，之后可通过聚合，将各维度组合起来，减少了各维度间的耦合。

## 不必要的继承导致类爆炸
汽车可按品牌分（本例中只考虑BMT，BenZ，Land Rover），也可按手动档、自动档、手自一体来分。如果对于每一种车都实现一个具体类，则一共要实现3*3=9个类。


对于每种组合都需要创建一个具体类，如果有N个维度，每个维度有M种变化，则需要MN个具体类，类非常多，并且非常多的重复功能。

如果某一维度，如Transmission多一种可能，比如手自一体档（AMT），则需要增加3个类，BMWAMT，BenZAMT，LandRoverAMT。

当把每个维度拆分开来，只需要M*N个类，并且由于每个维度独立变化，基本不会出现重复代码。此时如果增加手自一体档，只需要增加一个AMT类即可
