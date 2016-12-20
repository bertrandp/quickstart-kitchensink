package fr.cpe.easypub.rest.impl;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import fr.cpe.easypub.auth.check.ICheckUserService;
import fr.cpe.easypub.model.User;
import fr.cpe.easypub.rest.IWatcherAuthService;

public class WatcherAuthService implements IWatcherAuthService {
	
	private static Logger log = Logger.getLogger(WatcherAuthService.class.getName());
	
	
	/*@Inject 
	MessageSenderLocal sender;
	
	@Inject
	MessageReceiverSyncLocal receiver;*/

	@Inject
	ICheckUserService checkUserService;
	
	@Override
	public User auth(User user) {

		log.info(user.toString());
		
		User userdb = checkUserService.getUserByLoginAndPassword(user.getLogin(), user.getPassword());
		
		/*sender.sendMessage(user);
		
		User userResp = receiver.receiveMessage();
		if(userResp == null){
			log.info("Failed authentication : wrong password or login");
			return null;
		}else{
			log.info("Receive resp user: " + userResp.toString());
			return userResp;
		}*/
		
		return null;
		
	}

	@Override
	public String echo() {
		return "echo";		
	}

	/*@Override
	public Response authCORS(User user) {
		
		log.info(user.toString());
		
		sender.sendMessage(user);
		
		User userResp = receiver.receiveMessage();
		if(userResp == null){
			log.info("Failed authentication : wrong password or login");
			return Response.status(200)
					.header("Access-Control-Allow-Origin", "*")
		            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
		            .header("Access-Control-Allow-Credentials", "true")
		            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
		            .header("Access-Control-Max-Age", "1209600")
					.build();
		}else{
			log.info("Receive resp user: " + userResp.toString());
			return Response.status(200)
					.header("Access-Control-Allow-Origin", "*")
		            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
		            .header("Access-Control-Allow-Credentials", "true")
		            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
		            .header("Access-Control-Max-Age", "1209600")
		            .entity(userResp)
					.build();
		}

	}*/

}
