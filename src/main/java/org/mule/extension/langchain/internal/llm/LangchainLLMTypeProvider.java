package org.mule.extension.langchain.internal.llm;

import java.util.Set;

import org.mule.runtime.api.value.Value;
import org.mule.runtime.extension.api.values.ValueBuilder;
import org.mule.runtime.extension.api.values.ValueProvider;
import org.mule.runtime.extension.api.values.ValueResolvingException;

public class LangchainLLMTypeProvider implements ValueProvider {

	@Override
	public Set<Value> resolve() throws ValueResolvingException {
		// TODO Auto-generated method stub
		return ValueBuilder.getValuesFor("OPENAI","MISTRAL_AI","OLLAMA","ANTHROPIC",
												"AWS_BEDROCK", "AZURE_OPENAI");
	}

}
 