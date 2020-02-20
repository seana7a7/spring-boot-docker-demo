package net.seanharrison.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.seanharrison.dockerdemo.domain.Animal;

@RestController
public class AnimalController {

	@GetMapping(value = "/", produces="application/json")
	public Animal index() {
		return new Animal("Blue Whale", "Mammal");
	}

}