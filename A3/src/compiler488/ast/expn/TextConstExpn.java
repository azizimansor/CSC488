package compiler488.ast.expn;

import compiler488.ast.Printable;
import compiler488.ast.SourceLoc;

/**
 * Represents a literal text string constant.
 */
public class TextConstExpn extends ConstExpn implements Printable {
    private String value; // The value of this literal.

    public TextConstExpn(String value, SourceLoc loc) {
        super(loc);

        this.value = value;
    }

    /** Returns a description of the literal text constant. */
    @Override
    public String toString() {
        return "\"" + value + "\"";
    }

    public String getValue() {
        return value;
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof TextConstExpn)) {
            return false;
        }
        
        return equals((TextConstExpn) o);
    }
    
    public boolean equals(TextConstExpn o) {
        return value.equals(o.value);
    }
}
