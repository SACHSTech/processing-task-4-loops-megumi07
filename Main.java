import processing.core.PApplet;

/**
 * Write a program that creates the same image as the one assigned.
 * @ M. Fong 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}