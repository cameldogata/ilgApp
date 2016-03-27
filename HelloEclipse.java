/**
 * 
 */

/**
 * @author cmadmin
 *
 */
public class HelloEclipse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sMe = args.length <= 0 ? "Hi there " : args[0] ;
		System.out.println("Num args: " + args.length);
		System.out.println(sMe+"hello World from Cataldo !"); 
		
		for (String s: args) {
			System.out.println("Arguments are: " + s);

	}
  }
}
