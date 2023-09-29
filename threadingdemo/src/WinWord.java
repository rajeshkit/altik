public class WinWord {
    public static void main(String[] args) {
        Typing t1=new Typing();
        AutoSave t2=new AutoSave();
        t1.start();// run method of Typing class
        t2.start();// run method of Autosave class
    }
}
