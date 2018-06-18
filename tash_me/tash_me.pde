PImage mustache;
PImage friend;
void setup(){
friend=
loadImage("friend.png");
  size(900,900);
  friend.resize(900,900);
  mustache=
  loadImage("mustache.png");
  mustache.resize(500,150);
}
void draw(){
  background(friend);
  image(mustache,mouseX,mouseY);
}