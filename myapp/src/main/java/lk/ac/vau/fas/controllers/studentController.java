package lk.ac.vau.fas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class studentController {
	@GetMapping("/details")
	public String studentName() {
		return "Name: S.H.M.Nazik, Age: 23, Course: IT, Faculty: Applied Science";
	}
}
