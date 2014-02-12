package compiler488.ast.stmt;

import java.io.PrintStream;

import compiler488.ast.Indentable;

/**
 * The command to return from a procedure.
 */
public class ReturnStmt extends Stmt {
    public ReturnStmt() {
    }

    /**
     * Print <b>return</b> on a line, by itself.
     *
     * @param out
     *            Where to print.
     * @param depth
     *            How much indentation to use while printing.
     */
    @Override
    public void printOn(PrintStream out, int depth) {
        Indentable.printIndentOn(out, depth);
        out.println("return ");
    }
}

