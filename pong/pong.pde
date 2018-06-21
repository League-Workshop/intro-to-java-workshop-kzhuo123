float x,y,speedX,speedY;
float diam= 10;
PImage shaq;
PImage ball;
PImage court;
void setup() {
  size (1000,1000);
  shaq=
  loadImage("shaq.png");
  shaq.resize(100,100);
  ball=
  loadImage("ball.png");
  court=
  loadImage("court.png");
  court.resize(1000,1000);
}
void draw (){
  background (court);
  image(shaq,mouseX,mouseY);
 image(shaq,x, y, diam, diam);
  x +=speedX;
  y +=speedY;
  // if ( x > width-30 && x < width -20 && y > mouseY-court/2 && y < mouseY+court/2 ) {
    speedX = speedX * -1;
    if (x < 25) {
    speedX *= -1.1;
    speedY *= 1.1;
    x += speedX;
    
  } 
}