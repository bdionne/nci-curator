// Copyright (c) 2006 - 2008, Clark & Parsia, LLC. <http://www.clarkparsia.com>
// This source code is available under the terms of the Affero General Public License v3.
//
// Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
// Questions, comments, or requests for clarification: licensing@clarkparsia.com

package gov.nih.nci.curator.taxonomy.printer;

import java.io.PrintWriter;

import gov.nih.nci.curator.taxonomy.Taxonomy;



/**
 * <p>
 * Title: Taxonomy Printer Interface
 * </p>
 * 
 * <p>
 * Description: Interface implemented by classes capable of printing taxonomies.
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2007
 * </p>
 * 
 * <p>
 * Company: Clark & Parsia, LLC. <http://www.clarkparsia.com>
 * </p>
 * 
 * @author Mike Smith
 */
public interface TaxonomyPrinter<T> {

	public void print(Taxonomy<T> taxonomy);

	public void print(Taxonomy<T> taxonomy, PrintWriter out);
}
