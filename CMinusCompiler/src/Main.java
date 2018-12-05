
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.CMinusLexer;
import compiler.CMinusMyVisitor;
import compiler.CMinusParser;


public class Main {

    
    public static void main(String[] args) throws Exception {
    	CharStream input = CharStreams.fromFileName("/home/nicbacic/sum.cminus");
    	compile(input);
	}
	
	public static String compile(CharStream input) {
		 CMinusLexer lexer = new CMinusLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         CMinusParser parser = new CMinusParser(tokens);
 		 ParseTree tree = parser.program();
         CMinusMyVisitor visitor = new CMinusMyVisitor();
         String v = visitor.visit(tree);
         System.out.println(v);
         return v;
	}
}