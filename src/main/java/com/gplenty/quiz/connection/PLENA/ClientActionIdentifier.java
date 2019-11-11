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
public enum ClientActionIdentifier 
{
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
	VIEW_GRADES
}