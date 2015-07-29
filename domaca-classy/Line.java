

public class Line {
    private int length;
    private boolean vertical;
    
    public Line(int length, boolean vertical){
        this.length = length;
        this.vertical =  vertical;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public void setVertical(boolean vertical){
        this.vertical = vertical;
    }
    
    public boolean getVertical(){
        return this.vertical;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public String toString(){
        String string = "";
        for(int f = 0;f<length;f++){
            if(vertical){
                string = string + "|/n";
            } else string = string + "-";
        } return string;
    }
}

