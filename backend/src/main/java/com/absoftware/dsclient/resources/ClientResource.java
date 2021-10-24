package com.absoftware.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absoftware.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "405.788.125-89", 1200.3, Instant.now(), 2 ));
		list.add(new Client(2L, "Augusto", "455.338.135-89", 1500.5, Instant.now(), 1 ));
		return ResponseEntity.ok().body(list);
	}

}
