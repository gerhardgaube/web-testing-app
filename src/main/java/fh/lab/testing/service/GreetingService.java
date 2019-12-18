package fh.lab.testing.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Hello from greeting service";
	}
}
