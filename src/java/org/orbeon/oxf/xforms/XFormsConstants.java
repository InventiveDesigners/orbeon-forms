/**
 *  Copyright (C) 2004 Orbeon, Inc.
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the
 *  GNU Lesser General Public License as published by the Free Software Foundation; either version
 *  2.1 of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  The full text of the license is available at http://www.gnu.org/copyleft/lesser.html
 */
package org.orbeon.oxf.xforms;

import org.dom4j.Namespace;
import org.dom4j.QName;

public class XFormsConstants {

    public static final String XFORMS_PREFIX = "xforms";
    public static final String XFORMS_SHORT_PREFIX = "xf";
    public static final String XFORMS_NAMESPACE_URI = "http://www.w3.org/2002/xforms";
    public static final Namespace XFORMS_NAMESPACE = new Namespace(XFORMS_PREFIX, XFORMS_NAMESPACE_URI);

    public static final String XXFORMS_PREFIX = "xxforms";
    public static final String XXFORMS_SHORT_PREFIX = "xxf";
    public static final String XXFORMS_NAMESPACE_URI = "http://orbeon.org/oxf/xml/xforms";
    public static final Namespace XXFORMS_NAMESPACE = new Namespace(XXFORMS_PREFIX, XXFORMS_NAMESPACE_URI);

    public static final String XML_EVENTS_PREFIX = "ev";
    public static final String XML_EVENTS_NAMESPACE_URI = "http://www.w3.org/2001/xml-events";

    public static final String XXFORMS_VALID_ATTRIBUTE_NAME = "valid";
    public static final QName XXFORMS_VALID_ATTRIBUTE_QNAME = new QName(XXFORMS_VALID_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);
    public static final String XXFORMS_INVALID_BIND_IDS_ATTRIBUTE_NAME = "invalid-bind-ids";
    public static final QName XXFORMS_INVALID_BIND_IDS_ATTRIBUTE_QNAME = new QName(XXFORMS_INVALID_BIND_IDS_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);
    public static final String XXFORMS_RELEVANT_ATTRIBUTE_NAME = "relevant";
    public static final QName XXFORMS_RELEVANT_ATTRIBUTE_QNAME = new QName(XXFORMS_RELEVANT_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);
    public static final String XXFORMS_REQUIRED_ATTRIBUTE_NAME = "required";
    public static final QName XXFORMS_REQUIRED_ATTRIBUTE_QNAME = new QName(XXFORMS_REQUIRED_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);
    public static final String XXFORMS_READONLY_ATTRIBUTE_NAME = "readonly";
    public static final QName XXFORMS_READONLY_ATTRIBUTE_QNAME = new QName(XXFORMS_READONLY_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);
    public static final String XXFORMS_TYPE_ATTRIBUTE_NAME = "type";
    public static final QName XXFORMS_TYPE_ATTRIBUTE_QNAME = new QName(XXFORMS_TYPE_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);
    public static final String XXFORMS_NODE_IDS_ATTRIBUTE_NAME = "node-ids";
    public static final QName XXFORMS_NODE_IDS_ATTRIBUTE_QNAME = new QName(XXFORMS_READONLY_ATTRIBUTE_NAME, XXFORMS_NAMESPACE);

    public static final String XFORMS_PASSWORD_PROPERTY = "oxf.xforms.password";
    public static final String XFORMS_ENCRYPT_NAMES_PROPERTY = "oxf.xforms.encrypt-names";
    public static final String XFORMS_ENCRYPT_HIDDEN_PROPERTY = "oxf.xforms.encrypt-hidden";
    public static final String XFORMS_VALIDATION_PROPERTY = "oxf.xforms.validate";
    
    private XFormsConstants() {
        // Disallow contruction
    }
}
