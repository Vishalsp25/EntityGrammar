/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.ActionRef#getVerb <em>Verb</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.ActionRef#getArgument <em>Argument</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.ActionRef#getPreposition <em>Preposition</em>}</li>
 * </ul>
 *
 * @see no.hal.bdd.bddDsl.BddDslPackage#getActionRef()
 * @model
 * @generated
 */
public interface ActionRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Verb</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verb</em>' reference.
   * @see #setVerb(ActionDef)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getActionRef_Verb()
   * @model
   * @generated
   */
  ActionDef getVerb();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.ActionRef#getVerb <em>Verb</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verb</em>' reference.
   * @see #getVerb()
   * @generated
   */
  void setVerb(ActionDef value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(PropertyValue)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getActionRef_Argument()
   * @model containment="true"
   * @generated
   */
  PropertyValue getArgument();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.ActionRef#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(PropertyValue value);

  /**
   * Returns the value of the '<em><b>Preposition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preposition</em>' attribute.
   * @see #setPreposition(String)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getActionRef_Preposition()
   * @model
   * @generated
   */
  String getPreposition();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.ActionRef#getPreposition <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preposition</em>' attribute.
   * @see #getPreposition()
   * @generated
   */
  void setPreposition(String value);

} // ActionRef
