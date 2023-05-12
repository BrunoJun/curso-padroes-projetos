package mediator.exemplo1.translate;

import mediator.exemplo1.translate.mediator.Mediator;
import mediator.exemplo1.translate.mediator.TranstalorMediator;
import mediator.exemplo1.translate.model.EnglishUser;
import mediator.exemplo1.translate.model.PortugueseUser;
import mediator.exemplo1.translate.model.User;

public class Client {

	public static void main(String[] args) {

		Mediator chatRoom = new TranstalorMediator();
		
		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);
		
		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);
		
		alan.sendMessage("Hello");
		maria.sendMessage("Oi", alan);
		
		chatRoom.removeUser(sue);
		
		alan.sendMessage("How are you?", maria);
		maria.sendMessage("Estou bem, obrigado.", alan);
		
		chatRoom.addUser(jose);
		
		jose.sendMessage("Oi");
		
		chatRoom.removeUser(maria);
	}
	
}