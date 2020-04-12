package com.retail.websocket.utils;

import java.net.URI;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import org.apache.log4j.Logger;


@ClientEndpoint
public class WebSocketClient {

		private static Logger log = Logger.getLogger(WebSocketClient.class);
		Session userSession = null;

	    public WebSocketClient(URI endpointURI) {
	        try {
	            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
	            container.connectToServer(this, endpointURI);
	        } catch (Exception e) {
	            log.error(e.getMessage());;
	        }
	    }

	    /**
	     * Callback hook for Connection open events.
	     *
	     * @param userSession the userSession which is opened.
	     */
	    @OnOpen
	    public void onOpen(Session userSession) {
	    	log.info("Connected to the WebSocket");
	        log.info("WebSocket Opened");
	        this.userSession = userSession;
	    }

	    /**
	     * Callback hook for Connection close events.
	     *
	     * @param userSession the userSession which is getting closed.
	     * @param reason the reason for connection close
	     */
	    @OnClose
	    public void onClose(Session userSession, CloseReason reason) {
	    	log.info("WebSocket Closed");
	        this.userSession = null;
	    }

	    /**
	     * Callback hook for Message Events. This method will be invoked when a client send a message.
	     *
	     * @param message The text message
	     */
	    @OnMessage
	    public String sendMessage(String message) {
	    	String text = "Hello !"+message;
	    	log.info(text);
	    	return text;
	    }
}
