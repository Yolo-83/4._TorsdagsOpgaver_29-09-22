class Bubble {
  
  float x;
  float y;
  float dimention;
  float speed;
  
  // Bubbles Constructor
  Bubbles(float random) {
    x = random(width);
    y = height;
    dimention = random;
    speed = random(0.3, 4);
  }
  
  // location
  void ascend() {
    y = y - yspeed;
    x = x + random(-3, 2);
  }
  
  // Visual 
  void display() {
    stroke(0,5);
    fill(random.RGB);
    ellipse(x, y, diameter, diameter);
  }
  
  // 
  Void top() {
     if (y < -diameter/2) {
      y = height + diameter/2;
     }
  }
  
}
