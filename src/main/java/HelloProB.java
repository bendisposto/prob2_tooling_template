import de.prob.Main;
import de.prob.scripting.Api;

public class HelloProB {

  private static Thread prob;

	public static void runProB(final Main m, final String[] args) {
		prob = new Thread(new Runnable() {
			public void run() {
				m.main(args);
			}
		});
    prob.start();

	}

	public static void main(String[] args) {

		Main m = Main.getInjector().getInstance(Main.class);
		//runProB(m, args);

		Api api = Main.getInjector().getInstance(Api.class);

		System.out.println("\n\n #### Fetching probcli");
	    api.upgrade("milestone-25");

		System.out.println("\n\n ####  ProB Binary Version: "+api.getVersion()+"\n\n");
    System.exit(0);
	}
}