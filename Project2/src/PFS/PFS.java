package PFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// this class is used to lauch the program and take the command lines
public class PFS {
	private void Parser () throws IOException {
		while (true) {
            System.out.print("PFS> ");
            //create a buffer to read the input
            BufferedReader tempBuffer = new BufferedReader(new InputStreamReader(System.in));
            //take user input
            String userInput = tempBuffer.readLine();
            //parse the input
            StringTokenizer commandTokens = new StringTokenizer(userInput, " ");
            //command
            String cmd1 = commandTokens.nextToken();
            //First argument
            String ip1 = null;
            //Second argument
            String ip2 = null;
            //Save argument 1
            if (commandTokens.hasMoreTokens())
                ip1 = commandTokens.nextToken();
            //Save argument 2
            if (commandTokens.hasMoreTokens())
                ip2 = commandTokens.nextToken();
            //if there are more arguments, this is error
            if (commandTokens.hasMoreTokens()) {
                System.out.println("Wrong cammand");
                continue;
            }
            validateCommands(cmd1, ip1, ip2);
		}
	}
	
	private void validateCommands(String cmd1, String ip1, String ip2) {
		// TODO Auto-generated method stub
		switch(cmd1) {
        	case "open":
                break;
            case "put":
            	break;
            case "get":
            	break;
            case "rm":
            	break;
            case "dir":
            	break;
            case "putr":
            	break;
            case "kill":
            	break;
            case "quit":
            	break;
            case "putc":
            	break;
            case "run":
            	break;
            default:
            	System.out.println("The command is not correct");
                break;





        		
		}
	}

	public static void main(String[] args) throws IOException {
		PFS newPFS = new PFS();
		newPFS.Parser();
	}
}
