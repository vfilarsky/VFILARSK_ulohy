
public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public String toString(){
		String string = "";
		for(int i=0; i<height;i++){
			for(int n = 0; n < width;n++){
				string = string + "*";
			}
			string = string + "\n";
		}
		return string;
	}
}
