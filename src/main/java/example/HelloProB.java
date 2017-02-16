package example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Stage;

import de.be4.classicalb.core.parser.exceptions.BException;
import de.prob.animator.domainobjects.AbstractEvalResult;
import de.prob.animator.domainobjects.ClassicalB;
import de.prob.animator.domainobjects.IEvalElement;
import de.prob.scripting.Api;
import de.prob.statespace.State;
import de.prob.statespace.StateSpace;
import de.prob.statespace.Trace;
import de.prob.statespace.Transition;

public class HelloProB {

	private static Injector INJECTOR = Guice.createInjector(Stage.PRODUCTION, new MyGuiceConfig());
	private Api api;

	@Inject
	public HelloProB(Api api) {
		this.api = api;
	}

	public void exampleUsage() throws Exception {
		System.out.println("ProB version: " + api.getVersion());
		System.out.println();
		System.out.println("Load classical B Machine");


/*
		Path path = Paths.get(getClass().getResource("/ACounter.mch").toURI());
		StateSpace stateSpace = api.b_load(path.toAbsolutePath().toString());

		// Define some expressions of iterest
		ClassicalB jj = new ClassicalB("jj");
		ClassicalB sum = new ClassicalB("jj + ii");
		// Register the expressions for evaluation
		stateSpace.subscribe(this, jj);
		stateSpace.subscribe(this, sum);

		// A trace is a path throughout a state space
		System.out.println("Construct Trace");
		System.out.println();

		Trace t = new Trace(stateSpace);
		// Execute a couple of random steps

		for (int i = 0; i < 10; i++) {
			t = t.anyEvent(null);
		}

		System.out.println("Some human readable representation of a trace");
		System.out.println(t);
		System.out.println();

		// Fetch the last state
		State state = t.getCurrentState();

		// Print the values of registered fomulas. Variables are automatically
		// registered, but you need the ClassicalB object that represents them
		// if you want to fetch a particular variable from the map.
		// The simplest way is to just register the variable as we did above

		// print them all
		Map<IEvalElement, AbstractEvalResult> values = state.getValues();
		Set<Entry<IEvalElement, AbstractEvalResult>> entrySet = values.entrySet();
		for (Entry<IEvalElement, AbstractEvalResult> entry : entrySet) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println();
		System.out.println("The value of ii+jj is " + values.get(sum) + ". The value of jj is " + values.get(jj));
		System.out.println();

		List<Transition> operations = state.getOutTransitions();

		System.out.println("There are " + operations.size() + " operations enabled.");
		for (Transition transition : operations) {
			System.out.println(transition.getPrettyRep());
		}
		System.out.println();
*/
		System.out.println("Load Event B Machine");

        Path path2 = Paths.get(getClass().getResource("/Lift/lift0.bcm").toURI());
		StateSpace stateSpace2 = api.eventb_load(path2.toAbsolutePath().toString());

		System.out.println("Construct Trace");
		System.out.println();

		Trace t2 = new Trace(stateSpace2);

		for (int i = 0; i < 10; i++) {
			t2 = t2.anyEvent(null);
		}

		System.out.println("Some human readable representation of a trace");
		System.out.println(t2);
		System.out.println();
	}

	public static void main(String[] args) throws Exception {

		HelloProB m = INJECTOR.getInstance(HelloProB.class);
		m.exampleUsage();
		System.exit(0);
	}
}