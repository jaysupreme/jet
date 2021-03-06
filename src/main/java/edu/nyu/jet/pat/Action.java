// -*- tab-width: 4 -*-
//Title:        JET
//Version:      1.00
//Copyright:    Copyright (c) 2000
//Author:       Ralph Grishman
//Description:  A Java-based Information Extraction Tool

package edu.nyu.jet.pat;

import edu.nyu.jet.tipster.*;

/**
 *  The representation of an action as part of a <B>when</B> statement
 *  in a pattern collection.
 */

public abstract class Action {

  public abstract int perform(Document doc, PatternApplication patap);

  @Override
public abstract String toString();

}
