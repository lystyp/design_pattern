package com.example.rp_chain.RpChain.Recu;


import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;
import com.example.rp_chain.RpChain.Recu.Handler.*;

public class FirstHandler extends BaseHandler {

    public FirstHandler() {
        LogHandler logHandler = new LogHandler();
        ApiKeyHandler apiKeyHandler = new ApiKeyHandler();
        UserTokenHandler userTokenHandler = new UserTokenHandler();
        DefaultHandler defaultHandler = new DefaultHandler();

        this.setNextHandler(logHandler);
        logHandler.setNextHandler(apiKeyHandler);
        apiKeyHandler.setNextHandler(userTokenHandler);
        userTokenHandler.setNextHandler(defaultHandler);
    }

    @Override
    public Response handleRequest(Request request) {
        return this.passToNextHandler(request);
    }


}
