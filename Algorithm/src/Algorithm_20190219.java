
public class Algorithm_20190219 {
		  public String solution(int n) {
			  
			  String answer = "";
			  for(int i = 0; i < n; i++) {
				  answer+=(i%2==1)? "박":"수";
			  }
		      return answer;
		  }
}