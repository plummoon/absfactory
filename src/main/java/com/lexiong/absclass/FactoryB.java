package com.lexiong.absclass;


//B厂 - 生产模具+容器产品
class FactoryB extends Factory{

    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductB();
    }
}
