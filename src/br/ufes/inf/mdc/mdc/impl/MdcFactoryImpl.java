/**
 */
package br.ufes.inf.mdc.mdc.impl;

import br.ufes.inf.mdc.mdc.Chatbot;
import br.ufes.inf.mdc.mdc.MdcFactory;
import br.ufes.inf.mdc.mdc.MdcPackage;
import br.ufes.inf.mdc.mdc.StationaryStateImpl;
import br.ufes.inf.mdc.mdc.TransactionalStateImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdcFactoryImpl extends EFactoryImpl implements MdcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdcFactory init() {
		try {
			MdcFactory theMdcFactory = (MdcFactory)EPackage.Registry.INSTANCE.getEFactory(MdcPackage.eNS_URI);
			if (theMdcFactory != null) {
				return theMdcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MdcPackage.CHATBOT: return createChatbot();
			case MdcPackage.TRANSACTIONAL_STATE_IMPL: return createTransactionalStateImpl();
			case MdcPackage.STATIONARY_STATE_IMPL: return createStationaryStateImpl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chatbot createChatbot() {
		ChatbotImpl chatbot = new ChatbotImpl();
		return chatbot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionalStateImpl createTransactionalStateImpl() {
		TransactionalStateImplImpl transactionalStateImpl = new TransactionalStateImplImpl();
		return transactionalStateImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StationaryStateImpl createStationaryStateImpl() {
		StationaryStateImplImpl stationaryStateImpl = new StationaryStateImplImpl();
		return stationaryStateImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MdcPackage getMdcPackage() {
		return (MdcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdcPackage getPackage() {
		return MdcPackage.eINSTANCE;
	}

} //MdcFactoryImpl
