/**
 * ISOField implementa <b>Leaf</b>
 * dentro de un <b>Composite pattern</b>
 *
 * @see "Design Patterns ISBN 0-201-63361-2"
 *
 * @author apr@cs.com.uy
 * @version $Id$
 * @see ISOComponent
 */

/*
 * $Log$
 * Revision 1.1  1998/11/09 23:40:26  apr
 * *** empty log message ***
 *
 */

package uy.com.cs.jpos.iso;

import java.io.*;
import java.util.*;

public class ISOField extends ISOComponent implements Cloneable {
	protected int fieldNumber;
	protected String value;

	public ISOField (int n) {
		fieldNumber = n;
	}
	public ISOField (int n, String v) {
		fieldNumber = n;
		value = v;
	}
	public byte[] pack() throws ISOException {
		throw new ISOException ("Not available on Leaf");
	}
	public int unpack(byte[] b) throws ISOException {
		throw new ISOException ("Not available on Leaf");
	}
	public Object getKey() {
		return new Integer(fieldNumber);
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object obj) throws ISOException {
		value = (String) obj;
	}
	public void dump (PrintStream p, String indent) {
		p.println (indent +"<fld id=\"" 
			+fieldNumber +"\" value=\"" +value +"\"/>");
	}
}
