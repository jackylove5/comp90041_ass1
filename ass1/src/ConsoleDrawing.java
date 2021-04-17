
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
    		builder = canvas.Drawing(option, builder, width, height, back_char_);
    		
    		if(option==3) {
    			DrawingCanvas renew = new DrawingCanvas();
    			width = renew.renew_width();
    			height = renew.renew_height();
    			back_char_ = renew.renew_back_char();
    			System.out.println("Drawing canvas has been updated!");
    			System.out.println("Current drawing canvas settings:");
    			System.out.println("- Width: "+width);
    			System.out.println("- Height: "+height);
    			System.out.println("- Background character: "+ back_char);
    			continue;
    			
    		}
    		
    		else if(option==4) {
    			System.out.println("Goodbye!");
    			break;
    		}
    		else {
    			System.out.println("Unsupported option. Please try again!");
    			continue;
    		}
    		
    	}
    		

    	
	}

}
