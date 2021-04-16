
public class ConsoleDrawing {

	public static void main(String[] args) {
    	int width = Integer.parseInt(args[0]);
    	int height = Integer.parseInt(args[1]);
    	char back_char = args[2].charAt(0);
    	String back_char_ = back_char+"";

    	
    	System.out.println("----WELCOME TO MY CONSOLE DRAWING APP----");
    	System.out.println("Current drawing canvas settings:");
    	System.out.println("- Width: " + width);
    	System.out.println("- Height: " + height);
    	System.out.println("- Background character: " + back_char_);    	
    	System.out.println();
    	
    	DrawingCanvas canvas = new DrawingCanvas();
    	StringBuilder builder = canvas.canvas(width, height, back_char_);
    	
    	
    	for(int i=0;i<9999;i++) {
    		int option = canvas.Drawing_command();
    		break;
    	}
    		

    	
	}

}
