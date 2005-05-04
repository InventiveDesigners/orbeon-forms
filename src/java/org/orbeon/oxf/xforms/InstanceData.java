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

import org.orbeon.oxf.common.OXFException;
import org.orbeon.oxf.xml.dom4j.LocationData;

import java.util.*;

/**
 * Instance of this class are used to decorate the XForms instance.
 */
public class InstanceData {

    private LocationData locationData;
    private boolean generated = false;
    private BooleanModelItemProperty relevant = new BooleanModelItemProperty(true);
    private BooleanModelItemProperty required = new BooleanModelItemProperty(false);
    private BooleanModelItemProperty readonly = new BooleanModelItemProperty(false);
    private org.orbeon.oxf.xforms.BooleanModelItemProperty valid = new BooleanModelItemProperty(true);
    private org.orbeon.oxf.xforms.TypeModelItemProperty type = new org.orbeon.oxf.xforms.TypeModelItemProperty();
    private int id = -1;
    private String invalidBindIds = null;
    private Map idToNodeMap;
    private List schemaErrors = null;

    public InstanceData(LocationData locationData) {
        this.locationData = locationData;
    }

    public InstanceData(LocationData locationData, int id) {
        this(locationData);
        this.id = id;
    }

    public boolean isGenerated() {
        return generated;
    }

    public void setGenerated(boolean generated) {
        this.generated = generated;
    }


    public BooleanModelItemProperty getRelevant() {
        return relevant;
    }

    public BooleanModelItemProperty getRequired() {
        return required;
    }

    public BooleanModelItemProperty getReadonly() {
        return readonly;
    }

    public BooleanModelItemProperty getValid() {
        return valid;
    }

    public org.orbeon.oxf.xforms.TypeModelItemProperty getType() {
        return type;
    }

    public String getInvalidBindIds() {
        return invalidBindIds;
    }

    public void setInvalidBindIds(String invalidBindIds) {
        this.invalidBindIds = invalidBindIds;
    }

    public int getId() {
        if (id == -1)
            throw new OXFException("InstanceData id is in invalid state");
        return id;
    }

    public Map getIdToNodeMap() {
        return idToNodeMap;
    }

    public void setIdToNodeMap(Map idToNodeMap) {
        this.idToNodeMap = idToNodeMap;
    }

    public LocationData getLocationData() {
        return locationData;
    }

    public String getSystemId() {
        return locationData.getSystemID();
    }

    public Iterator getSchemaErrorsMsgs() {
        final Collection unmod;
        if (schemaErrors == null) {
            unmod = Collections.EMPTY_LIST;
        } else {
            unmod = Collections.unmodifiableCollection(schemaErrors);
        }
        final Iterator ret = unmod.iterator();
        return ret;
    }

    public void addSchemaError(final String msg) {
        valid.set(false);
        if (schemaErrors == null) {
            schemaErrors = new ArrayList(1);
        }
        schemaErrors.add(msg);
    }

    public void clearSchemaErrors() {
        valid.set(true);
        if (schemaErrors != null)
            schemaErrors.clear();
    }
}
