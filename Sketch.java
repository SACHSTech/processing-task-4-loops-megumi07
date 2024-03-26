import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// draw grid
  stroke(0, 0, 0);
  for (int lineX = 20; lineX <=200; lineX +=20) {
    line(lineX, 0, lineX, height / 2);
    line(width / 2, lineX, 0, lineX);
  }
  // draw circles
  for (int circleY = 30; circleY <=400; circleY +=80) {
    for (int circleX = 230; circleX <=400; circleX +=40) {
      fill(230, 5, 98);
      ellipse(circleX, circleY / 2, 20, 20);
    }
  }
  // draw gradient
  for (int gradientY = 200; gradientY < height; gradientY++){
    for (int gradientX = 0; gradientX < width; gradientX++){
      stroke(gradientX, gradientX, gradientX);
      point(gradientX / 2, gradientY);
    }
  }
  // draw flower
      pushMatrix();
      fill(242, 147, 15);
      translate(300, 300);
    for (int petal = 0; petal < 8; petal++){
      rotate(TWO_PI/8);
      ellipse(0, 50, 40, 80);
    }
      popMatrix();

  // draw flower center
  fill (68, 145, 75);
  ellipse (300, 300, 50, 50);
  }


 
  
  }
