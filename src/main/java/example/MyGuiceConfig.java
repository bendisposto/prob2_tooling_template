package example;

import com.google.inject.AbstractModule;

import de.prob.MainModule;

public class MyGuiceConfig extends AbstractModule {

	@Override
	protected void configure() {
		install(new MainModule()); // Install ProB 2.0 Injection bindings
	}

}
