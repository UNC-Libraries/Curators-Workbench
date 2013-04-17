/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 */
package crosswalk.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DateToXMLGregorianCalenderConversion;
import crosswalk.util.ImpreciseDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date To XML Gregorian Calender Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DateToXMLGregorianCalenderConversionImpl extends EObjectImpl implements DateToXMLGregorianCalenderConversion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateToXMLGregorianCalenderConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.DATE_TO_XML_GREGORIAN_CALENDER_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object convert(Object input) {
    	  if(!Date.class.isInstance(input)) {
      		  throw new Error("Input is not a Date: "+ input.getClass().getName()+" "+input);
      	  }

    	  XMLGregorianCalendar result = null;
    	  
    	  DatatypeFactory tf = null;
    	  try {
    		  tf = DatatypeFactory.newInstance();
    	  } catch(DatatypeConfigurationException e) {
    		  throw new Error(e);
    	  }

    	  GregorianCalendar gregcal = new GregorianCalendar();
    	  gregcal.setTime((Date)input);
    	  XMLGregorianCalendar gcal = tf.newXMLGregorianCalendar(gregcal);
      	  if(input instanceof ImpreciseDate) {
        	  result = tf.newXMLGregorianCalendar();
        	  result.setDay(1);
        	  result.setMonth(1);
      		  ImpreciseDate date = (ImpreciseDate)input;
      		  switch(date.getPrecision()) {
      		  // discarding time at the moment (xs:Date)
      		  case SECOND:
      			  // result.setSecond(gcal.getSecond());
      		  case MINUTE:
      			  // result.setMinute(gcal.getMinute());
      		  case HOUR:
      			  // result.setHour(gcal.getHour());
      		  case DAY:
      			  result.setDay(gcal.getDay());
      		  case MONTH:
      			  try {
      			  result.setMonth(gcal.getMonth());
      			  } catch(IllegalArgumentException e) {
      				  System.err.println(input);
      				  System.err.println(date.getPrecision());
      				  System.err.println(gcal);
      			  }
      		  case YEAR:
      			result.setYear(gcal.getYear());
      		  }
      	  } else {
      		  result = gcal;
      	  }
      	  return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class getInputType() {
	      return java.util.Date.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class getOutputType() {
		return XMLGregorianCalendar.class;
	}

} //DateToXMLGregorianCalenderConversionImpl
