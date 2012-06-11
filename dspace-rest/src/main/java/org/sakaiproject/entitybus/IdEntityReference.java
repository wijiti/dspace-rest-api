/**
 * $Id: IdEntityReference.java 17 2009-02-17 12:33:06Z azeckoski $
 * $URL: http://entitybus.googlecode.com/svn/tags/entitybus-1.0.8/api/src/main/java/org/sakaiproject/entitybus/IdEntityReference.java $
 * AutoRegister.java - entity-broker - 31 May 2007 7:01:11 PM - azeckoski
 **************************************************************************
 * Copyright (c) 2007, 2008 Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package org.sakaiproject.entitybus;


/**
 * Represents a parsed form of a simple entity reference, as accepted to the {@link EntityBroker}
 * API. These are of the form /prefix/id - this parser will accept overlong references with
 * additional path segments, which will be ignored.
 * 
 * @author Antranig Basman (antranig@caret.cam.ac.uk)
 * @author Aaron Zeckoski (aaronz@vt.edu)
 * @deprecated Use {@link EntityReference} directly, this will be removed eventually
 */
public class IdEntityReference extends EntityReference {

    private static final long serialVersionUID = 1L;

   /**
    * @deprecated use {@link #getId()} to get the id 
    */
   public String id;

   /**
    * @deprecated use {@link EntityReference#EntityReference(String)}
    */
   public IdEntityReference(String reference) {
      super(reference);
      this.id = getId();
   }

   /**
    * @deprecated use {@link EntityReference#EntityReference(String, String)}
    */
   public IdEntityReference(String prefix, String id) {
      super(prefix, id);
      this.id = getId();
   }

   /**
    * @deprecated do not use this method anymore, use the constructors for {@link EntityReference}
    */
   public static String getID(String reference) {
      return new EntityReference(reference).getId();
   }

}