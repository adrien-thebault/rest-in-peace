/**
 */
package restInPeace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import restInPeace.CommandRest;
import restInPeace.Method;
import restInPeace.Parameter;
import restInPeace.Response;
import restInPeace.RestInPeacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restInPeace.impl.CommandRestImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link restInPeace.impl.CommandRestImpl#getPath <em>Path</em>}</li>
 *   <li>{@link restInPeace.impl.CommandRestImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link restInPeace.impl.CommandRestImpl#getEntryFormats <em>Entry Formats</em>}</li>
 *   <li>{@link restInPeace.impl.CommandRestImpl#getOutputFormats <em>Output Formats</em>}</li>
 *   <li>{@link restInPeace.impl.CommandRestImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandRestImpl extends MinimalEObjectImpl.Container implements CommandRest {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method METHOD_EDEFAULT = Method.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getEntryFormats() <em>Entry Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entryFormats;

	/**
	 * The cached value of the '{@link #getOutputFormats() <em>Output Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputFormats;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestInPeacePackage.Literals.COMMAND_REST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestInPeacePackage.COMMAND_REST__METHOD, oldMethod,
					method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestInPeacePackage.COMMAND_REST__PATH, oldPath,
					path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					RestInPeacePackage.COMMAND_REST__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEntryFormats() {
		if (entryFormats == null) {
			entryFormats = new EDataTypeUniqueEList<String>(String.class, this,
					RestInPeacePackage.COMMAND_REST__ENTRY_FORMATS);
		}
		return entryFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutputFormats() {
		if (outputFormats == null) {
			outputFormats = new EDataTypeUniqueEList<String>(String.class, this,
					RestInPeacePackage.COMMAND_REST__OUTPUT_FORMATS);
		}
		return outputFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponse() {
		if (response == null) {
			response = new EObjectContainmentEList<Response>(Response.class, this,
					RestInPeacePackage.COMMAND_REST__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RestInPeacePackage.COMMAND_REST__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case RestInPeacePackage.COMMAND_REST__RESPONSE:
			return ((InternalEList<?>) getResponse()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RestInPeacePackage.COMMAND_REST__METHOD:
			return getMethod();
		case RestInPeacePackage.COMMAND_REST__PATH:
			return getPath();
		case RestInPeacePackage.COMMAND_REST__PARAMETERS:
			return getParameters();
		case RestInPeacePackage.COMMAND_REST__ENTRY_FORMATS:
			return getEntryFormats();
		case RestInPeacePackage.COMMAND_REST__OUTPUT_FORMATS:
			return getOutputFormats();
		case RestInPeacePackage.COMMAND_REST__RESPONSE:
			return getResponse();
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
		case RestInPeacePackage.COMMAND_REST__METHOD:
			setMethod((Method) newValue);
			return;
		case RestInPeacePackage.COMMAND_REST__PATH:
			setPath((String) newValue);
			return;
		case RestInPeacePackage.COMMAND_REST__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case RestInPeacePackage.COMMAND_REST__ENTRY_FORMATS:
			getEntryFormats().clear();
			getEntryFormats().addAll((Collection<? extends String>) newValue);
			return;
		case RestInPeacePackage.COMMAND_REST__OUTPUT_FORMATS:
			getOutputFormats().clear();
			getOutputFormats().addAll((Collection<? extends String>) newValue);
			return;
		case RestInPeacePackage.COMMAND_REST__RESPONSE:
			getResponse().clear();
			getResponse().addAll((Collection<? extends Response>) newValue);
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
		case RestInPeacePackage.COMMAND_REST__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case RestInPeacePackage.COMMAND_REST__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case RestInPeacePackage.COMMAND_REST__PARAMETERS:
			getParameters().clear();
			return;
		case RestInPeacePackage.COMMAND_REST__ENTRY_FORMATS:
			getEntryFormats().clear();
			return;
		case RestInPeacePackage.COMMAND_REST__OUTPUT_FORMATS:
			getOutputFormats().clear();
			return;
		case RestInPeacePackage.COMMAND_REST__RESPONSE:
			getResponse().clear();
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
		case RestInPeacePackage.COMMAND_REST__METHOD:
			return method != METHOD_EDEFAULT;
		case RestInPeacePackage.COMMAND_REST__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case RestInPeacePackage.COMMAND_REST__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case RestInPeacePackage.COMMAND_REST__ENTRY_FORMATS:
			return entryFormats != null && !entryFormats.isEmpty();
		case RestInPeacePackage.COMMAND_REST__OUTPUT_FORMATS:
			return outputFormats != null && !outputFormats.isEmpty();
		case RestInPeacePackage.COMMAND_REST__RESPONSE:
			return response != null && !response.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (method: ");
		result.append(method);
		result.append(", path: ");
		result.append(path);
		result.append(", entryFormats: ");
		result.append(entryFormats);
		result.append(", outputFormats: ");
		result.append(outputFormats);
		result.append(')');
		return result.toString();
	}

} //CommandRestImpl
