package com.inbev.tech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TechApplicationTests {

	@Test
	void contextLoads() {
	}

	Login l = new Login();
	CadastroProduto cp = new CadastroProduto();
	String ret;

	@Test
	void testLoginSucesso(){
		ret = l.login("Sucesso");
		Assertions.assertEquals("ok", ret);
	}
	@Test
	void testLoginFalha(){
		ret = l.login("Erro");
		/*verificar*/
		Assertions.assertNotEquals("ok", ret);
	}
	@Test
	void testCadastroProduto(){
		String ret = cp.cadastrar("cafe");
		Assertions.assertEquals("cadastrado", ret);
	}
	@Test
	void testErroCadastroProduto(){
		String ret = cp.cadastrar("erro");
		Assertions.assertNotEquals("cadastrado", ret);
	}
}
