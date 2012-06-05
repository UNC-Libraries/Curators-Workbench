/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import crosswalk.CrosswalkPackage;
import crosswalk.DateToISO8601StringConversion;
import crosswalk.util.ImpreciseDate;
import crosswalk.util.ImpreciseDate.DatePrecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date To ISO8601 String Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DateToISO8601StringConversionImpl extends EObjectImpl implements DateToISO8601StringConversion {
    //private static final SimpleDateFormat centuryFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    //private static final SimpleDateFormat decadeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static final SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat monthFormat = new SimpleDateFormat("yyyy-MM");
    private static final SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat hourFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH");
    private static final SimpleDateFormat minuteFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
    private static final SimpleDateFormat secondFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected DateToISO8601StringConversionImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return CrosswalkPackage.Literals.DATE_TO_ISO8601_STRING_CONVERSION;
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
      	  if(input instanceof ImpreciseDate) {
      		  ImpreciseDate date = (ImpreciseDate)input;
      		  System.out.println("got imprecise date with precision: "+date.getPrecision());
      		  if(DatePrecision.Year.equals(date.getPrecision())) {
      			  return yearFormat.format(date);
      		  } else if(DatePrecision.Month.equals(date.getPrecision())) {
      			  return monthFormat.format(date);
      		  } else if(DatePrecision.Day.equals(date.getPrecision())) {
      			  return dayFormat.format(date);
      		  } else if(DatePrecision.Hour.equals(date.getPrecision())) {
      			  return hourFormat.format(date);
      		  } else if(DatePrecision.Second.equals(date.getPrecision())) {
      			  return secondFormat.format(date);
      		  } else {
      			  return dayFormat.format(date);
      		  }
      	  }
           return dayFormat.format(input);
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
      return java.lang.String.class;
	}

} //DateToISO8601StringConversionImpl
