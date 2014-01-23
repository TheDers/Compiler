/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiler;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anders, Calvin, Odin
 */
public class mp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
        {
            String filename = args[0];
            File file = new File(filename);
            dispatcher(file);
        }
    public static void dispatcher(File file)throws IOException
        {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            int c = 0;
            int rowNum = 0;
            int colNum = 0;
            boolean isSymbol = false;
            boolean isReservedWord = false;
            boolean isLetterDigit = false;
            while((c = buffer.read()) != -1) 
            {
                colNum++;
		char character = (char) c;
                switch(character) 
                   {
                       case '\n':
                           rowNum++;
                           break;
                       case '.':
                           isSymbol = true;
                           break;
                       case ',':
                           isSymbol = true;
                           break;
                       case ';':
                           isSymbol = true;
                           break;
                       case '(':
                           isSymbol = true;
                           break;
                       case ')':
                           isSymbol = true;
                           break;
                       case '=':
                           isSymbol = true;
                           break;
                       case '>':
                           isSymbol = true;
                           break;
                       case '<':
                           isSymbol = true;
                           break;
                       case ':':
                           isSymbol = true;
                           break;
                       case '+':
                           isSymbol = true;
                           break;
                       case '-':
                           isSymbol = true;
                           break;
                       case '*':
                           isSymbol = true;
                           break;
                       case 'a':
                           isLetterDigit = true;
                           break;
                       case 'b':
                           isLetterDigit = true;
                           break;
                       case 'c':
                           isLetterDigit = true;
                           break;
                       case 'd':
                           isLetterDigit = true;
                           break;
                       case 'e':
                           isLetterDigit = true;
                           break;
                       case 'f':
                           isLetterDigit = true;
                           break;
                       case 'g':
                           isLetterDigit = true;
                           break;
                       case 'h':
                           isLetterDigit = true;
                           break;
                       case 'i':
                           isLetterDigit = true;
                           break;
                       case 'j':
                           isLetterDigit = true;
                           break;
                       case 'k':
                           isLetterDigit = true;
                           break;
                       case 'l':
                           isLetterDigit = true;
                           break;
                       case 'm':
                           isLetterDigit = true;
                           break;
                       case 'n':
                           isLetterDigit = true;
                           break;
                       case 'o':
                           isLetterDigit = true;
                           break;
                       case 'p':
                           isLetterDigit = true;
                           break;
                       case 'q':
                           isLetterDigit = true;
                           break;
                       case 'r':
                           isLetterDigit = true;
                           break;
                       case 's':
                           isLetterDigit = true;
                           break;
                       case 't':
                           isLetterDigit = true;
                           break;
                       case 'u':
                           isLetterDigit = true;
                           break;
                       case 'v':
                           isLetterDigit = true;
                           break;
                       case 'w':
                           isLetterDigit = true;
                           break;
                       case 'x':
                           isLetterDigit = true;
                           break;
                       case 'y':
                           isLetterDigit = true;
                           break;
                       case 'z':
                           isLetterDigit = true;
                           break;
                       case 'A':
                           isLetterDigit = true;
                           break;
                       case 'B':
                           isLetterDigit = true;
                           break;
                       case 'C':
                           isLetterDigit = true;
                           break;
                       case 'D':
                           isLetterDigit = true;
                           break;
                       case 'E':
                           isLetterDigit = true;
                           break;
                       case 'F':
                           isLetterDigit = true;
                           break;
                       case 'G':
                           isLetterDigit = true;
                           break;
                       case 'H':
                           isLetterDigit = true;
                           break;
                       case 'I':
                           isLetterDigit = true;
                           break;
                       case 'J':
                           isLetterDigit = true;
                           break;
                       case 'K':
                           isLetterDigit = true;
                           break;
                       case 'L':
                           isLetterDigit = true;
                           break;
                       case 'M':
                           isLetterDigit = true;
                           break;
                       case 'N':
                           isLetterDigit = true;
                           break;
                       case 'O':
                           isLetterDigit = true;
                           break;
                       case 'P':
                           isLetterDigit = true;
                           break;
                       case 'Q':
                           isLetterDigit = true;
                           break;
                       case 'R':
                           isLetterDigit = true;
                           break;
                       case 'S':
                           isLetterDigit = true;
                           break;
                       case 'T':
                           isLetterDigit = true;
                           break;
                       case 'U':
                           isLetterDigit = true;
                           break;
                       case 'V':
                           isLetterDigit = true;
                           break;
                       case 'W':
                           isLetterDigit = true;
                           break;
                       case 'X':
                           isLetterDigit = true;
                           break;
                       case 'Y':
                           isLetterDigit = true;
                           break;
                       case 'Z':
                           isLetterDigit = true;
                           break;
                       case '0':
                           isLetterDigit = true;
                           break;
                       case '1':
                           isLetterDigit = true;
                           break;
                       case '2':
                           isLetterDigit = true;
                           break;
                       case '3':
                           isLetterDigit = true;
                           break;
                       case '4':
                           isLetterDigit = true;
                           break;
                       case '5':
                           isLetterDigit = true;
                           break;
                       case '6':
                           isLetterDigit = true;
                           break;
                       case '7':
                           isLetterDigit = true;
                           break;
                       case '8':
                           isLetterDigit = true;
                           break;
                       case '9':
                           isLetterDigit = true;
                           break;
                       default:
                            break;
                   }
                if (isSymbol == true)
                {
                    Symbols symbol = new Symbols(file, rowNum, colNum, character);
                    String results = symbol.getToken();
                }
                if (isLetterDigit == true)
                {
                    letterDigits letterDigit = new letterDigits(file, rowNum, colNum, character);
                    String results = letterDigit.getToken();

                }
                if (isReservedWord == true || isLetterDigit)
                {
                    ReservedWords rWord = new ReservedWords(file, rowNum, colNum, character);
                    String results = rWord.getToken();

                }
            isSymbol = false;
            isLetterDigit = false;
            isReservedWord = false;
            }

        }
    
}