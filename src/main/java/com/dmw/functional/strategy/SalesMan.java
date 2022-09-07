package com.dmw.functional.strategy;

public class SalesMan {
    //持有抽象策略角色的引用                              
    private Strategy strategy;                 
                                               
    public SalesMan(Strategy strategy) {       
        this.strategy = strategy;              
    }                                          
                                               
    //向客户展示促销活动                                
    public void salesManShow(){                
        strategy.show();                       
    }

    public static void main(String[] args) {
        SalesMan salesMan =new SalesMan(new StrategyC());
        salesMan.salesManShow();
    }
}            