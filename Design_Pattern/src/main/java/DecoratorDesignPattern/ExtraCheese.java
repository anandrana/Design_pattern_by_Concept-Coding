package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    public int cost(){
       return this.basePizza.cost()+10;
    }
}
