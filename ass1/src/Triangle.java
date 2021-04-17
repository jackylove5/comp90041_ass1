
public class Triangle {

	
	public StringBuilder printing(int side_length, String print_char, String alignment, StringBuilder canvas, int width,int height) {
		if (alignment.equals("left")) {
			int start_pos = 0;
			int end_pos = 0;
			for(int i=1;i<height+1;i++) {
				end_pos = start_pos;
				side_length -=1;
				for(int j=side_length;j>=0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i;
		}
		System.out.println(canvas);
		return canvas;
	}
		else if(alignment.equals("right")) {
			int start_pos = width - side_length;
			int end_pos = 0;
			int gap = width - side_length;
			for(int i=1;i<height+1;i++) {
				end_pos = start_pos;
				side_length -=1;
				for(int j=side_length;j>=0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i+gap;
		
		}
			System.out.println(canvas);
			return canvas;
		}
		else if(alignment.equals("middle")) {
			int start_pos = (width - side_length)/2;
			int end_pos = 0;
			int gap = (width - side_length)/2;
			for(int i=1;i<height+1;i++) {
				end_pos = start_pos;
				side_length -=1;
				for(int j=side_length;j>=0;j--) {
					canvas.replace(end_pos, end_pos+1, print_char);
					end_pos +=1;
				}
				start_pos = i*width+i+gap;
		
		}
			System.out.println(canvas);
			return canvas;
		}
		else {
		return null;
	}
		
}
	
	public StringBuilder rot_right(StringBuilder canvas, String print_char, int side_length, int width, String background_char, int start_pos, int start_pos_) {
		
		int side_length_=0;
		int end_pos;
		for (int i=0;i<side_length-1;i++) {
			end_pos = start_pos;
			side_length_ += 1;
			for(int j=0;j<side_length_;j++) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos+width+1;
		}

		int end_pos_;
		int side_length_1 = side_length;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 -= 1;
			for(int j=side_length_1+1;j>0;j--) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ = start_pos_ + (width+1)+1;
		}

		return canvas;
	}
	
	public StringBuilder rot_left(StringBuilder canvas, String print_char, int side_length, int width, String background_char, int start_pos, int start_pos_) {
		int side_length_=side_length;
		int end_pos;
		for (int i=1;i<side_length+1;i++) {
			end_pos = start_pos;
			side_length_ -= 1;
			for(int j=side_length_;j>0;j--) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos + (width+1)+1;
		}
		int end_pos_;
		int side_length_1 = 0;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 += 1;
			for(int j=0;j<side_length_1;j++) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ = start_pos_+(width+1);
		}

		return canvas;
	}
	
	public StringBuilder rot_down(StringBuilder canvas, String print_char, int side_length, int width, String background_char,int start_pos, int start_pos_) {

		int side_length_=side_length;
		int end_pos;
		for (int i=0;i<side_length-1;i++) {
			end_pos = start_pos;
			side_length_ -= 1;
			for(int j=side_length_+1;j>0;j--) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos+(width+1);
		}
		int end_pos_;
		int side_length_1 = 0;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 += 1;
			for(int j=side_length_1;j>0;j--) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ =start_pos_ + (width+1) -1;
		}

		return canvas;
	}
	
	public StringBuilder rot_up(StringBuilder canvas, String print_char, int side_length, int width, String background_char,int start_pos, int start_pos_) {
		int side_length_=0;
		int end_pos;
		for (int i=1;i<side_length;i++) {
			end_pos = start_pos;
			side_length_ += 1;
			for(int j=0;j<side_length_;j++) {
				canvas.replace(end_pos, end_pos+1, background_char);
				end_pos +=1;
			}
			start_pos = start_pos + (width+1)-1;
		}
		int end_pos_;
		int side_length_1 = side_length;
		for(int i=1;i<side_length+1;i++) {
			end_pos_ = start_pos_;
			side_length_1 -= 1;
			for(int j=side_length_1;j>=0;j--) {
			canvas.replace(end_pos_, end_pos_+1, print_char);
			end_pos_ += 1;
			}
			start_pos_ = start_pos_ + (width+1) ;
		}

		return canvas;
	}
	
	public StringBuilder rotation(StringBuilder canvas, String alignment, String print_char, int side_length, int width, int height, String background_char, int count, String rotation_com) {
		Triangle triangle = new Triangle();	
			
			if(alignment.equals("left")) {
				if(count==1||count%4==1) {
					canvas=triangle.rot_right(canvas, print_char, side_length, width, background_char, width+1, 0);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==2||count%4==2) {
					canvas=triangle.rot_down(canvas, print_char, side_length, width, background_char, 0, side_length-1);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==3||count%4==3) {
					canvas=triangle.rot_left(canvas, print_char, side_length, width, background_char, 1, 0);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==4||count%4==0) {
					canvas=triangle.rot_up(canvas, print_char, side_length, width, background_char, width+side_length, 0);
					System.out.println(canvas);
					return canvas;
				}

			}
			
			if(alignment.equals("right")) {
				if(count==1||count%4==1) {
					canvas=triangle.rot_right(canvas, print_char, side_length, width, background_char, width+width-side_length+1, width-side_length);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==2||count%4==2) {
					canvas=triangle.rot_down(canvas, print_char, side_length, width, background_char, width-side_length, width-1);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==3||count%4==3) {
					canvas=triangle.rot_left(canvas, print_char, side_length, width, background_char, width-side_length+1, width-side_length);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==4||count%4==0) {
					canvas=triangle.rot_up(canvas, print_char, side_length, width, background_char, 2*width, width-side_length);
					System.out.println(canvas);
					return canvas;
				}

			}
			
			if(alignment.equals("middle")) {
				if(count==1||count%4==1) {
					canvas=triangle.rot_right(canvas, print_char, side_length, width, background_char, (width - side_length)/2+width+1, (width - side_length)/2);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==2||count%4==2) {
					canvas=triangle.rot_down(canvas, print_char, side_length, width, background_char, (width - side_length)/2, (width - side_length)/2+side_length-1);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==3||count%4==3) {
					canvas=triangle.rot_left(canvas, print_char, side_length, width, background_char, (width - side_length)/2+1, (width - side_length)/2);
					System.out.println(canvas);
					return canvas;
				}
				else if (count==4||count%4==0) {
					canvas=triangle.rot_up(canvas, print_char, side_length, width, background_char,  (width - side_length)/2+width+side_length,  (width - side_length)/2);
					System.out.println(canvas);
					return canvas;
				}

			}
			
		return canvas;
		}
	
}
