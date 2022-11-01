public class AnonymousInnerClass {


    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

                for (int i=0; i<10;i++) {
                    System.out.println("CHILD CLASS");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int j=0; j<10;j++) {
            System.out.println("PARENT CLASS");
        }

        }
    }

