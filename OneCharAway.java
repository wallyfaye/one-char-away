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
		int error_count = 0;
		for(int i = 0; i < short_str.length(); i++){
			char_val_array[short_str.charAt(i)]++;
		}
		for(int i = 0; i < long_str.length(); i++){
			char_val_array[long_str.charAt(i)]--;
			if(char_val_array[long_str.charAt(i)] < 0){
				error_count++;
			}
		}
		boolean exact_match = (short_str.length() == long_str.length()) && (error_count == 0);
		boolean close_match = (short_str.length() != long_str.length()) && (error_count <= 1);
		return exact_match || close_match;
	}

}
