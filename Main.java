
class Main {
  public static void main(String[] args) {
    Send send = new Send();
    Recv recive = new Recv();
    try {
        //管道连接
        send.getOut().connect(recive.getInput());
    } catch (Exception e) {
        e.printStackTrace();
    }
    new Thread(send).start();
    new Thread(recive).start();
    System.out.println("Hello world!");
  }
}