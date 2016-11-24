package org.learntocodeseoul.calculator.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private Calculator calculator = new Calculator();

	@RequestMapping("/plus")
	public Response plus(@RequestParam String first, @RequestParam String second) {
		try {
			int firstInt = Integer.parseInt(first);
			int secondInt = Integer.parseInt(second);
			int sum = calculator.plus(firstInt, secondInt);
			return new Response("SUCESS", sum);
		} catch(Exception e) {
			return new Response("FAILURE", -1);
		}
	}

	@RequestMapping("/minus")
	public Response minus(@RequestParam String first, @RequestParam String second) {
		try {
			int firstInt = Integer.parseInt(first);
			int secondInt = Integer.parseInt(second);
			int sum = calculator.minus(firstInt, secondInt);
			return new Response("SUCESS", sum);
		} catch(Exception e) {
			return new Response("FAILURE", -1);
		}
	}

}