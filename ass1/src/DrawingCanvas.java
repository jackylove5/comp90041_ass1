import java.util.Scanner;
public class DrawingCanvas {
	StringBuilder background_char = new StringBuilder("");
	Scanner scanner = new Scanner(System.in);
	public int check_side_length(int side_length, int width, int height) {
		if (side_length > width ||side_length >height) {
			System.out.println("Error! The side length is too long (Current canvas size is "+width+"*"+height+"). Please try again.");
			System.out.println("Side length:");
			int new_side_length = scanner.nextInt();
			return check_side_length(new_side_length, width, height);
			
	}
		else {
			return side_length;
			}
		}
	
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
    	
    	int option_1 = scanner.nextInt();
    	
    	return option_1;
	}
	
	public StringBuilder Drawing(int command, StringBuilder canvas, int width, int height, String back_char) {
		switch(command) {
		case 1:
			for(int i=0;i<9999;i++) {
				DrawingCanvas drawingcanvas = new DrawingCanvas();
				canvas = drawingcanvas.canvas(width, height, back_char);
				System.out.println("Side length:");
				int side_length = scanner.nextInt();
				Triangle triangle = new Triangle();
	    		int side_length_final = drawingcanvas.check_side_length(side_length, width, height);
	    		System.out.println("Printing character:");
	    		String print_char = scanner.next();
	    		System.out.println("Alignment (left, middle, right):");
	    		String alignment = scanner.next();
	    		StringBuilder triangle_printed = triangle.printing(side_length_final, print_char, alignment, canvas, width, height);
	    		int count = 10000;
	    		for (int j=0; j<9999;j++) {
		    		System.out.println("Type R/L to rotate clockwise/anti-clockwise. Use other keys to continue.");
		    		String rotation_com = scanner.next();	
		    		if(rotation_com.equals("R")) {
		    			count += 1;
		    		}
		    		else if(rotation_com.equals("L")) {
		    			count -= 1;
		    		}
		    		else {
		    			break;
		    		}
		    		triangle.rotation(canvas, alignment, print_char, side_length_final, width, height, back_char, count, rotation_com);
	    		}
	    		String renew_com_fin_1 = null;
	    		for(int g=0;g<9999;g++) {
	    			System.out.println("Draw anther triangle (Y/N)?");
	    			String renew_com = scanner.nextLine();	 
	    			if (renew_com.equals("Y")){
	    				renew_com_fin_1 = renew_com;
	    				break;
	    			}
	    			else if(renew_com.equals("N")) {
	    				renew_com_fin_1 = renew_com;
	    				break;
	    			}
	    			else {
	    				System.out.println("Unsupported option. Please try again!");
	    				continue;
	    			}
	    		}

	    		if(renew_com_fin_1.equals("Y")) {
	    			continue;
	    		}
	    		else if(renew_com_fin_1.equals("N")) {
	    			break;
	    		}
			}
			break;
			
		case 2:
			for(int i=0;i<9999;i++) {
				DrawingCanvas drawingcanvas = new DrawingCanvas();
				canvas = drawingcanvas.canvas(width, height, back_char);
				System.out.println("Side length");
	    		int side_length_square = scanner.nextInt();
	    		Square squ = new Square();
	    		int side_length_squ_final = drawingcanvas.check_side_length(side_length_square, width, height);
	    		System.out.println("Printing character:");
	    		String print_char_squ = scanner.next();
	    		System.out.println("Alignment (left, middle, right):");
	    		String alignment_squ = scanner.next();
	    		StringBuilder square = squ.printing(side_length_squ_final, print_char_squ, alignment_squ, canvas, width, height);
	    		System.out.println(square);
	    		String back_char_1 = back_char +"";
	    		int side_length_ = side_length_squ_final;
	    		for(int j=0;j<9999;j++) {
	    			System.out.println("Type I/O to zoom in/out. Use other key to continue.");
	    			String zoom_command = scanner.next();
	    			if(zoom_command.equals("I")) {
	    				squ.zoom(square, alignment_squ, print_char_squ, side_length_, width, height, back_char_1, zoom_command);
	    				if(side_length_<width && side_length_<height) {
	    					side_length_ += 1;
	    				}
	    				
	    			}
	    			else if(zoom_command.equals("O")) {
	    				squ.zoom(square, alignment_squ, print_char_squ, side_length_, width, height, back_char_1, zoom_command);
	    				if(side_length_>1) {
	    					side_length_ -= 1;
	    				}
	    				
	    			}
	    			else {
	    				break;
	    			}
	    			
	    		}
	    		
	    		String renew_com_fin = null;
	    		for(int g=0;g<9999;g++) {
	    			System.out.println("Draw anther triangle (Y/N)?");
	    			String renew_com = scanner.next();	 
	    			if (renew_com.equals("Y")){
	    				renew_com_fin = renew_com;
	    				break;
	    			}
	    			else if(renew_com.equals("N")) {
	    				renew_com_fin = renew_com;
	    				break;
	    			}
	    			else {
	    				System.out.println("Unsupported option. Please try again!");
	    				continue;
	    			}
	    		}

	    		if(renew_com_fin.equals("Y")) {
	    			continue;
	    		}
	    		else if(renew_com_fin.equals("N")) {
	    			break;
	    		}
	    		
			}
			break;
		case 3:
			break;
			
		case 4:
			break;
			
		}
		
		return canvas;
	}
	
	public int renew_width() {
		System.out.print("Canvas width: ");
		int width = scanner.nextInt();
		return width;
	}
	
	public int renew_height() {
		System.out.print("Canvas height: ");
		int height = scanner.nextInt();
		return height;
	}
	
	public String renew_back_char() {
		System.out.print("Background character: ");
		String back_char = scanner.next();
		return back_char;
	}
	
}
