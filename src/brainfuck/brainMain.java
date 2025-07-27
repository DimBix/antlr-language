package brainfuck;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class brainMain {
    private brainMain() {
    }

    public static void run (String bfCode) throws IOException {
        CharStream charStream = CharStreams.fromString(bfCode);

        Lexer lexer = new BrainfuckLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrainfuckParser parser = new BrainfuckParser(tokens);

        ParseTree tree = parser.main();

        BrainfuckInterpreter interpreter = new BrainfuckInterpreter(new Conf());
        Conf conf = interpreter.visit(tree);
    }
}
