package com.lexiong.absclass;

//A厂 - 生产模具+容器产品
class FactoryA extends Factory{

    @Override
    public AbstractProduct ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct ManufactureMould() {
        return new MouldProductA();
    }
}