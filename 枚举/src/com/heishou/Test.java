package com.heishou;

/**
 * 各种情况下的枚举
 * @author heishou
 *
 */
public class Test {
	/**
	 * 普通枚举
	 * @author heishou
	 *
	 */
    public enum Color{
    	red,white,blue;
    }
	
    /**
     * 带方法 枚举常量必须写在前面
     * @author heishou
     *
     */
    public enum Season{
    	spring,summer,autumn,winter;
    	private static final String position="test";
    	public static Season getSeason(){
    		if ("test".equals(position)) {
				return spring;
			} else {
                return summer;
			}
    	}
    }
	
	
    /**
     * 带构造参数的枚举
     * @author heishou
     *
     */
    public enum Gender{
    	man("man"),woman("woman");
    	private final String value;
    	Gender(String value){
    		this.value=value;
    	}
    	public String getValue(){
    		return value;
    	}
    }
    
    
    /**
     * 带抽象方法的枚举
     * @author heishou
     *
     */
    public enum OrderState{
    	/** 已取消 */
        CANCEL {public String getName(){return "已取消";}},
        /** 待审核 */
        WAITCONFIRM {public String getName(){return "待审核";}},
        /** 等待付款 */
        WAITPAYMENT {public String getName(){return "等待付款";}},
        /** 正在配货 */
        ADMEASUREPRODUCT {public String getName(){return "正在配货";}},
        /** 等待发货 */
        WAITDELIVER {public String getName(){return "等待发货";}},
        /** 已发货 */
        DELIVERED {public String getName(){return "已发货";}},
        /** 已收货 */
        RECEIVED {public String getName(){return "已收货";}};
        public abstract String getName();
    }
    
    
    
    
	
	public static void main(String[] args) {
		Color color=Color.blue;
		switch (color) {
		case red:
            System.out.println("color is red");
            break;
        case white:
            System.out.println("color is white");
            break;
        case blue:
            System.out.println("color is blue");
            break;
		}
		System.out.println("遍历枚举");
		for (Color color2 : Color.values()) {
			System.out.println(color2);
			//枚举的索引位置
			System.out.println(color2.ordinal());
		}
		System.out.println("枚举的数量:"+Color.values().length);
		//枚举默认实现了java.lang.Comparable接口
        System.out.println(color.red.compareTo(color.blue));
        
        //--------------------------
        System.out.println("===========");
        System.err.println("季节为" + Season.getSeason());
        
        
        //--------------
        System.out.println("===========");
        for(Gender gender : Gender.values()){
            System.out.println(gender.value);
        }
       
        //--------------
        System.out.println("===========");
        for(OrderState order : OrderState.values()){
            System.out.println(order.getName());
        }
	}

}
