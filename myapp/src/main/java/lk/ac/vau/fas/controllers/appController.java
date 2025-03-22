package lk.ac.vau.fas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class appController {
	@GetMapping("/msg")
	public String printMessage() {
		return "Hello SpringBoot";
	}
}
