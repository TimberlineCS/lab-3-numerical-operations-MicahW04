class Numericaloperations{
  public static void main(String[] args){
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;

    System.out.println(57.2 * (i1 / i2) + 1);
    System.out.println(57.2 * ((double)i1 / i2) + 1);
    System.out.println(15 - i1*(d1*3) + 4);
    System.out.println(15 - i1*((int)d1*3) + 4);
    System.out.println(15 - i1*(int)(d1*3) + 4);

    int n1 = 1234;
    int n2 = 6789;
    int n3 = 1080;

    int a1 = n1 % 10, a2 = (n1 % 100)/10, a3 = (n1%1000)/100, a4 = n1/1000;
    int b1 = n2 % 10, b2 = (n2 % 100)/10, b3 = (n2%1000)/100, b4 = n2/1000;
    int c1 = n3 % 10, c2 = (n3 % 100)/10, c3 = (n3%1000)/100, c4 = n3/1000;

    System.out.println(Integer.toString(a1)+Integer.toString(a2)+Integer.toString(a3)+Integer.toString(a4));

    System.out.println(Integer.toString(b1)+Integer.toString(b2)+Integer.toString(b3)+Integer.toString(b4));

    System.out.println(Integer.toString(c1)+Integer.toString(c2)+Integer.toString(c3)+Integer.toString(c4));

  }
}