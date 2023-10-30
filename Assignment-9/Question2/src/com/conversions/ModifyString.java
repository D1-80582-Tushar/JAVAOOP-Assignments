package com.conversions;

public class ModifyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		2. Write methods to perform following string conversions.
        //		Bank Of Maharashtra --> BOM
        //		this is string --> This Is String
        //		Example --> eXaMpLe
        //		www.sunbeaminfo.com --> www.sunbeaminfo.in
		
//		String input = new String("Bank Of Maharashtra");
//		String result = new String("");
//		String[] output = input.split(" ");
//		
//		for(int i=0;i<output.length;i++) {
//			System.out.println(output[i]);
//			result  = result.concat(output[i].substring(0,1));// must store the new refernce otherwise it won't reflect
//		}		
//		
//		System.out.println(result);
		
		  //		this is string --> This Is String
//		String input = new String("This is String");
//		String result = new String("");
//		String[] output = input.split(" ");
//		for(int i=0;i<output.length;i++) {
//			result += output[i].substring(0,1).toUpperCase()+output[i].substring(1)+" ";// must store the new refernce otherwise it won't reflect
//		}		
//		System.out.println(result);
	
        //		Example --> eXaMpLe
		String input = new String("Example");
		
	    
        StringBuilder alternatingCase = new StringBuilder();
        char[] arr = input.toCharArray();
        for (int i=0;i<arr.length;i++) {
            if (i%2==0) {
                alternatingCase.append(Character.toLowerCase(arr[i]));
            } else {
                alternatingCase.append(Character.toUpperCase(arr[i]));
            }
        }

		System.out.println(alternatingCase);
		
        //		www.sunbeaminfo.com --> www.sunbeaminfo.in
		String input1 = new String("www.sunbeaminfo.com");
		String result = new String("");
	    result  = input1.replace(".com", ".in");
		System.out.println(result);
		
	}

}
