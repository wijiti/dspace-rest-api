/**
 * $Id: BatchProvider.java 17 2009-02-17 12:33:06Z azeckoski $
 * $URL: http://entitybus.googlecode.com/svn/tags/entitybus-1.0.8/rest/src/main/java/org/sakaiproject/entitybus/rest/caps/BatchProvider.java $
 * BatchProvider.java - entity-broker - Jan 14, 2009 3:36:31 PM - azeckoski
 **************************************************************************
 * Copyright (c) 2008 Aaron Zeckoski
 * Licensed under the Apache License, Version 2.0
 * 
 * A copy of the Apache License has been included in this 
 * distribution and is available at: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Aaron Zeckoski (azeckoski @ gmail.com) (aaronz @ vt.edu) (aaron @ caret.cam.ac.uk)
 */

package org.sakaiproject.entitybus.rest.caps;

import org.sakaiproject.entitybus.entityprovider.capabilities.DescribePropertiesable;
import org.sakaiproject.entitybus.entityprovider.capabilities.Outputable;


/**
 * A provider interface for the batch handler
 * 
 * @author Aaron Zeckoski (azeckoski @ gmail.com)
 */
public interface BatchProvider extends DescribePropertiesable, Outputable {
    // this left empty on purpose
}