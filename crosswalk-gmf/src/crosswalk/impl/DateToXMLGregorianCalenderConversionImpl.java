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

    	  GregorianCalendar gcal = new GregorianCalendar();
    	  gcal.setTime((Date)input);
      	  if(input instanceof ImpreciseDate) {
        	  result = tf.newXMLGregorianCalendar();
      		  ImpreciseDate date = (ImpreciseDate)input;
      		  switch(date.getPrecision()) {
      		  case SECOND:
      			  result.setSecond(gcal.get(Calendar.SECOND));
      		  case MINUTE:
      			  result.setMinute(gcal.get(Calendar.MINUTE));
      		  case HOUR:
      			  result.setHour(gcal.get(Calendar.HOUR));
      		  case DAY:
      			  result.setDay(gcal.get(Calendar.DAY_OF_MONTH));
      		  case MONTH:
      			  result.setMonth(gcal.get(Calendar.MONTH));
      		  case YEAR:
      			result.setYear(gcal.get(Calendar.YEAR));
      		  }
      	  } else {
      		  result = tf.newXMLGregorianCalendar(gcal);
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
