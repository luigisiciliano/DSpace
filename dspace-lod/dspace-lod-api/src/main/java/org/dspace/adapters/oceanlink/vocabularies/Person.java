/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.adapters.oceanlink.vocabularies;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * Created with IntelliJ IDEA.
 * User: dspace
 * Date: 5/21/14
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private static final ValueFactory vf = ValueFactoryImpl.getInstance();

    public static final String NAMESPACE = "http://schema.oceanlink.org/person#";

    public static final URI Person = vf.createURI(NAMESPACE, "Person");

    public static final URI hasPersonalInfoItem = vf.createURI(NAMESPACE, "hasPersonalInfoItem");

    public static final URI performsAgentRole = vf.createURI(NAMESPACE, "performsAgentRole");
}
