/**
 */
package br.ufes.inf.mdc.mdc.impl;

import br.ufes.inf.mdc.mdc.Chatbot;
import br.ufes.inf.mdc.mdc.MdcFactory;
import br.ufes.inf.mdc.mdc.MdcPackage;
import br.ufes.inf.mdc.mdc.State;
import br.ufes.inf.mdc.mdc.StationaryState;
import br.ufes.inf.mdc.mdc.StationaryStateImpl;
import br.ufes.inf.mdc.mdc.TransactionalState;
import br.ufes.inf.mdc.mdc.TransactionalStateImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdcPackageImpl extends EPackageImpl implements MdcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chatbotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationaryStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionalStateImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationaryStateImplEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.ufes.inf.mdc.mdc.MdcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MdcPackageImpl() {
		super(eNS_URI, MdcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MdcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MdcPackage init() {
		if (isInited) return (MdcPackage)EPackage.Registry.INSTANCE.getEPackage(MdcPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMdcPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MdcPackageImpl theMdcPackage = registeredMdcPackage instanceof MdcPackageImpl ? (MdcPackageImpl)registeredMdcPackage : new MdcPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMdcPackage.createPackageContents();

		// Initialize created meta-data
		theMdcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMdcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MdcPackage.eNS_URI, theMdcPackage);
		return theMdcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChatbot() {
		return chatbotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChatbot_Name() {
		return (EAttribute)chatbotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChatbot_Token() {
		return (EAttribute)chatbotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChatbot_States() {
		return (EReference)chatbotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChatbot_InitState() {
		return (EReference)chatbotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Messages() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Input() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__EntryPoint() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionalState() {
		return transactionalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStationaryState() {
		return stationaryStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStationaryState_Transitions() {
		return (EReference)stationaryStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStationaryState_ErrorState() {
		return (EReference)stationaryStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStationaryState__Handler() {
		return stationaryStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStationaryState__SincTransitions() {
		return stationaryStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionalStateImpl() {
		return transactionalStateImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStationaryStateImpl() {
		return stationaryStateImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MdcFactory getMdcFactory() {
		return (MdcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		chatbotEClass = createEClass(CHATBOT);
		createEAttribute(chatbotEClass, CHATBOT__NAME);
		createEAttribute(chatbotEClass, CHATBOT__TOKEN);
		createEReference(chatbotEClass, CHATBOT__STATES);
		createEReference(chatbotEClass, CHATBOT__INIT_STATE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__MESSAGES);
		createEAttribute(stateEClass, STATE__INPUT);
		createEOperation(stateEClass, STATE___ENTRY_POINT);

		transactionalStateEClass = createEClass(TRANSACTIONAL_STATE);

		stationaryStateEClass = createEClass(STATIONARY_STATE);
		createEReference(stationaryStateEClass, STATIONARY_STATE__TRANSITIONS);
		createEReference(stationaryStateEClass, STATIONARY_STATE__ERROR_STATE);
		createEOperation(stationaryStateEClass, STATIONARY_STATE___HANDLER);
		createEOperation(stationaryStateEClass, STATIONARY_STATE___SINC_TRANSITIONS);

		transactionalStateImplEClass = createEClass(TRANSACTIONAL_STATE_IMPL);

		stationaryStateImplEClass = createEClass(STATIONARY_STATE_IMPL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transactionalStateEClass.getESuperTypes().add(this.getState());
		stationaryStateEClass.getESuperTypes().add(this.getState());
		transactionalStateImplEClass.getESuperTypes().add(this.getTransactionalState());
		stationaryStateImplEClass.getESuperTypes().add(this.getStationaryState());

		// Initialize classes, features, and operations; add parameters
		initEClass(chatbotEClass, Chatbot.class, "Chatbot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChatbot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Chatbot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChatbot_Token(), ecorePackage.getEString(), "token", null, 0, 1, Chatbot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChatbot_States(), this.getState(), null, "states", null, 1, -1, Chatbot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChatbot_InitState(), this.getStationaryState(), null, "initState", null, 1, 1, Chatbot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Messages(), ecorePackage.getEString(), "messages", null, 0, -1, State.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Input(), ecorePackage.getEString(), "input", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getState__EntryPoint(), ecorePackage.getEEList(), "entryPoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transactionalStateEClass, TransactionalState.class, "TransactionalState", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stationaryStateEClass, StationaryState.class, "StationaryState", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStationaryState_Transitions(), this.getState(), null, "transitions", null, 0, -1, StationaryState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStationaryState_ErrorState(), this.getTransactionalState(), null, "errorState", null, 1, 1, StationaryState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStationaryState__Handler(), this.getState(), "handler", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStationaryState__SincTransitions(), null, "sincTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transactionalStateImplEClass, TransactionalStateImpl.class, "TransactionalStateImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stationaryStateImplEClass, StationaryStateImpl.class, "StationaryStateImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MdcPackageImpl
