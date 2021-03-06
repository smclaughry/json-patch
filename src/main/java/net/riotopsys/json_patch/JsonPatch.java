/*
 Copyright 2014 C. A. Fitzgerald

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package net.riotopsys.json_patch;

import com.google.gson.JsonElement;
import net.riotopsys.json_patch.operation.AbsOperation;

import java.util.LinkedList;

/**
 * Created by afitzgerald on 8/4/14.
 */
public class JsonPatch extends LinkedList<AbsOperation> {

    public JsonElement apply(JsonElement original) {
        JsonElement result = original;
        for ( AbsOperation operation: this){
            result = operation.apply(result);
        }
        return result;
    }

}
