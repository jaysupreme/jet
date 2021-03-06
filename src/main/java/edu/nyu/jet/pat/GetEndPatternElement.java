// -*- tab-width: 4 -*-
//Title:        JET
//Version:      1.00
//Copyright:    Copyright (c) 2000
//Author:       Ralph Grishman
//Description:  A Java-based Information Extraction Tool

package edu.nyu.jet.pat;

import java.util.HashMap;
import edu.nyu.jet.lisp.Variable;
import edu.nyu.jet.tipster.*;

public class GetEndPatternElement extends AtomicPatternElement {

  Variable variable;

  public GetEndPatternElement(Variable v) {
    variable = v;
  }

  @Override
public String toString () {
    return variable.toString() + ".end=* ";
  }

  @Override
public void eval (Document doc, int posn, String tokenString, HashMap bindings,
                    PatternApplication patap, PatternNode node) {
    Integer start = (Integer) bindings.get(variable.name);
    /*** should check that variable.name is bound ! */
    bindings = (HashMap) bindings.clone();
    bindings.put(variable.name,new Span(start.intValue(),posn));
    node.eval(doc, posn, bindings, patap);
  }
}
