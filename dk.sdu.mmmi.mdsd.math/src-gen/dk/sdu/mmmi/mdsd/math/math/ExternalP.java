/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math.math;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.math.ExternalP#getRef <em>Ref</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.math.ExternalP#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.math.MathPackage#getExternalP()
 * @model
 * @generated
 */
public interface ExternalP extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Ext)
   * @see dk.sdu.mmmi.mdsd.math.math.MathPackage#getExternalP_Ref()
   * @model
   * @generated
   */
  Ext getRef();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.math.ExternalP#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Ext value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.math.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.math.MathPackage#getExternalP_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // ExternalP
