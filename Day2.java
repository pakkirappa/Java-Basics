
//  what is Function in java ? //  what is Method in java ?
// function is a block of code that performs a specific task.
// method is a function which is a part of class.
// function is a part of class.

/*
 * 1. function is a block of code that performs a specific task.
 * 2. function is a part of class.
 * Example: 1  
 * class A{
*   public static void main(String[] args) {
 *             System.out.println("Hello World");
 *        add(10,20);
 * 
 *         }
 *    static int add(int a, int b){
 *       return a+b;
 * }   
 * }
 *  Output: Hello World        
 */

// What is oops in java ?
// oops is a programming paradigm based on the concept of objects.
// oops is a programming paradigm based on the concept of classes and objects.
// oops is a programming paradigm based on the concept of data hiding, data abstraction, encapsulation, polymorphism, inheritance.
// oops is a programming paradigm based on the concept of data hiding, data abstraction, encapsulation, polymorphism, inheritance, message passing.
// oops is a programming paradigm based on the concept of data hiding, data abstraction, encapsulation, polymorphism, inheritance, message passing, dynamic binding, abstraction.

// what are the features of oops ?
// 1. data hiding
// 2. data abstraction
// 3. encapsulation
// 4. polymorphism
// 5. inheritance
// 6. message passing
// 7. dynamic binding
// 8. abstraction
/*
 * 1. data hiding : data hiding is a mechanism of hiding the data from the outside world.
   * 2. data abstraction : data abstraction is a mechanism of hiding the implementation details from the outside world.
   * 3. encapsulation : encapsulation is a mechanism of binding the data and methods together in a single unit.
   * 4. polymorphism : polymorphism is a mechanism of performing a single task in different ways.
   * 5. inheritance : inheritance is a mechanism of acquiring the properties of one class into another class.  
   * 6. message passing : message passing is a mechanism of sending the message from one object to another object.
   * 7. dynamic binding : dynamic binding is a mechanism of binding the method call at runtime.
   * 8. abstraction : abstraction is a mechanism of hiding the implementation details from the outside world.
   * Example on Data Hiding:
   * class A{ 
   * private int a=10;
   * public static void main(String[] args) {
   * A obj=new A();
   * System.out.println(obj.a);
   * }
   * }
   * Output: 10
   * Example on Data Abstraction: 
   * class A{
   * public static void main(String[] args) {
   * A obj=new A();
   * obj.add(10,20);
   * }
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * }
   * Output: 30
   * Example on Encapsulation:
   * class A{
   * private int a=10;
   * public static void main(String[] args) {
   * A obj=new A();
   * System.out.println(obj.a);
   * }
   * }
   * Output: 10
   * 
   * Example on Polymorphism:
   * class A{
   * public static void main(String[] args) {
   * A obj=new A();
   * obj.add(10,20);
   * obj.add(10,20,30);
   * }
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * void add(int a, int b, int c){
   * System.out.println(a+b+c);
   * }
   * }
   * Output: 30
   *        60
   * Example on Inheritance:
   * class A{
   * public static void main(String[] args) {
   * B obj=new B();
   * obj.add(10,20);
   * }
   * }
   * class B extends A{
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * }
   * Output: 30
   * Example on Message Passing:
   * class A{
   * public static void main(String[] args) {
   * A obj=new A();
   * obj.add(10,20);
   * }
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * }
   * Output: 30
   * Example on Dynamic Binding:
   * class A{
   * public static void main(String[] args) {
   * A obj=new B();
   * obj.add(10,20);
   * }
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * }
   * class B extends A{
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * }
   * Output: 30
   * 
   * Example on Abstraction:
   * class A{
   * public static void main(String[] args) {
   * A obj=new A();
   * obj.add(10,20);
   * }
   * void add(int a, int b){
   * System.out.println(a+b);
   * }
   * }
   * Output: 30
   * 
   *            
   *    
 */

// take an example of a car and explain the features of oops. 
// car is an object.
// car is a class.
// car is a real world entity. 
// car is a blueprint. 
// car has properties. like color, model, price, speed, etc.
// car has methods. like start(), stop(), move(), etc.
// car has variables. like color, model, price, speed, etc.

/*
 * class Car{
 *  String color;
 * String model;
 * int price;
 * int speed;
 * void start(){
 *  System.out.println("car is started");
 * }
 * void stop(){
 * System.out.println("car is stopped");
 * }
 * void move(){
 * System.out.println("car is moving");
 * }
 * }
 * 
 * class A{
 * public static void main(String[] args) {
 *  Car obj=new Car();
 * obj.color="red";
 * obj.model="BMW";
 * obj.price=1000000;
 * obj.speed=200;
 * System.out.println(obj.color);
 * System.out.println(obj.model);
 * System.out.println(obj.price);
 * System.out.println(obj.speed);
 * obj.start();
 * obj.stop();
 * obj.move();
 * }
 *  
 * }
 * Output: red
 *        BMW
 *       1000000
 *      200
 *    car is started
 *   car is stopped
 *  car is moving
 * 
 */

// take an example of a mobile and explain the features of oops in detail with real time example.
// mobile is an object.
// mobile is a class.
// mobile is a real world entity.
// mobile is a blueprint.
// mobile has properties. like color, model, price, etc.
// mobile has methods. like call(), message(), etc.
// mobile has variables. like color, model, price, etc.
// mobile has data. like contacts, messages, etc.
// mobile has sim card. like airtel, jio, etc.
// mobile has battery. like 4000mah, 5000mah, etc.
// mobile has camera. like 48mp, 64mp, etc.
// mobile has ram. like 4gb, 6gb, etc.
// mobile has rom. like 64gb, 128gb, etc.
// mobile has processor. like snapdragon, mediatek, etc.
// mobile has display. like 6inch, 6.5inch, etc.
// mobile has operating system. like android, ios, etc.
// mobile has sensors. like fingerprint, face unlock, etc.
// mobile has accessories. like charger, earphones, etc.
// mobile has applications. like whatsapp, facebook, etc.
// mobile has storage. like internal storage, external storage, etc.
// mobile has network. like 2g, 3g, 4g, 5g, etc.
// mobile has sim card slots. like single sim, dual sim, etc.
// mobile has memory card slots. like single memory card slot, dual memory card slot, etc.
// mobile has wifi. like 2.4ghz, 5ghz, etc.
// mobile has bluetooth. like bluetooth 4.0, bluetooth 5.0, etc.
// mobile has gps. like gps, agps, etc.
// mobile has nfc. like nfc, nfc+, etc.
// mobile has usb. like usb 2.0, usb 3.0, etc.
// mobile has audio jack. like 3.5mm, 2.5mm, etc.

/*
 * class Mobile{
 * String color;
 * String model;
 * int price;
 * void call(){
 * System.out.println("calling");
 * }
 * void message(){
 * System.out.println("messaging");
 * }
 * }
 * class A{
 * public static void main(String[] args) {
 * Mobile obj=new Mobile();
 * obj.color="red";
 * obj.model="samsung";
 * obj.price=10000;
 * System.out.println(obj.color);
 * System.out.println(obj.model);
 * System.out.println(obj.price);
 * obj.call();
 * obj.message();
 * }
 * }
 * Output: red
 *        samsung
 *       10000
 *      calling
 *     messaging
 * 
 */

public class Day2 {
    public static void main(String[] args) {
        add(10, 20);
        System.out.println(addString("hello", "    bhavs"));
        System.out.println(add(10, 20));
    }

    // function
    static int add(int a, int b) {
        return a + b;
    }

    static String addString(String a, String b) {
        return a + b;
    }
}
