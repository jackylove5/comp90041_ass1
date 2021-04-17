
public class Square {
	public StringBuilder printing(int side_length, String print_char, String alignment, StringBuilder canvas, int width,int height) {
		if (alignment.equals("left")) {
			int start_pos = 0;
			int end_pos = 0;
			for(int i=1;i<side_length+1;i++) {
				end_pos = start_pos;
				/**side_length -=1;**/
				for(int j=side_length;j>0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i;
		}
		return canvas;
	}
		else if(alignment.equals("right")) {
			int start_pos = width - side_length;
			int end_pos = 0;
			int gap = width - side_length;
			for(int i=1;i<side_length+1;i++) {
				end_pos = start_pos;
				/**side_length -=1;**/
				for(int j=side_length;j>0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i+gap;
		
		}return canvas;
		}
		else if(alignment.equals("middle")) {
			int start_pos = (width - side_length)/2;
			int end_pos = 0;
			int gap = (width - side_length)/2;
			for(int i=1;i<side_length+1;i++) {
				end_pos = start_pos;
				/**side_length -=1;**/
				for(int j=side_length;j>0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i+gap;
		
		}return canvas;
	}
		else {
			return null;
		}
}
	
	
	public StringBuilder zoom (StringBuilder canvas, String alignment, String print_char, int side_length, int width, int height, String background_char, String zoom_com) {

		if(zoom_com.equals("I") ) {
			
			if (alignment.equals("left")){
    			int side_length_ = side_length;
				if (side_length_ < height && side_length_ < width) {
					int start_pos = side_length;
					for(int i=0; i<side_length; i++) {
						canvas.replace(start_pos, start_pos+1, print_char);
						start_pos = start_pos + width +1;
						}
					int start_pos_1 = side_length*(width+1);
					for(int j=0; j<side_length+1; j++) {
						canvas.replace(start_pos_1, start_pos_1+1, print_char);
						start_pos_1 = start_pos_1 +1;
						}
					System.out.println(canvas);
					side_length_ += 1;
					return canvas;
		}
				else {
					System.out.println(canvas);
					return canvas;
					}
				}
			
			
			else if(alignment.equals("right")) {
    			int side_length_ = side_length;
				if (side_length_ < height && side_length_ < width) {
					int start_pos = width - side_length - 1;
					for(int i=0; i<side_length; i++) {
						canvas.replace(start_pos, start_pos+1, print_char);
						start_pos = start_pos + width + 1;
						}
					int start_pos_1 = (width-side_length-1)+side_length*(width+1);
					for(int j=0; j<side_length+1; j++) {
						canvas.replace(start_pos_1, start_pos_1+1, print_char);
						start_pos_1 = start_pos_1 +1;
						}
					System.out.println(canvas);
					side_length_ += 1;
					return canvas;
		}
				else {
					System.out.println(canvas);
					return canvas;
					}
				
			}
			
			else if(alignment.equals("middle")) {
				int side_length_ = side_length;
				if (side_length_ < height && side_length_ < width) {
					int start_pos;
					if((width-side_length)%2!=0) {
						start_pos = width/2 + side_length/2;
					}
					else {
						start_pos = width/2 - side_length/2-1;
					}
					
					for(int i=0; i<side_length; i++) {
						canvas.replace(start_pos, start_pos+1, print_char);
						start_pos = start_pos + width + 1;
						}
					int start_pos_1;
					if((width-side_length)%2!=0) {
						start_pos_1 = width/2 - side_length/2-1 + side_length*(width+1);
					}
					else {
						start_pos_1 = width/2 - side_length/2-1 + side_length*(width+1);
					}
					for(int j=0; j<side_length+1; j++) {
						canvas.replace(start_pos_1, start_pos_1+1, print_char);
						start_pos_1 = start_pos_1 +1;
						}
					System.out.println(canvas);
					side_length_ += 1;
					return canvas;
			}
				else {
					System.out.println(canvas);
					return canvas;
					}
			}
			else {
				return null;
			}	

		
		}
		
		else if(zoom_com.equals("O")) {
			if (alignment.equals("left")){
    			int side_length_ = side_length;
				if (side_length_ >1 ) {
					int start_pos = side_length-1;
					for(int i=0; i<side_length; i++) {
						canvas.replace(start_pos, start_pos+1, background_char);
						start_pos = start_pos + width +1;
						}
					int start_pos_1 = (side_length-1)*(width+1);
					for(int j=0; j<side_length+1; j++) {
						canvas.replace(start_pos_1, start_pos_1+1, background_char);
						start_pos_1 = start_pos_1 +1;
						}
					System.out.println(canvas);
					side_length_ -= 1;
					return canvas;
		}
				else {
					System.out.println(canvas);
					return canvas;
					}
		}
			
			else if(alignment.equals("right")) {
    			int side_length_ = side_length;
				if (side_length_ >1) {
					int start_pos = width - side_length ;
					for(int i=0; i<side_length; i++) {
						canvas.replace(start_pos, start_pos+1, background_char);
						start_pos = start_pos + width + 1;
						}
					int start_pos_1 = (width-side_length-1)+(side_length-1)*(width+1);
					for(int j=0; j<side_length+1; j++) {
						canvas.replace(start_pos_1, start_pos_1+1, background_char);
						start_pos_1 = start_pos_1 +1;
						}
					System.out.println(canvas);
					side_length_ -= 1;
					return canvas;
		}
				else {
					System.out.println(canvas);
					return canvas;
					}
				
			}
			

			else if(alignment.equals("middle")) {
				int side_length_ = side_length;
				if (side_length_ >1) {
					int start_pos;
					if((width-side_length)%2!=0) {
						start_pos = width/2 - side_length/2-1;
					}
					else {
						start_pos = width/2 + side_length/2-1;
					}
					
					for(int i=0; i<side_length; i++) {
						canvas.replace(start_pos, start_pos+1, background_char);
						start_pos = start_pos + width + 1;
						}
					int start_pos_1;
					if((width-side_length)%2!=0) {
						start_pos_1 = width/2 - side_length/2-1 + (side_length-1)*(width+1);
					}
					else {
						start_pos_1 = width/2 - side_length/2-1 + (side_length-1)*(width+1);
					}
					for(int j=0; j<side_length+1; j++) {
						canvas.replace(start_pos_1, start_pos_1+1, background_char);
						start_pos_1 = start_pos_1 +1;
						}
					System.out.println(canvas);
					side_length_ -= 1;
					return canvas;
			}
				else {
					System.out.println(canvas);
					return canvas;
					}
			}
			
			else {
			return null;
}
		}
		else {
			return null;
}
	
}
	
}
