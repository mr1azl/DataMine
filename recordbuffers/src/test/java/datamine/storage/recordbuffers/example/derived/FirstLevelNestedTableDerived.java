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
package datamine.storage.recordbuffers.example.derived;

import datamine.storage.recordbuffers.example.interfaces.FirstLevelNestedTableDerivedValueInterface;
import datamine.storage.recordbuffers.example.interfaces.FirstLevelNestedTableInterface;

/**
 * @author yqi
 * @date Aug 11, 2015
 */
public class FirstLevelNestedTableDerived implements
		FirstLevelNestedTableDerivedValueInterface {

	private final FirstLevelNestedTableInterface flnti;
	
	public FirstLevelNestedTableDerived(FirstLevelNestedTableInterface input) {
		this.flnti = input;
	}

	@Override
	public String getStringDerivedColumn() {
		return "StringDerivedColumn@FirstLevelNestedTable";
	}

}
