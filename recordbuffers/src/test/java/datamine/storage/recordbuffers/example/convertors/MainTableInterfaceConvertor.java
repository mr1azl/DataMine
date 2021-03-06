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
package datamine.storage.recordbuffers.example.convertors;

import datamine.storage.recordbuffers.example.interfaces.*;
import datamine.operator.UnaryOperatorInterface;
import datamine.storage.api.RecordBuilderInterface;
import java.util.*;


/**
 * DO NOT CHANGE! Auto-generated code
 */
public class MainTableInterfaceConvertor implements UnaryOperatorInterface<MainTableInterface, MainTableInterface> {

	private RecordBuilderInterface builder;

   public MainTableInterfaceConvertor(RecordBuilderInterface builder) {
   	this.builder = builder;
	}
	@Override
	public MainTableInterface apply(MainTableInterface input) {
		MainTableInterface output = builder.build(MainTableInterface.class);
		output.setLongRequiredColumn(input.getLongRequiredColumn());

		output.setIntSortedColumn(input.getIntSortedColumn());

		output.setByteColumn(input.getByteColumn());

		output.setBooleanColumn(input.isBooleanColumn());

		output.setShortColumn(input.getShortColumn());

		output.setFloatColumn(input.getFloatColumn());

		output.setDoubleColumn(input.getDoubleColumn());

		output.setStringColumn(input.getStringColumn());

		output.setBinaryColumn(input.getBinaryColumn());

		{
			List<FirstLevelNestedTableInterface> list = new ArrayList<FirstLevelNestedTableInterface>();
			FirstLevelNestedTableInterfaceConvertor convertor = new FirstLevelNestedTableInterfaceConvertor(builder);
			for (FirstLevelNestedTableInterface tuple: input.getNestedTableColumn()) {
				list.add(convertor.apply(tuple));
			}
			output.setNestedTableColumn(list);
		}
		{
			StructTableInterfaceConvertor convertor = new StructTableInterfaceConvertor(builder);
			if (input.getStructColumn() != null) {
       		output.setStructColumn(convertor.apply(input.getStructColumn()));
			}
		}
		output.setIntListColumn(input.getIntListColumn());


		return output;
	}

}

