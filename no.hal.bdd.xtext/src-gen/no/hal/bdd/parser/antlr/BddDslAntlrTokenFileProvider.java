/*
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BddDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("no/hal/bdd/parser/antlr/internal/InternalBddDsl.tokens");
	}
}
