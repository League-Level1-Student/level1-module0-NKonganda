
  PImage pictureOfRecord;  
  int rotateAngle = 0;
public void setup() {
size(600,600);
   pictureOfRecord = loadImage("download.jpeg");  
}
public void draw() {
  rotateImage (pictureOfRecord, rotateAngle);
  image(pictureOfRecord,0,0); 
  if(mousePressed)
   rotateAngle = rotateAngle + 5;
}
  void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
