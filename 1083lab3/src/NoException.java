public class NoException {
    static final String words[] = {
	"They","who","can","give","up","essential","liberty",
	"to","obtain","a","little","temporary",	"safety,",
	"deserve","neither","liberty","nor","safety."  };
    static final int indices[][] = { {0,1},{5,0},{6,0},{10,4},{11,4},
                                     {12,-1},{1,0},{1,2},{11,5},
                                     {15,0},{13,0},{18,2}};
    public static void main(String args[]){
  	
    	for (int i=0; i< indices.length; i++){
        	//System.out.print(indices[i][1]);
      if((indices[i][1]<0)) {   	  
            	System.out.print(", ");
      }else if(indices[i][0]>0&&indices[i][0]>words.length-1) {
    	  System.out.print("!");
      }else {
            System.out.print(words[indices[i][0]].charAt(indices[i][1]));
      }
        }
        
    }
}
