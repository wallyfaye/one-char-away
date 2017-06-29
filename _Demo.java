class _Demo {
	public static void main(String[] args){
		if (args.length < 2){
			System.out.println("Please specify two  strings to test");
			System.exit(0);
		}
		OneCharAway str1 = new OneCharAway(args[0], args[1]);
		String result = new Boolean(str1.res).toString();
		System.out.println("The result of \"" + args[0] + "\" \"" + args[1] + "\" is: " + result);
	}
}
