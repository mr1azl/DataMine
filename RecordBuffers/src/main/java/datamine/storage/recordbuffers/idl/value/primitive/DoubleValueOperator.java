/**
 * Copyright (C) 2015 Turn Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package datamine.storage.recordbuffers.idl.value.primitive;

import java.nio.ByteBuffer;

/**
 * 
 * The operation is defined for the double type. 
 * 
 * <p> 
 * Note that a valid double number should be smaller than 1E20. 
 * </p>
 * 
 * @author yqi
 */
final public class DoubleValueOperator extends AbstractPrimitiveValueOperator {

	public DoubleValueOperator() {
		super(8);
	}

	@Override
	public boolean isValid(Object value) {
		Double dVal = (Double) value;
		return !(dVal.isInfinite() || dVal.isNaN() || dVal > 1E20);
	}

	@Override
	public byte[] getByteArray(Object value) {
		ByteBuffer buf = ByteBuffer.allocate(8);
		return buf.putDouble((Double) value).array();
	}

	@Override
	public Object getValue(ByteBuffer buf, int index, int length) {
		if (index >= 0 && length > 0) {
			return buf.getDouble(index);
		} 
		return null;
	}
}