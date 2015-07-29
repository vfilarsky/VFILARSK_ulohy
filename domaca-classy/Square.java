
public class Square {

	private int size;
	
	public Square(int size){
		this.size =  size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		String square = "";
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                square = square + "*";
            }
            square = square + "\n";
        }
        return square;
	}
	
	
}
