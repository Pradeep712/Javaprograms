public class Only3char{
public static void funny(String str){
		if(str.length()%3==0){
			only3(str);
		} else {
			System.out.println(str);
		}
		
	}
	
public static void only3(String str){
		for(int i = 0; i<str.length(); i++){
			if((i+1)%3==0)
				System.out.print(str.charAt(i));				
		}
			
	}
}

