
public class DrawingCanvas {
	
	StringBuilder background_char = new StringBuilder("");
	
	public StringBuilder canvas(int width,int height,String background){
		for(int i=0; i< height; i++) {
			for(int j=0; j<width; j++) {
				background_char.append(background);
			}
			background_char.append("\n");
		}
		return background_char;
	}
	
	public int Drawing_command() {
    	System.out.println("Please select an option. Type 4 to exit.");
    	System.out.println("1. Draw triangles");
    	System.out.println("2. Draw squares");
    	System.out.println("3. Update drawing canvas settings");
    	System.out.println("4. Exit");
    	
    	InnerScanner scanner_ = new InnerScanner();
    	int option_1 = scanner_.scanner_int();
    	
    	return option_1;
	}
	
	public StringBuilder Drawing(int command, StringBuilder canvas) {
		switch(command) {
		case 1:
			System.out.println("");
		}
		
		return canvas;
	}
}
