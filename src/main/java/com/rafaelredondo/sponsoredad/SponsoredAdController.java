package com.rafaelredondo.sponsoredad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelredondo.sponsoredad.response.Response;
import com.rafaelredondo.sponsoredad.schema.SponsoredKeyword;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SponsoredAdController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SponsoredAdController.class);
	

	@GetMapping(value = "/keywords")
	public ResponseEntity<Response<SponsoredKeyword>> listagemDeKeywords() {
		LOG.info("Buscando todas as keywords: {}");
		return null;
	}


}
