package compiler;

import compiler.AST.*;
import compiler.lib.*;

import java.sql.Ref;

public class TypeRels {

	// valuta se il tipo "a" e' <= al tipo "b", dove "a" e "b" sono tipi di base: IntTypeNode o BoolTypeNode
	public static boolean isSubtype(TypeNode a, TypeNode b) {
		return a.getClass().equals(
                b.getClass()) || ((a instanceof BoolTypeNode) && (b instanceof IntTypeNode))
				// OOP extension
				|| (a instanceof EmptyTypeNode && b instanceof RefTypeNode);
	}

}
