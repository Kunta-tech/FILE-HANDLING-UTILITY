import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
  private File file;
  FileHandler(String filepath) throws FileNotFoundException{
    this.file = new File(filepath);
    if(!this.file.exists()) throw new FileNotFoundException("File not found at: "+filepath);
  }
  public StringBuilder read() throws IOException{
    StringBuilder lines = new StringBuilder();    
    if(this.file.canRead()){
      BufferedReader bufferedReader = new BufferedReader(new FileReader(this.file));
      while (bufferedReader.ready()) {
        lines.append(bufferedReader.readLine()).append('\n');
      }
      bufferedReader.close();
    }else{
      throw new IOException("Can't read file "+this.file.getName());
    }
    return lines;
  }
  public void write(StringBuilder lines) throws IOException{
    if(this.file.canWrite()){
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.file));
      bufferedWriter.write(lines.toString());
      bufferedWriter.close();
    }else{
      throw new IOException("Can't write file "+this.file.getName());
    }
  }
  public void modify(String oldText, String newText) throws IOException {
    String lines = this.read().toString();
    lines = lines.replace(oldText, newText);
    this.write(new StringBuilder(lines));
  }
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Usage:");
      System.out.println("  -r filepath                 : Read file");
      System.out.println("  -w filepath \"your text\"     : Write to file");
      System.out.println("  -m filepath \"old\" \"new\"     : Modify text");
      return;
    }

    String operation = args[0];
    String filepath = args[1];

    try {
      FileHandler fh = new FileHandler(filepath);

      switch (operation) {
        case "-r":
          System.out.println("Reading file:");
          System.out.println(fh.read().toString());
          break;

        case "-w":
          if (args.length < 3) {
            System.out.println("Provide text to write.");
            return;
          }
          fh.write(new StringBuilder(args[2]));
          System.out.println("File written successfully.");
          break;

        case "-m":
          if (args.length < 4) {
            System.out.println("Provide old and new text.");
            return;
          }
          fh.modify(args[2], args[3]);
          System.out.println("File modified successfully.");
          break;

        default:
          System.out.println("Invalid operation flag. Use -r, -w, or -m.");
      }

    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
