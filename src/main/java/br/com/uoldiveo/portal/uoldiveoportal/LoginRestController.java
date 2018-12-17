package br.com.uoldiveo.portal.uoldiveoportal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uoldiveo.portal.domain.User;

@RestController
public class LoginRestController {

	@RequestMapping(value="/login")
	public User login() {
		return new User("esc_jmelo@uoldiveo.com.br", "Jonas Goulart");
	}
}
