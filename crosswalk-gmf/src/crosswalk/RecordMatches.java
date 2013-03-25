/**
 * Copyright 2010 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package crosswalk;

import gov.loc.mets.DivType;

import java.util.Map;
import java.util.Set;

/**
 * Captures the outcome of a record to div matching operation.
 * @author Gregory Jansen
 *
 */
public class RecordMatches {
    private Map<DivType, String> matches;
    private Map<String, Set<String>> recordCollisions;
    private Map<String, Set<DivType>> divCollisions;

    /**
     * @param matches2
     * @param recordCollisions
     * @param divCollisions
     */
    public RecordMatches(Map<DivType, String> matches2, Map<String, Set<String>> recordCollisions,
		    Map<String, Set<DivType>> divCollisions) {
	this.matches = matches2;
	this.recordCollisions = recordCollisions;
	this.divCollisions = divCollisions;
    }

    /**
     * The div and the record id that was matched to it.
     * @return
     */
    public Map<DivType, String> getMatches() {
        return matches;
    }

    /**
     * The record ids that had overlap in their match patterns.
     * @return
     */
    public Map<String, Set<String>> getRecordCollisions() {
        return recordCollisions;
    }

    /**
     * The divs that had overlap in their match patterns.
     * @return
     */
    public Map<String, Set<DivType>> getResourceCollisions() {
        return divCollisions;
    }

}
