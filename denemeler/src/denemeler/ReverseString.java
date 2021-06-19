package denemeler;

public class ReverseString {
	
	public void reverse() {
		
		String data = "20022002";
		System.out.println(this.recursive(data, data.length(), 0, data.length()-1) );
		
	}
	
	
	private Boolean recursive( String data, int length, int preIndex, int postIndex) {
		Boolean control = true;
		if(preIndex == postIndex || postIndex < preIndex ) 
			return control;
		if(data.charAt(preIndex) == data.charAt(postIndex) ) {
			control = this.recursive(data, length, preIndex+1, postIndex-1);
		}else {
			control = false;
		}
		
		return control;
		
	}

}
