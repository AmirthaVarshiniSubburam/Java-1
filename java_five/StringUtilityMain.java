package java_five;

public class StringUtilityMain {

	public static void main(String[] args) {
		StringUtility sUtil = new StringUtility();
		
		sUtil.sayHello();
		System.out.println(sUtil.getName());
		System.out.println(sUtil.getNameLength(sUtil.getName()));
		System.out.println(sUtil.getFirstLetter(sUtil.getName()));
//		System.out.println(sUtil.get);
		
	}
}
