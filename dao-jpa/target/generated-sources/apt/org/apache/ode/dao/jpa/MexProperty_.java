/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.ode.dao.jpa;

import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.ode.dao.jpa.MexProperty.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Jan 29 09:37:29 IST 2015")
public class MexProperty_ {
    public static volatile SingularAttribute<MexProperty,Long> _id;
    public static volatile SingularAttribute<MexProperty,MessageExchangeDAOImpl> _mex;
    public static volatile SingularAttribute<MexProperty,String> _mexId;
    public static volatile SingularAttribute<MexProperty,String> propertyKey;
    public static volatile SingularAttribute<MexProperty,String> propertyValue;
}