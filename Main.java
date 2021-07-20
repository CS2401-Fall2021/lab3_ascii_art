class Main {
  
  public static void main(String[] args) {
    // Part 1
    Image image = loadImage("pup.jpeg");
    System.out.println(image.getBlackWhiteAscii()); 
    // Part 2
    //System.out.println(image.getGreyAscii());
    
    // Part 3
    //System.out.println(image.getRotatedGreyAscii());
    
    // Part 4
    //System.out.println(image.getResizedGreyAscii(100,100));
  }
}
