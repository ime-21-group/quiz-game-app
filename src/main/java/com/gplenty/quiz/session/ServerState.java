package com.gplenty.quiz.session;

public enum ServerState 
{
	/* 
	 * Usuário está na tela inicial do sistema 
	 * não se encontra autenticado ainda
	 * 
	 * o sistema espera um escolha entre login e cadastro
	 */
	NOT_AUTHED,
	
	/* 
	 * Usuário escolhe fazer cadastro de um novo usuário 
	 * 
	 * o sistema espera um valor de usuário e senha 
	 */
	SIGN_IN,
	
	/* 
	 * Usuário escolhe fazer login 
	 * 
	 * o sistema espera um valor de usuário e senha para validar 
	 */
	LOGIN,
	
	/* 
	 * Usuário autenticado como aluno 
	 * 
	 * o sistema espera que o usuário escolha uma ação referente a aluno 
	 */
	START_PAGE_STUDENT,
	
	/* 
	 * Aluno deseja responder um quiz 
	 * 
	 * o sistema espera que ele escolha fazer o quiz indicado 
	 * ou escolher entre os disponiveis 
	 */
	PRE_QUIZ_SELECT,
	
	/* Aluno está escolhendo um quiz para responder 
	 * o sistema espera que seja selecionado um quiz válido
	 */
	QUIZ_SELECT,
	
	/* 
	 * Aluno está respondendo um quiz 
	 * 
	 * o sistema espera que seja enviado o resultado do quiz respondido
	 */
	QUIZ_ANSWER,
	
	/* 
	 * Aluno está vendo suas notas em quizzes anteriores 
	 * 
	 * o sistema espera até que o aluno queira voltar para sua tela inicial
	 */
	VIEW_GRADES,
	
	/* 
	 * Usuário autenticado como professor 
	 * 
	 * o sistema espera que o usuário escolha um ação referente a professor
	 */
	START_PAGE_TEACHER,
	
	/* 
	 * Professor deseja criar um novo quiz 
	 * 
	 * o sistema espera que seja enviado uma lista de perguntas com suas respectivas respostas
	 */
	POST_QUIZ,
	
	/*
	 * Professor deseja ver uma lista dos quizzes que já fez
	 * 
	 * o sistema espera que o professor escolha um quiz especifico para enviar as
	 * notas
	 */ 
	VIEW_POSTED_QUIZ_LIST,
	
	/*
	 * Professor está vendo as notas dos alunos que já responderam um quiz dele
	 * específico
	 * 
	 * o sistema espera até que o professor queira voltar para sua tela inicial
	 */
	VIEW_QUIZ_STATS
}
