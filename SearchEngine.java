
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String pencil = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Searches so far: %s", pencil);
        } else if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
                    pencil += (parameters[1]);
            return ("");
            
        } 
        
        else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                
            }
            return "404 Not Found!";
        }
    }
}







class SearchEngine {
    
}
