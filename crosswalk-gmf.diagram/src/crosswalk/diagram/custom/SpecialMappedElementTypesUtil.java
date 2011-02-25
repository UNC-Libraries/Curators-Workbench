/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk.diagram.custom;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.SpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import crosswalk.CrossWalk;
import crosswalk.CrosswalkPackage;
import crosswalk.MappedElement;
import crosswalk.diagram.providers.CrosswalkElementTypes;

/**
 * @author Gregory Jansen
 *
 */
public class SpecialMappedElementTypesUtil {
    private static IElementType mappedElementType = CrosswalkElementTypes.MappedElement_3015;
    private static IElementType[] types = new IElementType[] {CrosswalkElementTypes.MappedElement_3015,
	CrosswalkElementTypes.MappedElement_2016 };

    public static List<ISpecializationType> getMappedElementTypesforEClass(EClass c) {
	//System.out.println("model assistant found this output class on crosswalk: " + c);
	List<ISpecializationType> result = new ArrayList<ISpecializationType>();
	for (EReference ref : c.getEAllReferences()) {
	    //System.out.println("has reference: " + ref);
	    String id = mappedElementType.getId() + ":"+ ref.getEContainingClass().getClassifierID()+ ":" + ref.getFeatureID();
	    URL iconURL = Platform.getBundle("crosswalk-gmf.diagram").getResource("/icons/property_obj.gif");
	    System.out.println(iconURL);
	    String displayName = ref.getEType().getName();
	    IElementMatcher matcher = new MappedElementMatcher(ref);
	    IContainerDescriptor descriptor = new MappedElementContainerDescriptor(ref);
	    IEditHelperAdvice editHelperAdvice = new MappedElementEditHelperAdvice();
	    ISpecializationType spec = new SpecializationType(id, iconURL, displayName, types, matcher, descriptor, editHelperAdvice);
	    boolean added = ElementTypeRegistry.getInstance().register(spec);
	    if(added) {
		System.out.println("added specialization: "+spec);
	    }
	    result.add(spec);
	}
	return result;
    }

    public static class MappedElementContainerDescriptor implements IContainerDescriptor {
	EReference[] features = new EReference[] { CrosswalkPackage.eINSTANCE.getCrossWalk_Elements(), CrosswalkPackage.eINSTANCE.getMappedElement_ChildElements()};
	EReference ref = null;
	private IElementMatcher elementMatcher;

	public MappedElementContainerDescriptor(final EReference ref) {
	    super();
	    this.ref = ref;
	    this.elementMatcher = new IElementMatcher() {

		@Override
		public boolean matches(EObject eObject) {
		    // eObject will be a MappedElement or a CrossWalk
		    if(eObject instanceof CrossWalk) {
			CrossWalk cw = (CrossWalk)eObject;
			return ref.getEContainingClass().equals(cw.getOutputType());
		    } else if(eObject instanceof MappedElement) {
			MappedElement me = (MappedElement)eObject;
			return ref.getEContainingClass().equals(me.getMappedFeature().getEType());
		    }
		    return false;
		}

	    };
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor#getMatcher()
	 */
	@Override
	public IElementMatcher getMatcher() {
	    return this.elementMatcher;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor#getContainmentFeatures()
	 */
	@Override
	public EReference[] getContainmentFeatures() {
	    return features;
	}
    }

    public static class MappedElementMatcher implements IElementMatcher {
	EReference ref = null;

	public MappedElementMatcher(EReference ref) {
	    super();
	    this.ref = ref;
	}

	@Override
	public boolean matches(EObject eObject) {
	    boolean result = false;
	    if(eObject instanceof MappedElement) {
		MappedElement me = (MappedElement)eObject;
		result = ref.equals(me.getMappedFeature());
	    }
	    return result;
	}

    }

    public static class MappedElementEditHelperAdvice implements IEditHelperAdvice {

        @Override
        public ICommand getBeforeEditCommand(IEditCommandRequest request) {
    	// TODO Auto-generated method stub
    	return null;
        }

        @Override
        public ICommand getAfterEditCommand(IEditCommandRequest request) {
    	// TODO Auto-generated method stub
    	return null;
        }

        @Override
        public void configureRequest(IEditCommandRequest request) {
    	// TODO Auto-generated method stub

        }

        @Override
        public boolean approveRequest(IEditCommandRequest request) {
    	// TODO Auto-generated method stub
    	return true;
        }
    };
}
