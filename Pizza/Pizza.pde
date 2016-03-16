import ddf.minim.*;
AudioSample sound;  
void setup() {
  Minim minim = new Minim(this);
  sound = minim.loadSample("yum.wav");
  background(200, 200, 200);
  fill(238, 153, 85);
  ellipse(50, 50, 100, 100);
  fill(255, 0, 0);
  ellipse(50, 50, 80, 80);
  fill(238l, 204, 51);
  ellipse(50, 50, 60, 60);
}
void draw()
{ 
  if (mousePressed)
  { fill(255, 0, 0);
  ellipse(mouseX, mouseY, 10, 10);
  sound.trigger();  
  }
  
 
}

