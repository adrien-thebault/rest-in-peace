/**
 */
package restInPeace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restInPeace.CommandRest#getMethod <em>Method</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getPath <em>Path</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getParameters <em>Parameters</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getEntryFormats <em>Entry Formats</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getOutputFormats <em>Output Formats</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getResponse <em>Response</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getDescription <em>Description</em>}</li>
 *   <li>{@link restInPeace.CommandRest#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see restInPeace.RestInPeacePackage#getCommandRest()
 * @model
 * @generated
 */
public interface CommandRest extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"GET"</code>.
	 * The literals are from the enumeration {@link restInPeace.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see restInPeace.Method
	 * @see #setMethod(Method)
	 * @see restInPeace.RestInPeacePackage#getCommandRest_Method()
	 * @model default="GET" required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link restInPeace.CommandRest#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see restInPeace.Method
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see restInPeace.RestInPeacePackage#getCommandRest_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link restInPeace.CommandRest#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link restInPeace.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see restInPeace.RestInPeacePackage#getCommandRest_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Entry Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Formats</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Formats</em>' attribute list.
	 * @see restInPeace.RestInPeacePackage#getCommandRest_EntryFormats()
	 * @model
	 * @generated
	 */
	EList<String> getEntryFormats();

	/**
	 * Returns the value of the '<em><b>Output Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Formats</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Formats</em>' attribute list.
	 * @see restInPeace.RestInPeacePackage#getCommandRest_OutputFormats()
	 * @model
	 * @generated
	 */
	EList<String> getOutputFormats();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link restInPeace.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see restInPeace.RestInPeacePackage#getCommandRest_Response()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponse();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see restInPeace.RestInPeacePackage#getCommandRest_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link restInPeace.CommandRest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see restInPeace.RestInPeacePackage#getCommandRest_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link restInPeace.CommandRest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CommandRest
