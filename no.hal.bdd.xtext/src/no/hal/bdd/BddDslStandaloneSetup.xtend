/*
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BddDslStandaloneSetup extends BddDslStandaloneSetupGenerated {

	def static void doSetup() {
		new BddDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
