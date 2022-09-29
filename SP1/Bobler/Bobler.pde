// Main frame size
size(800,600);
background(0);

Bubble[] bubbles = new Bubble[100];


void setup() {
  for (int i = 0; i < bubbles.length; i++) {
  bubbles[i] = new Bubble(i*2);
  }
}
  
void draw() {
  for (int i = 0; i < bubbles.length; i++) {
    bubbles[i].ascend();
    bubbles[i].top();
    bubbles[i].display();
  }
}
