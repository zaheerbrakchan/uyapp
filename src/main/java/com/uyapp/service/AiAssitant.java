package com.uyapp.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface AiAssitant {

    @SystemMessage("{{systemMessage}}")
    @UserMessage("{{userMessage}}")
    String chat(@V("query") String query,@V("systemMessage") String systemMessage, @V("userMessage") String userMessage);
}
