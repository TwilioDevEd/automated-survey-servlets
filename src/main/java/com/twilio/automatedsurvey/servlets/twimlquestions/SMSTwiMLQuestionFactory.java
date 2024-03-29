package com.twilio.automatedsurvey.servlets.twimlquestions;

import com.twilio.automatedsurvey.survey.Question;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;
import com.twilio.twiml.MessagingResponse;

public class SMSTwiMLQuestionFactory extends AbstractTwiMLQuestionFactory {

    @Override
    public MessagingResponse build(Long surveyId, Question question) {
        return new MessagingResponse.Builder()
                .message(new Message.Builder()
                        .body(new Body.Builder(question.getBody()).build())
                        .build()
                )
                .build();
    }
}
