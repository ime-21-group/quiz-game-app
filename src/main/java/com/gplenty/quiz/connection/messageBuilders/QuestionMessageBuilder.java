package com.gplenty.quiz.connection.messageBuilders;

import com.gplenty.quiz.domain.Question;

public class QuestionMessageBuilder {
	public static String build(Question question)
	{
		String header = question.getHeader();
		String correctAnswer = question.getCorrectAnswer();
		String index = question.getIndex().toString();
		return "{index:" + index + ";header:" + header + ";correctAnswer:" + correctAnswer + "}";
	}
}
