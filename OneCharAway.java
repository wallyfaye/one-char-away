public class OneCharAway{
	public boolean res = true;
	public OneCharAway(String arg_1, String arg_2){
		int length_diff = arg_1.length() - arg_2.length();
		if(length_diff > 1 || length_diff < -1){
			res = false;
		}
	}

}
