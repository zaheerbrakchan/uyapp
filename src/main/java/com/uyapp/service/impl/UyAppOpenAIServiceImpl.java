package com.uyapp.service.impl;

import com.uyapp.service.AiAssitant;
import com.uyapp.service.UyAppOpenAIService;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.service.AiServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UyAppOpenAIServiceImpl implements UyAppOpenAIService {

    @Override
    public String chat(String query) {

        OpenAiChatModel openAiChatModel = OpenAiChatModel.builder()
                .apiKey("demo") // Please use your own OpenAI API key
                //.modelName(GPT_4_VISION_PREVIEW)
                .maxTokens(50)
                .build();

        AiAssitant assistant = AiServices.create(AiAssitant.class, openAiChatModel);

       String response= assistant.chat(query);
        return response;
    }
}
