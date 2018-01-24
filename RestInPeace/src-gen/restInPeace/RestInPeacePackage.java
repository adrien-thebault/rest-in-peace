/**
 */
package restInPeace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see restInPeace.RestInPeaceFactory
 * @model kind="package"
 * @generated
 */
public interface RestInPeacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restInPeace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/restInPeace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restInPeace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestInPeacePackage eINSTANCE = restInPeace.impl.RestInPeacePackageImpl.init();

	/**
	 * The meta object id for the '{@link restInPeace.impl.CommandRestImpl <em>Command Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restInPeace.impl.CommandRestImpl
	 * @see restInPeace.impl.RestInPeacePackageImpl#getCommandRest()
	 * @generated
	 */
	int COMMAND_REST = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Entry Formats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__ENTRY_FORMATS = 2;

	/**
	 * The feature id for the '<em><b>Output Formats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__OUTPUT_FORMATS = 3;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__NAME = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST__PATH = 7;

	/**
	 * The number of structural features of the '<em>Command Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Command Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restInPeace.impl.APIRestImpl <em>API Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restInPeace.impl.APIRestImpl
	 * @see restInPeace.impl.RestInPeacePackageImpl#getAPIRest()
	 * @generated
	 */
	int API_REST = 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REST__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REST__HOST = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REST__PORT = 2;

	/**
	 * The number of structural features of the '<em>API Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>API Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restInPeace.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restInPeace.impl.ParameterImpl
	 * @see restInPeace.impl.RestInPeacePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restInPeace.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restInPeace.impl.ResponseImpl
	 * @see restInPeace.impl.RestInPeacePackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restInPeace.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restInPeace.impl.PathImpl
	 * @see restInPeace.impl.RestInPeacePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATH = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restInPeace.Method <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restInPeace.Method
	 * @see restInPeace.impl.RestInPeacePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * Returns the meta object for class '{@link restInPeace.CommandRest <em>Command Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Rest</em>'.
	 * @see restInPeace.CommandRest
	 * @generated
	 */
	EClass getCommandRest();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.CommandRest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see restInPeace.CommandRest#getMethod()
	 * @see #getCommandRest()
	 * @generated
	 */
	EAttribute getCommandRest_Method();

	/**
	 * Returns the meta object for the containment reference '{@link restInPeace.CommandRest#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see restInPeace.CommandRest#getPath()
	 * @see #getCommandRest()
	 * @generated
	 */
	EReference getCommandRest_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link restInPeace.CommandRest#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see restInPeace.CommandRest#getParameters()
	 * @see #getCommandRest()
	 * @generated
	 */
	EReference getCommandRest_Parameters();

	/**
	 * Returns the meta object for the attribute list '{@link restInPeace.CommandRest#getEntryFormats <em>Entry Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entry Formats</em>'.
	 * @see restInPeace.CommandRest#getEntryFormats()
	 * @see #getCommandRest()
	 * @generated
	 */
	EAttribute getCommandRest_EntryFormats();

	/**
	 * Returns the meta object for the attribute list '{@link restInPeace.CommandRest#getOutputFormats <em>Output Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Formats</em>'.
	 * @see restInPeace.CommandRest#getOutputFormats()
	 * @see #getCommandRest()
	 * @generated
	 */
	EAttribute getCommandRest_OutputFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link restInPeace.CommandRest#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response</em>'.
	 * @see restInPeace.CommandRest#getResponse()
	 * @see #getCommandRest()
	 * @generated
	 */
	EReference getCommandRest_Response();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.CommandRest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see restInPeace.CommandRest#getDescription()
	 * @see #getCommandRest()
	 * @generated
	 */
	EAttribute getCommandRest_Description();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.CommandRest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restInPeace.CommandRest#getName()
	 * @see #getCommandRest()
	 * @generated
	 */
	EAttribute getCommandRest_Name();

	/**
	 * Returns the meta object for class '{@link restInPeace.APIRest <em>API Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Rest</em>'.
	 * @see restInPeace.APIRest
	 * @generated
	 */
	EClass getAPIRest();

	/**
	 * Returns the meta object for the containment reference list '{@link restInPeace.APIRest#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see restInPeace.APIRest#getCommands()
	 * @see #getAPIRest()
	 * @generated
	 */
	EReference getAPIRest_Commands();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.APIRest#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see restInPeace.APIRest#getHost()
	 * @see #getAPIRest()
	 * @generated
	 */
	EAttribute getAPIRest_Host();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.APIRest#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see restInPeace.APIRest#getPort()
	 * @see #getAPIRest()
	 * @generated
	 */
	EAttribute getAPIRest_Port();

	/**
	 * Returns the meta object for class '{@link restInPeace.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see restInPeace.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see restInPeace.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.Parameter#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see restInPeace.Parameter#getComment()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Comment();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restInPeace.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link restInPeace.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see restInPeace.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.Response#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see restInPeace.Response#getCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Code();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see restInPeace.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for class '{@link restInPeace.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see restInPeace.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link restInPeace.Path#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see restInPeace.Path#getPath()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Path();

	/**
	 * Returns the meta object for enum '{@link restInPeace.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method</em>'.
	 * @see restInPeace.Method
	 * @generated
	 */
	EEnum getMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestInPeaceFactory getRestInPeaceFactory();

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
		 * The meta object literal for the '{@link restInPeace.impl.CommandRestImpl <em>Command Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restInPeace.impl.CommandRestImpl
		 * @see restInPeace.impl.RestInPeacePackageImpl#getCommandRest()
		 * @generated
		 */
		EClass COMMAND_REST = eINSTANCE.getCommandRest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_REST__METHOD = eINSTANCE.getCommandRest_Method();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_REST__PATH = eINSTANCE.getCommandRest_Path();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_REST__PARAMETERS = eINSTANCE.getCommandRest_Parameters();

		/**
		 * The meta object literal for the '<em><b>Entry Formats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_REST__ENTRY_FORMATS = eINSTANCE.getCommandRest_EntryFormats();

		/**
		 * The meta object literal for the '<em><b>Output Formats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_REST__OUTPUT_FORMATS = eINSTANCE.getCommandRest_OutputFormats();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_REST__RESPONSE = eINSTANCE.getCommandRest_Response();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_REST__DESCRIPTION = eINSTANCE.getCommandRest_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_REST__NAME = eINSTANCE.getCommandRest_Name();

		/**
		 * The meta object literal for the '{@link restInPeace.impl.APIRestImpl <em>API Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restInPeace.impl.APIRestImpl
		 * @see restInPeace.impl.RestInPeacePackageImpl#getAPIRest()
		 * @generated
		 */
		EClass API_REST = eINSTANCE.getAPIRest();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_REST__COMMANDS = eINSTANCE.getAPIRest_Commands();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REST__HOST = eINSTANCE.getAPIRest_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REST__PORT = eINSTANCE.getAPIRest_Port();

		/**
		 * The meta object literal for the '{@link restInPeace.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restInPeace.impl.ParameterImpl
		 * @see restInPeace.impl.RestInPeacePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__COMMENT = eINSTANCE.getParameter_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link restInPeace.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restInPeace.impl.ResponseImpl
		 * @see restInPeace.impl.RestInPeacePackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__CODE = eINSTANCE.getResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '{@link restInPeace.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restInPeace.impl.PathImpl
		 * @see restInPeace.impl.RestInPeacePackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__PATH = eINSTANCE.getPath_Path();

		/**
		 * The meta object literal for the '{@link restInPeace.Method <em>Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restInPeace.Method
		 * @see restInPeace.impl.RestInPeacePackageImpl#getMethod()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMethod();

	}

} //RestInPeacePackage
