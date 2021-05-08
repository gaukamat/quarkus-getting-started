package com.examples.quarkus.getting.started;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingService {
	@ConfigProperty(name = "acme.greeting.service.locale", defaultValue = "en_US")
	private String locale;
	
	public GreetingService() {
		super();
	}

	public String greeting(String name) {
		if (locale.equals("hi_IN")) {
			return "\u0928\u092E\u0938\u094D\u0924\u0947 " + name;
		}
		else if(locale.equals("ja_JP")){
			return "\u30CF\u30ED " + name + " \u3055\u3093";
		}
		else {
			return "Hello " + name;
		}
	}
}
