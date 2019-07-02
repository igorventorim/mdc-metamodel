/**
 */
package br.ufes.inf.mdc.mdc.util;

import br.ufes.inf.mdc.mdc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.mdc.mdc.MdcPackage
 * @generated
 */
public class MdcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MdcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MdcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MdcSwitch<Adapter> modelSwitch =
		new MdcSwitch<Adapter>() {
			@Override
			public Adapter caseChatbot(Chatbot object) {
				return createChatbotAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransactionalState(TransactionalState object) {
				return createTransactionalStateAdapter();
			}
			@Override
			public Adapter caseStationaryState(StationaryState object) {
				return createStationaryStateAdapter();
			}
			@Override
			public Adapter caseTransactionalStateImpl(TransactionalStateImpl object) {
				return createTransactionalStateImplAdapter();
			}
			@Override
			public Adapter caseStationaryStateImpl(StationaryStateImpl object) {
				return createStationaryStateImplAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.mdc.mdc.Chatbot <em>Chatbot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.mdc.mdc.Chatbot
	 * @generated
	 */
	public Adapter createChatbotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.mdc.mdc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.mdc.mdc.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.mdc.mdc.TransactionalState <em>Transactional State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.mdc.mdc.TransactionalState
	 * @generated
	 */
	public Adapter createTransactionalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.mdc.mdc.StationaryState <em>Stationary State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.mdc.mdc.StationaryState
	 * @generated
	 */
	public Adapter createStationaryStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.mdc.mdc.TransactionalStateImpl <em>Transactional State Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.mdc.mdc.TransactionalStateImpl
	 * @generated
	 */
	public Adapter createTransactionalStateImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufes.inf.mdc.mdc.StationaryStateImpl <em>Stationary State Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufes.inf.mdc.mdc.StationaryStateImpl
	 * @generated
	 */
	public Adapter createStationaryStateImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MdcAdapterFactory
