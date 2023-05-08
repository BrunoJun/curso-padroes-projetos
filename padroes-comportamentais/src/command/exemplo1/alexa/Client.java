package command.exemplo1.alexa;

import command.exemplo1.alexa.alexa.Alexa;
import command.exemplo1.alexa.commands.TurnOffLight;
import command.exemplo1.alexa.commands.TurnOnLight;
import command.exemplo1.alexa.lights.PhillipsHueLight;
import command.exemplo1.alexa.lights.XiaomiLight;

public class Client {

	public static void configureAlexa(Alexa alexa) {
		PhillipsHueLight livingRoom = new PhillipsHueLight();
		XiaomiLight kitchen = new XiaomiLight();

		alexa.addIntegration("Turn on the Living room light", new TurnOnLight(livingRoom), "on", "Living room", "light");
		alexa.addIntegration("Turn off the Living room light", new TurnOffLight(livingRoom), "off", "Living room", "light");
		alexa.addIntegration("Turn on the Kitchen light", new TurnOnLight(kitchen), "on", "Kitchen", "light");
		alexa.addIntegration("Turn off the Kitchen light", new TurnOffLight(kitchen), "off", "Kitchen", "light");
	}

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configureAlexa(alexa);

		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");

		alexa.sendRequest("Please, could you Turn off the Living room light?");
	}
}
