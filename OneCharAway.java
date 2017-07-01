public class OneCharAway{

	public boolean res = true;
	private int[] char_val_array = new int[512];

	public OneCharAway(String arg_1, String arg_2){
		int length_diff = arg_1.length() - arg_2.length();

		if(length_diff == 1){
			res = this.testStrings(arg_2, arg_1);
		} else if (length_diff == -1){
			res = this.testStrings(arg_2, arg_1);
		} else if (length_diff == 0){
			System.out.println(0);
		} else {
			res = false;
		}

	}

	private boolean testStrings(String short_str, String long_str){
		System.out.println(short_str);
		System.out.println(long_str);
		
		return false;
	}

}
