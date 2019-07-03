/**
 */
package br.ufes.inf.mdc.mdc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stationary State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdc.mdc.StationaryState#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.StationaryState#getErrorState <em>Error State</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.mdc.mdc.MdcPackage#getStationaryState()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StationaryState extends State {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link br.ufes.inf.mdc.mdc.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getStationaryState_Transitions()
	 * @model derived="true"
	 * @generated
	 */
	EList<State> getTransitions();

	/**
	 * Returns the value of the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State</em>' reference.
	 * @see #setErrorState(TransactionalState)
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getStationaryState_ErrorState()
	 * @model required="true"
	 * @generated
	 */
	TransactionalState getErrorState();

	/**
	 * Sets the value of the '{@link br.ufes.inf.mdc.mdc.StationaryState#getErrorState <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error State</em>' reference.
	 * @see #getErrorState()
	 * @generated
	 */
	void setErrorState(TransactionalState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	State handler();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sincTransitions();

} // StationaryState
