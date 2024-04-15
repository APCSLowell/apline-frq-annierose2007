public class APLine {
 /** State variables. Any numeric type; object or primitive. */
 private int a, b, c;
 /** Constructor with 3 int parameters. */
 public APLine(int a, int b, int c) {
 this.a = a;
 this.b = b;
 this.c = c;
 }
 /** Determine the slope of this APLine. */
 public double getSlope() {
 return ( - (this.a / (double) this.b));
 }
 /** Determine if coordinates represent a point on this APLine. */
 public boolean isOnLine(int x, int y) {
 return (0 == (this.a * x) + (this.b * y) + this.c);
 }
}
