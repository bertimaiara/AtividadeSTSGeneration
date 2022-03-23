package com.generation.helloWord.controller;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping ("/hello-world") //mapeia as solicitações para metodos da classe controladora,
	//que no caso é a helloWord.controller

	public class HelloWorldController {
		@GetMapping //ele mapeia todas as requisições get feitas no http
		public String hello() {
			return "Hello World!";
		}
		@GetMapping("/bsm-0")
		public String bsm0() {
			return "BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades";	
		}
		@GetMapping("/bsm-1")
		public String bsm1() {
			return "BSM-1 - Mentalidade de Crescimento";	
		}
		@GetMapping("/bsm-2")
		public String bsm2() {
			return "BSM-2 - Persistência";	
		}
		@GetMapping("/bsm-3")
		public String bsm3() {
			return "BSM-3 - Responsabilidade Pessoal";	
		}
		@GetMapping("/bsm-4")
		public String bsm4() {
			return "BSM-4 - Orientação ao Futuro";	
		}
		@GetMapping("/bsm-5")
		public String bsm5() {
			return "BSM-5 - Comunicação";	
		}
		@GetMapping("/bsm-6")
		public String bsm6() {
			return "BSM-6 - Orientação ao Detalhe";	
		}
		@GetMapping("/bsm-7")
		public String bsm7() {
			return "BSM-7 - Proatividade";	
		}
		@GetMapping("/bsm-8")
		public String bsm8() {
			return "BSM-8 - Trabalho em equipe";	
		}
		@GetMapping("/bsm-9")
		public String bsm9() {
			return "BSM-9 - Dar e Receber";	
		}
		@GetMapping("/objetivo")
		public String objetivo() {
			return "Meus objetivos de aprendizagem para esta semana será me aperfeiçoar mais"
					+ " sobre STS, MySQL e também continuar estudando JAVA.";	
		}
}
