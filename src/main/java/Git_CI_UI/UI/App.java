package Git_CI_UI.UI;

import org.apache.maven.maven.Library;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Library lib = new Library();
    	
    	HelloWorldWindow window = new HelloWorldWindow();
        window.intialize(lib.someLibraryMethod());
    }
}
