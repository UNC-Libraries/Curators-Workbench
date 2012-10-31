/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crosswalk.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crosswalk.CrosswalkPackage;
import crosswalk.DatePrecision;
import crosswalk.DateToISO8601StringConversion;
import crosswalk.util.ImpreciseDate;

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
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(DateToISO8601StringConversionImpl.class);
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
      		  LOG.debug("got imprecise date with precision: "+date.getPrecision());
      		  if(DatePrecision.YEAR.equals(date.getPrecision())) {
      			  return yearFormat.format(date);
      		  } else if(DatePrecision.MONTH.equals(date.getPrecision())) {
      			  return monthFormat.format(date);
      		  } else if(DatePrecision.DAY.equals(date.getPrecision())) {
      			  return dayFormat.format(date);
      		  } else if(DatePrecision.HOUR.equals(date.getPrecision())) {
      			  return hourFormat.format(date);
      		  } else if(DatePrecision.SECOND.equals(date.getPrecision())) {
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
