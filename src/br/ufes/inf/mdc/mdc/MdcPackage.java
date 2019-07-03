/**
 */
package br.ufes.inf.mdc.mdc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufes.inf.mdc.mdc.MdcFactory
 * @model kind="package"
 * @generated
 */
public interface MdcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdc.ufes.br";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mdc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdcPackage eINSTANCE = br.ufes.inf.mdc.mdc.impl.MdcPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl <em>Chatbot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.mdc.mdc.impl.ChatbotImpl
	 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getChatbot()
	 * @generated
	 */
	int CHATBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHATBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHATBOT__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHATBOT__STATES = 2;

	/**
	 * The number of structural features of the '<em>Chatbot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHATBOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Chatbot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHATBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.mdc.mdc.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.mdc.mdc.State
	 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Entry Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ENTRY_POINT = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.ufes.inf.mdc.mdc.TransactionalState <em>Transactional State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.mdc.mdc.TransactionalState
	 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getTransactionalState()
	 * @generated
	 */
	int TRANSACTIONAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE__MESSAGES = STATE__MESSAGES;

	/**
	 * The number of structural features of the '<em>Transactional State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entry Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE___ENTRY_POINT = STATE___ENTRY_POINT;

	/**
	 * The number of operations of the '<em>Transactional State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.mdc.mdc.StationaryState <em>Stationary State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.mdc.mdc.StationaryState
	 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getStationaryState()
	 * @generated
	 */
	int STATIONARY_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE__MESSAGES = STATE__MESSAGES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE__TRANSITIONS = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE__ERROR_STATE = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stationary State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Entry Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE___ENTRY_POINT = STATE___ENTRY_POINT;

	/**
	 * The operation id for the '<em>Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE___HANDLER = STATE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Sinc Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE___SINC_TRANSITIONS = STATE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stationary State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.ufes.inf.mdc.mdc.impl.TransactionalStateImplImpl <em>Transactional State Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.mdc.mdc.impl.TransactionalStateImplImpl
	 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getTransactionalStateImpl()
	 * @generated
	 */
	int TRANSACTIONAL_STATE_IMPL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_IMPL__NAME = TRANSACTIONAL_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_IMPL__MESSAGES = TRANSACTIONAL_STATE__MESSAGES;

	/**
	 * The number of structural features of the '<em>Transactional State Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_IMPL_FEATURE_COUNT = TRANSACTIONAL_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entry Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_IMPL___ENTRY_POINT = TRANSACTIONAL_STATE___ENTRY_POINT;

	/**
	 * The number of operations of the '<em>Transactional State Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_STATE_IMPL_OPERATION_COUNT = TRANSACTIONAL_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl <em>Stationary State Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl
	 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getStationaryStateImpl()
	 * @generated
	 */
	int STATIONARY_STATE_IMPL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL__NAME = STATIONARY_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL__MESSAGES = STATIONARY_STATE__MESSAGES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL__TRANSITIONS = STATIONARY_STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL__ERROR_STATE = STATIONARY_STATE__ERROR_STATE;

	/**
	 * The number of structural features of the '<em>Stationary State Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL_FEATURE_COUNT = STATIONARY_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entry Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL___ENTRY_POINT = STATIONARY_STATE___ENTRY_POINT;

	/**
	 * The operation id for the '<em>Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL___HANDLER = STATIONARY_STATE___HANDLER;

	/**
	 * The operation id for the '<em>Sinc Transitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL___SINC_TRANSITIONS = STATIONARY_STATE___SINC_TRANSITIONS;

	/**
	 * The number of operations of the '<em>Stationary State Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONARY_STATE_IMPL_OPERATION_COUNT = STATIONARY_STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.ufes.inf.mdc.mdc.Chatbot <em>Chatbot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chatbot</em>'.
	 * @see br.ufes.inf.mdc.mdc.Chatbot
	 * @generated
	 */
	EClass getChatbot();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.mdc.mdc.Chatbot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.mdc.mdc.Chatbot#getName()
	 * @see #getChatbot()
	 * @generated
	 */
	EAttribute getChatbot_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.mdc.mdc.Chatbot#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see br.ufes.inf.mdc.mdc.Chatbot#getToken()
	 * @see #getChatbot()
	 * @generated
	 */
	EAttribute getChatbot_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufes.inf.mdc.mdc.Chatbot#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see br.ufes.inf.mdc.mdc.Chatbot#getStates()
	 * @see #getChatbot()
	 * @generated
	 */
	EReference getChatbot_States();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.mdc.mdc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see br.ufes.inf.mdc.mdc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link br.ufes.inf.mdc.mdc.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufes.inf.mdc.mdc.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute list '{@link br.ufes.inf.mdc.mdc.State#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Messages</em>'.
	 * @see br.ufes.inf.mdc.mdc.State#getMessages()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Messages();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.mdc.mdc.State#entryPoint() <em>Entry Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entry Point</em>' operation.
	 * @see br.ufes.inf.mdc.mdc.State#entryPoint()
	 * @generated
	 */
	EOperation getState__EntryPoint();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.mdc.mdc.TransactionalState <em>Transactional State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactional State</em>'.
	 * @see br.ufes.inf.mdc.mdc.TransactionalState
	 * @generated
	 */
	EClass getTransactionalState();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.mdc.mdc.StationaryState <em>Stationary State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stationary State</em>'.
	 * @see br.ufes.inf.mdc.mdc.StationaryState
	 * @generated
	 */
	EClass getStationaryState();

	/**
	 * Returns the meta object for the reference list '{@link br.ufes.inf.mdc.mdc.StationaryState#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see br.ufes.inf.mdc.mdc.StationaryState#getTransitions()
	 * @see #getStationaryState()
	 * @generated
	 */
	EReference getStationaryState_Transitions();

	/**
	 * Returns the meta object for the reference '{@link br.ufes.inf.mdc.mdc.StationaryState#getErrorState <em>Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error State</em>'.
	 * @see br.ufes.inf.mdc.mdc.StationaryState#getErrorState()
	 * @see #getStationaryState()
	 * @generated
	 */
	EReference getStationaryState_ErrorState();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.mdc.mdc.StationaryState#handler() <em>Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handler</em>' operation.
	 * @see br.ufes.inf.mdc.mdc.StationaryState#handler()
	 * @generated
	 */
	EOperation getStationaryState__Handler();

	/**
	 * Returns the meta object for the '{@link br.ufes.inf.mdc.mdc.StationaryState#sincTransitions() <em>Sinc Transitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sinc Transitions</em>' operation.
	 * @see br.ufes.inf.mdc.mdc.StationaryState#sincTransitions()
	 * @generated
	 */
	EOperation getStationaryState__SincTransitions();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.mdc.mdc.TransactionalStateImpl <em>Transactional State Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactional State Impl</em>'.
	 * @see br.ufes.inf.mdc.mdc.TransactionalStateImpl
	 * @generated
	 */
	EClass getTransactionalStateImpl();

	/**
	 * Returns the meta object for class '{@link br.ufes.inf.mdc.mdc.StationaryStateImpl <em>Stationary State Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stationary State Impl</em>'.
	 * @see br.ufes.inf.mdc.mdc.StationaryStateImpl
	 * @generated
	 */
	EClass getStationaryStateImpl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdcFactory getMdcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufes.inf.mdc.mdc.impl.ChatbotImpl <em>Chatbot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.mdc.mdc.impl.ChatbotImpl
		 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getChatbot()
		 * @generated
		 */
		EClass CHATBOT = eINSTANCE.getChatbot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHATBOT__NAME = eINSTANCE.getChatbot_Name();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHATBOT__TOKEN = eINSTANCE.getChatbot_Token();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHATBOT__STATES = eINSTANCE.getChatbot_States();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.mdc.mdc.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.mdc.mdc.State
		 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__MESSAGES = eINSTANCE.getState_Messages();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___ENTRY_POINT = eINSTANCE.getState__EntryPoint();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.mdc.mdc.TransactionalState <em>Transactional State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.mdc.mdc.TransactionalState
		 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getTransactionalState()
		 * @generated
		 */
		EClass TRANSACTIONAL_STATE = eINSTANCE.getTransactionalState();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.mdc.mdc.StationaryState <em>Stationary State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.mdc.mdc.StationaryState
		 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getStationaryState()
		 * @generated
		 */
		EClass STATIONARY_STATE = eINSTANCE.getStationaryState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIONARY_STATE__TRANSITIONS = eINSTANCE.getStationaryState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Error State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIONARY_STATE__ERROR_STATE = eINSTANCE.getStationaryState_ErrorState();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIONARY_STATE___HANDLER = eINSTANCE.getStationaryState__Handler();

		/**
		 * The meta object literal for the '<em><b>Sinc Transitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIONARY_STATE___SINC_TRANSITIONS = eINSTANCE.getStationaryState__SincTransitions();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.mdc.mdc.impl.TransactionalStateImplImpl <em>Transactional State Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.mdc.mdc.impl.TransactionalStateImplImpl
		 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getTransactionalStateImpl()
		 * @generated
		 */
		EClass TRANSACTIONAL_STATE_IMPL = eINSTANCE.getTransactionalStateImpl();

		/**
		 * The meta object literal for the '{@link br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl <em>Stationary State Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufes.inf.mdc.mdc.impl.StationaryStateImplImpl
		 * @see br.ufes.inf.mdc.mdc.impl.MdcPackageImpl#getStationaryStateImpl()
		 * @generated
		 */
		EClass STATIONARY_STATE_IMPL = eINSTANCE.getStationaryStateImpl();

	}

} //MdcPackage
