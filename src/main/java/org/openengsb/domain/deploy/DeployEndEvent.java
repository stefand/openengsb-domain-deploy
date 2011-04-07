/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.domain.deploy;

import org.openengsb.core.api.Event;

public class DeployEndEvent extends Event {
    private String output;
    private String deployId;

    public DeployEndEvent() {
    }

    public DeployEndEvent(String deployId, String output) {
        this.deployId = deployId;
        this.output = output;
    }

    public DeployEndEvent(long processId, String output) {
        super(processId);
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public String getDeployId() {
        return deployId;
    }

}
