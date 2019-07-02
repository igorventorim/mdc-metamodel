/**
 */
package br.ufes.inf.mdc.mdc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.mdc.mdc.MdcPackage
 * @generated
 */
public interface MdcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdcFactory eINSTANCE = br.ufes.inf.mdc.mdc.impl.MdcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Chatbot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chatbot</em>'.
	 * @generated
	 */
	Chatbot createChatbot();

	/**
	 * Returns a new object of class '<em>Transactional State Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transactional State Impl</em>'.
	 * @generated
	 */
	TransactionalStateImpl createTransactionalStateImpl();

	/**
	 * Returns a new object of class '<em>Stationary State Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stationary State Impl</em>'.
	 * @generated
	 */
	StationaryStateImpl createStationaryStateImpl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MdcPackage getMdcPackage();

} //MdcFactory
