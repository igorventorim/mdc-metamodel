/**
 */
package br.ufes.inf.mdc.mdc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chatbot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.mdc.mdc.Chatbot#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.Chatbot#getToken <em>Token</em>}</li>
 *   <li>{@link br.ufes.inf.mdc.mdc.Chatbot#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.mdc.mdc.MdcPackage#getChatbot()
 * @model
 * @generated
 */
public interface Chatbot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getChatbot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.mdc.mdc.Chatbot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getChatbot_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link br.ufes.inf.mdc.mdc.Chatbot#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.mdc.mdc.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#getChatbot_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Chatbot
