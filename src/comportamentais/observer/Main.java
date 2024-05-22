package comportamentais.observer;

import comportamentais.observer.editor.Editor;
import comportamentais.observer.listeners.EmailNotificationListener;
import comportamentais.observer.listeners.LogOpenListener;

public class Main {

	 public static void main(String[] args) {
		 
	        Editor editor = new Editor();
	        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
	        editor.events.subscribe("save", new EmailNotificationListener("rivaldo@example.com"));

	        try {
	            editor.openFile("test.txt");
	            editor.saveFile();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
    
}
