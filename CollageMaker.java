/**
 * Unit 8 - Collage Maker
 *
 * @author Yamilett Estrada
 * @version 3/22/2019
 */
public class CollageMaker
{
    public static void main(String[] args)
    {        
        Picture canvasPic = new Picture("400x400.jpg");        
        Pixel[][] canvas = canvasPic.getPixels2D();        

        Pixel[][] aPic = (new Picture("rsz_roach.jpg")).getPixels2D(); // image file may be changed 
        Pixel[][] bPic = (new Picture("savage.jpg")).getPixels2D(); // image file may be changed
        Pixel[][] cPic = (new Picture("download.jpg")).getPixels2D(); // image file may be changed
        Pixel[][] dPic = (new Picture("eh.jpg")).getPixels2D(); // image file may be change
        Pixel[][] dab = (new Picture("um.jpg")).getPixels2D(); //image file may be changed
	
	//A pic
	for(int r = 0; r < aPic.length; r++) { // row
	    for(int pixel = 0; pixel < aPic[r].length; pixel++) {
	        canvas[r][pixel].setRed(aPic[r][pixel].getRed());
	        canvas[r][pixel].setGreen(aPic[r][pixel].getGreen());
	        canvas[r][pixel].setBlue(aPic[r][pixel].getBlue());
	    }
	}

	//B pic
	for(int r = 0; r < bPic.length; r++) { // row
	    for(int pixel = 0; pixel < bPic[r].length; pixel++) {
	        canvas[r][pixel + 200].setRed(bPic[r][pixel].getRed());
	        canvas[r][pixel + 200].setGreen(bPic[r][pixel].getGreen());
	        canvas[r][pixel + 200].setBlue(bPic[r][pixel].getBlue());
	    }
	}
	
	//C pic
	for(int r = 0; r < cPic.length; r++) { // row
	    for(int pixel = 0; pixel < cPic[r].length; pixel++) {
	        canvas[r + 200][pixel].setRed(cPic[r][pixel].getRed());
	        canvas[r + 200][pixel].setGreen(cPic[r][pixel].getGreen());
	        canvas[r + 200][pixel].setBlue(cPic[r][pixel].getBlue());
	    }
	}
	
	for(int r = 0; r < dPic.length; r++) { // row
	    for(int pixel = 0; pixel < dPic[r].length; pixel++) { //column
	        canvas[r + 200][pixel + 200].setRed(dPic[r][pixel].getRed());
	        canvas[r + 200][pixel + 200].setGreen(dPic[r][pixel].getGreen());
	        canvas[r + 200][pixel + 200].setBlue(dPic[r][pixel].getBlue());
	    }
	}
	
	//smack in the middle
	for(int r = 0; r < dab.length; r++) {
	    for(int pixel = 0; pixel < dab[r].length; pixel++) {
	        canvas[r + 100][pixel + 100].setRed(dab[r][pixel].getRed());
	        canvas[r + 100][pixel + 100].setGreen(dab[r][pixel].getGreen());
	        canvas[r + 100][pixel + 100].setBlue(dab[r][pixel].getBlue());
	    }
	}
	
        //Shows the final result
        canvasPic.explore();
    }

}
