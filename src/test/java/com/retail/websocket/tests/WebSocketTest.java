package com.retail.websocket.tests;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.retail.websocket.utils.WebSocketClient;

@Listeners(com.retail.webui.utils.TestListener.class)
public class WebSocketTest {
	
	private static Logger log = Logger.getLogger(WebSocketTest.class);
	private static final String URI = "ws://echo.websocket.org:80/";
	
	static {
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@Test
	public void testWebsocketClient() {		
		try {
	        
			log.info("Connecting to the WebSocket endpoint : "+URI);
	        final WebSocketClient clientEndPoint = new WebSocketClient(new URI(URI));
	        
	        // Send message to Websocket
	        String actText = clientEndPoint.sendMessage(" How can i help you?");
	        Assert.assertEquals("Hello ! How can i help you?", actText);

	    } catch (URISyntaxException e) {
	    	log.error(e.getMessage());
	    }
	}
}
