package com.gplenty.quiz.connection.PLENA;


/* 
 * Enumeração correspondente aos identificadores das mensagens do servidor para o cliente
 * e vice-versa
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
public enum ActionIdentifier {
	/*
	 * Cliente cancela a última ação que fez, ou retorna a um passo anterior em
	 * casos que não há continuação a partir do estado atual
	 * 
	 * O servidor deve voltar ao estado anterior ao que se encontra atualmente, ou o
	 * que seja pertinente
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	CANCEL_ACTION,
	/*
	 * Cliente deseja fazer o registro de um novo usuário
	 * 
	 * O servidor deve ficar preparado para receber a tentativa de cadastro do
	 * usuário
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REQUEST_REGISTER,
	
	/*
	 * Cliente deseja fazer login como um usuário já cadastrado no sistema
	 * 
	 * O servidor deve ficar preparado para receber a tentativa de login do
	 * usuário
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REQUEST_LOGIN,
	
	/*
	 * Cliente envia uma tentativa de cadastro com os dados do usuário que deseja
	 * adicionar ao sistema
	 * 
	 * O servidor deve interpretar a tentativa e verificar se é um usuário que pode
	 * ser cadastrado
	 * 
	 * O corpo da mensagem deve constituir as informações do usuário a cadastrar
	 */
	ATTEMPT_REGISTER,
	
	/*
	 * Cliente envia uma tentativa de login como usuário já cadastrado no sistema
	 * 
	 * O servidor deve validar essa tentativa
	 * 
	 * O corpo da mensagem constitui os dados de login do usuário
	 */
	ATTEMPT_LOGIN,
	
	/*
	 * Cliente deseja encerrar suas atividades como usuário logado
	 * 
	 * O servidor deve retirar o usuário cadastrado da sessão
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	LOGOUT,
	
	/*
	 * Professor solicita os quizzes postados por ele
	 * 
	 * O servidor deve enviar alguma identificação dos quizzes postados pelo
	 * professor
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	VIEW_POSTED_QUIZZES,
	
	/*
	 * Professor solicita as estatisticas de um quiz especifico postado por ele
	 * 
	 * O servidor deve enviar as informações sobre os alunos que responderam esse
	 * quiz e as suas respectivas notas
	 * 
	 * O corpo da mensagem deve constituir o quiz selecionado pelo professor
	 */
	VIEW_STATS_QUIZ,
	
	/*
	 * Professor informa que pretende postar um novo quiz
	 * 
	 * O servidor deve estar preparado para receber as perguntas e respostas
	 * relativas ao quiz que o professor está criando
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	MAKE_NEW_QUIZ,
	
	/*
	 * Professor informa que terminou o quiz que estava preparando e envia ao
	 * servidor para salvar
	 * 
	 * O servidor deve receber o quiz enviado e salvar no banco de dados
	 * 
	 * O corpo da mensagem constitui as informações do quiz e as perguntas que
	 * pertencem a ele
	 */
	POST_QUIZ,
	
	/*
	 * Aluno informa que deseja responder algum quiz
	 * 
	 * O servidor deve estar preparado para o aluno escolher um opção quanto ao quiz
	 * que irá fazer
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REQUEST_QUIZ_TO_ANSWER,
	
	/*
	 * Aluno informa que deseja responder o quiz recomendado pelo sistema
	 * 
	 * O servidor deve enviar o quiz recomendado
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REQUEST_RECOMMENDED_QUIZ,
	
	/*
	 * Aluno informa que deseja escolher um quiz dentre os que estão cadastrados no
	 * sistema
	 * 
	 * O servidor deve informar os quizzes disponíveis
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	REQUEST_QUIZ_LIST,
	
	/*
	 * Aluno escolhe o quiz que deseja responder dentre as opções fornecidas
	 * 
	 * O servidor deve enviar os dados de pergunta e resposta para o quiz ser
	 * respondido e corrigido
	 * 
	 * O corpo da mensagem constitui informações que identifiquem o quiz escolhido
	 * pelo aluno
	 */
	REQUEST_QUIZ,
	
	/*
	 * Aluno envia o resultado obtido no quiz após sua conclusão
	 * 
	 * O servidor deve receber os resultados enviados pelo aluno e salvá-los no
	 * banco de dados
	 * 
	 * O corpo da mensagem constiui as informações sobre como o aluno foi no quiz
	 * que acabou de responder
	 */
	ANSWER_QUIZ,
	
	/*
	 * Aluno informa que deseja visulizar as notas que teve em quizzes que respondeu
	 * 
	 * O servidor deve informar os dados dos quizzes respondidos pelo aluno
	 * 
	 * A mensagem não deve possuir corpo, apenas identificador
	 */
	VIEW_GRADES,
	
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
