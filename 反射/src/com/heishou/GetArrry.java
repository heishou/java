package com.heishou;

import java.lang.reflect.Array;

public class GetArrry {

	/**利用反射修改数组
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={1,2,3,4,5};
        Class<?> demo=arr.getClass().getComponentType();
        System.out.println(Array.getLength(arr));
        Array.set(arr, 0, 6);
        System.out.println(Array.get(arr, 0));
        //重新实例化一个数组
        Object newArray=Array.newInstance(arr.getClass().getComponentType(), 10);
        //并把原来的数组复制进新数组
        System.arraycopy(arr, 0, newArray, 0, Array.getLength(arr));
        System.out.println(Array.getLength(newArray));
        for (int i = 0; i < Array.getLength(newArray); i++) {
			System.out.println(Array.get(newArray, i));
		}
		System.out.println();
		
	}

}
