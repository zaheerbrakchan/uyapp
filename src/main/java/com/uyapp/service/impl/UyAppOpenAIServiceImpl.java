package com.uyapp.service.impl;

import com.uyapp.constant.UyConstants;
import com.uyapp.service.AiAssitant;
import com.uyapp.service.UyAppOpenAIService;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.model.StreamingResponseHandler;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiStreamingChatModel;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.service.AiServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UyAppOpenAIServiceImpl implements UyAppOpenAIService {

    @Override
    public String chat(String query) {

        String response="";

        OpenAiChatModel openAiChatModel = OpenAiChatModel.builder()
                .apiKey("demo") // Please use your own OpenAI API key
                //.modelName(GPT_4_VISION_PREVIEW)
                .maxTokens(50)
                .build();

        OpenAiStreamingChatModel openAiStreamingChatModel = OpenAiStreamingChatModel.builder()
                .apiKey("demo").build();

        AiAssitant assistant = AiServices.create(AiAssitant.class, openAiChatModel);

       response= assistant.chat(query, UyConstants.SYSTEM_MESSAGE,UyConstants.USER_MESSAGE);


        return response;
    }
}
