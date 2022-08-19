package DecoratorDesignPattern;

public class ExtraMushroom extends ToppingDecorator{

    BasePizza basePizza;
    public ExtraMushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    public int cost(){
        return this.basePizza.cost()+15;
    }
}
