/**
 */
package br.ufes.inf.mdc.mdc.impl;

import br.ufes.inf.mdc.mdc.MdcPackage;
import br.ufes.inf.mdc.mdc.State;
import br.ufes.inf.mdc.mdc.StationaryStateImpl;
import br.ufes.inf.mdc.mdc.TransactionalState;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stationary State Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl#getInput <em>Input</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl#getErrorState <em>Error State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationaryStateImplImpl extends MinimalEObjectImpl.Container implements StationaryStateImpl {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messages;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> input;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<State> transitions;

	/**
	 * The cached value of the '{@link #getErrorState() <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorState()
	 * @generated
	 * @ordered
	 */
	protected TransactionalState errorState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationaryStateImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdcPackage.Literals.STATIONARY_STATE_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.STATIONARY_STATE_IMPL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMessages() {
		if (messages == null) {
			messages = new EDataTypeUniqueEList<String>(String.class, this, MdcPackage.STATIONARY_STATE_IMPL__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInput() {
		if (input == null) {
			input = new EDataTypeUniqueEList<String>(String.class, this, MdcPackage.STATIONARY_STATE_IMPL__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectResolvingEList<State>(State.class, this, MdcPackage.STATIONARY_STATE_IMPL__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionalState getErrorState() {
		if (errorState != null && errorState.eIsProxy()) {
			InternalEObject oldErrorState = (InternalEObject)errorState;
			errorState = (TransactionalState)eResolveProxy(oldErrorState);
			if (errorState != oldErrorState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdcPackage.STATIONARY_STATE_IMPL__ERROR_STATE, oldErrorState, errorState));
			}
		}
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionalState basicGetErrorState() {
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorState(TransactionalState newErrorState) {
		TransactionalState oldErrorState = errorState;
		errorState = newErrorState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdcPackage.STATIONARY_STATE_IMPL__ERROR_STATE, oldErrorState, errorState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State handler() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void sincTransitions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList entryPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdcPackage.STATIONARY_STATE_IMPL__NAME:
				return getName();
			case MdcPackage.STATIONARY_STATE_IMPL__MESSAGES:
				return getMessages();
			case MdcPackage.STATIONARY_STATE_IMPL__INPUT:
				return getInput();
			case MdcPackage.STATIONARY_STATE_IMPL__TRANSITIONS:
				return getTransitions();
			case MdcPackage.STATIONARY_STATE_IMPL__ERROR_STATE:
				if (resolve) return getErrorState();
				return basicGetErrorState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdcPackage.STATIONARY_STATE_IMPL__NAME:
				setName((String)newValue);
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends String>)newValue);
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends String>)newValue);
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends State>)newValue);
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__ERROR_STATE:
				setErrorState((TransactionalState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdcPackage.STATIONARY_STATE_IMPL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__MESSAGES:
				getMessages().clear();
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__INPUT:
				getInput().clear();
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__TRANSITIONS:
				getTransitions().clear();
				return;
			case MdcPackage.STATIONARY_STATE_IMPL__ERROR_STATE:
				setErrorState((TransactionalState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdcPackage.STATIONARY_STATE_IMPL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdcPackage.STATIONARY_STATE_IMPL__MESSAGES:
				return messages != null && !messages.isEmpty();
			case MdcPackage.STATIONARY_STATE_IMPL__INPUT:
				return input != null && !input.isEmpty();
			case MdcPackage.STATIONARY_STATE_IMPL__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case MdcPackage.STATIONARY_STATE_IMPL__ERROR_STATE:
				return errorState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MdcPackage.STATIONARY_STATE_IMPL___HANDLER:
				return handler();
			case MdcPackage.STATIONARY_STATE_IMPL___SINC_TRANSITIONS:
				sincTransitions();
				return null;
			case MdcPackage.STATIONARY_STATE_IMPL___ENTRY_POINT:
				return entryPoint();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", messages: ");
		result.append(messages);
		result.append(", input: ");
		result.append(input);
		result.append(')');
		return result.toString();
	}

} //StationaryStateImplImpl
