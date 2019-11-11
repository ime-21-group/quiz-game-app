package com.gplenty.quiz.connection.PLENA;


	/* 
	 * Enumeração correspondente aos identificadores das mensagens do servidor para o cliente
	 * 
	 * Esse Enum faz parte do Protocolo de Leitura e Envio de Novas Ações, 
	 * responsável por realizar as trocas de estado do sistema no servidor e no cliente
	 * 
	 * As mensagens do P.L.E.N.A. devem conter:
	 *  
	 *  um identificador (ServerActionIdentifier ou ClientActionIdentifier) 
	 *  que representa o input/output da máquina de estados do sistema;
	 *  
	 *  e um corpo, que contem os dados que devem ser transmitidos pelas partes em formato json
	 */
public enum ServerActionIdentifier 
{
	/*
	 * Servidor está aguardando o usuário realizar login ou cadastro
	 * 
	 * O cliente deve se encontrar na tela inicial do sistema após recebimento dessa
	 * mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas o identificador
	 */
	EXPECTING_OPTION_SELECT_NOT_AUTHED,
	
	/*
	 * Servidor está aguardando o usuário enviar um usuário e senha para cadastrá-lo
	 * 
	 * O cliente deve se encontrar na tela de cadastro após o recebimento dessa
	 * mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	EXPECTING_NEW_REGISTER,
	
	/*
	 * Servidor aceitou o cadastro enviado pelo cliente
	 * 
	 * O cliente deve se encontrar na tela inicial do sistema após receber essa
	 * mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REGISTER_ACCEPTED,
	
	/*
	 * Servidor não aceitou o cadastro enviado pelo cliente
	 * 
	 * O cliente deve se encontrar na tela inicial após receber essa mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REGISTER_NOT_ACCEPTED,
	
	/*
	 * Servidor aguardando informações de login do cliente
	 * 
	 * O cliente deve se encontrar na tela de login após receber essa mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	LOGIN_EXPECTED,
	
	/*
	 * Servidor reconheceu as informações enviadas pelo cliente como um aluno
	 * cadastrado no sistema
	 * 
	 * O cliente deve se encontrar na tela inicial de aluno após receber essa
	 * mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	LOGIN_ACCEPTED_STUDENT,
	
	/*
	 * Servidor reconheceu as informações enviadas pelo cliente como um professor
	 * cadastrado no sistema
	 * 
	 * O cliente deve se encontrar na tela inicial de professor após receber essa
	 * mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	LOGIN_ACCEPTED_TEACHER,
	
	/*
	 * Servidor não reconheceu as informações de login enviadas como um usuário
	 * cadastrado
	 * 
	 * O cliente deve se encontrar na tela de login após receber a mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	LOGIN_NOT_ACCEPTED,
	
	/*
	 * Servidor está aguardando o professor enviar o quiz com as perguntas criadas
	 * 
	 * O cliente deve se encontrar na tela de criação de quiz após receber essa
	 * mensagem
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	EXPECTING_NEW_QUIZ,
	
	/*
	 * Servidor está aguardando o professor selecionar um quiz dentre os que ele já
	 * fez para visualizar a estatistica
	 * 
	 * O cliente deve se encontrar na tela de seleção de quiz para ver estatistica
	 * após receber essa mensagem
	 * 
	 * O corpo da mensagem constitui informações dos quizzes feitos pelo professor
	 */
	EXPECTING_QUIZ_SELECT,
	
	/*
	 * Servidor enviou as informações dos alunos que já responderam o quiz
	 * solicitado pelo professor
	 * 
	 * O cliente deve se encontrar na tela de visualização das estatísticas dos
	 * alunos que já responderam o quiz selecionado após receber essa mensagem
	 * 
	 * O corpo da mensagem constitui informações dos alunos que já responderam o
	 * quiz e suas respectivas notas
	 */
	SELECTED_QUIZ_DATA,
	
	/*
	 * Servidor enviou as informações de notas do aluno nos quizzes que ele já
	 * respondeu
	 * 
	 * O cliente deve se encontrar na tela de visualização de suas notas após
	 * receber essa mensagem
	 * 
	 * O corpo da mensagem constitui informações dos quizzes que o aluno já fez e a
	 * respectiva nota que ele recebeu
	 */
	STUDENT_GRADES_DATA,
	
	/*
	 * Servidor está aguardando que o aluno escolha entre fazer o quiz recomendado
	 * ou escolher um quiz dentre todos os da base
	 * 
	 * O cliente deve se encontrar na tela intermediaria de escolha de um quiz para
	 * responder após receber essa mensagem
	 * 
	 * A mensagem não possui corpo, apenas identificador
	 */
	EXPECTING_QUIZ_OPTION_SELECT,

	/*
	 * Servidor está aguardando que o aluno escolha um quiz para resolver
	 * 
	 * O cliente deve se encontrar na tela de seleção de quiz após receber essa
	 * mensagem
	 * 
	 * O corpo da mensagem constitui os quizzes cadastrados no sistema
	 */
	EXPECTING_QUIZ_TO_ANSWER_SELECT,
	
	/*
	 * Servidor está esperando que o aluno conclua o quiz e envie o resultado obtido
	 * 
	 * O cliente deve se encontrar na tela de resolução do quiz após receber essa
	 * mensagem
	 * 
	 * O corpo da mensagem constitui o quiz que o aluno responderá, com as perguntas
	 * e as informações pertinentes para a resolução
	 */
	EXPECTING_ANSWERED_QUIZ
}
