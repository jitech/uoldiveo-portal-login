package br.com.uoldiveo.portal.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uoldiveo.portal.login.domain.User;

@RestController
public class LoginRestController {

	@Autowired
    private LdapTemplate ldapTemplate;
	
	@RequestMapping(value="/login")
	public User login() {
		
		List<String> list = ldapTemplate.list("OU=Clientes");
		
		return new User("esc_jmelo@uoldiveo.com.br", "Jonas Goulart");
	}
}
