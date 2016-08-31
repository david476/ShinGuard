package shinguard.main.handlers;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import space.davidboles.lib.ht.tp.HandlerFs;
import space.davidboles.lib.program.ProgramFs;

public class DisplayHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange arg0) throws IOException {
		HandlerFs.respondFile(arg0, 200, ProgramFs.getProgramFile("web/display.html"));
		//*1.575
	}

}
