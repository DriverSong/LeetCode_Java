package leetcode;

class Reverse_Integer {
    public static int reverse(int x){
    	//判断是否溢出
    	if(x<-Math.pow(2,31 )&& x > (Math.pow(2,31 ) - 1 )){
    		return 0;
    	}
    	try {
	    	//输出
	    	long reverse_x = 0;
//	    	//int转stringBuffer
//	        StringBuffer buffer = new StringBuffer();
//	        //判断正负
//	        boolean IsPositive = true ;
//	    	if(x < 0) {
//	    		IsPositive = false;
//	    		//取模
//	    		x = - x;
//	    	}
//	    	System.out.println(x);
	    	//从个位开始读取
	        while(true) {
	        	int temp = x%10;
//	        	System.out.println(temp);
	        	reverse_x = reverse_x*10 + temp;
//	        	System.out.println(reverse_x);
	        	if(x/10 != 0) {
	        		x = (x - temp)/10;
	        	}else {
					break;
				}
	        }
	        //StringBuffer转String转int
//	        System.out.println(buffer);
//	        long temp_x = Long.parseLong(buffer.toString());
//	        System.out.println(temp_x);
//	        if(IsPositive == false) {
//	        	temp_x = -temp_x;
//	        }
	        //判断输出是否溢出
	        if(reverse_x>=-Math.pow(2,31 )&& reverse_x <= (Math.pow(2,31 ) - 1 )){
	        		return (int)reverse_x;
	        }else {
	        	return 0;
	        }
    	}catch (Exception e) {
    		return 0;
		}
    }
    public static void main(String[] arg){
    	int a = reverse(-2147483648);
//    	int a = reverse(123);
    	System.out.println(a);
    }
}