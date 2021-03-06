/**
 * Copyright (C) 2016 Turn Inc. (yan.qi@turn.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package datamine.storage.recordbuffers.example.printers;

import datamine.storage.recordbuffers.example.interfaces.*;
import datamine.operator.UnaryOperatorInterface;


/**
 * DO NOT CHANGE! Auto-generated code
 */
public class StructTableInterfaceContentPrinter implements UnaryOperatorInterface<StructTableInterface, String> {

	@Override
	public String apply(StructTableInterface input) {
		StringBuffer out = new StringBuffer();
		out.append("{\n");
		{
			SecondLevelNestedTableInterfaceContentPrinter printer = new SecondLevelNestedTableInterfaceContentPrinter();
			out.append("nested_table_column = ").append("[").append("\n");
			for (SecondLevelNestedTableInterface tuple: input.getNestedTableColumn()) {
				out.append(printer.apply(tuple)).append("\n");
			}
			out.append("]").append("\n");
		}

		out.append("}");
		return out.toString();
	}

}

