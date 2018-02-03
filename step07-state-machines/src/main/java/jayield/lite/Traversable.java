/*
 * Copyright (c) 2017, Fernando Miguel Carvalho, mcarvalho@cc.isel.ipl.pt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jayield.lite;

import java.io.Serializable;

/**
 * Traverse all elements sequentially in bulk
 * in the current thread, until all elements have
 * been processed or throws an exception.
 *
 * @author Miguel Gamboa
 *         created on 04-06-2017
 */
public interface Traversable<T>  extends Serializable {
    void traverse(Yield<T> yield);
}
