package com.heishou;

import java.lang.reflect.Array;

public class GetArrry {

	/**修改数组
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={1,2,3,4,5};
        Class<?> demo=arr.getClass().getComponentType();
        System.out.println(Array.getLength(arr));
        Array.set(arr, 0, 6);
        System.out.println(Array.get(arr, 0));
        arrayin
	}

}
