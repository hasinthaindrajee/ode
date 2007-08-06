/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ode.scheduler.simple;

/**
 * Exception thrown if an attempt has been made to commit a job that is no longer in the 
 * database. This can happen if multiple nodes through some bizarre bad luck happen to 
 * execute the same job. In any case, the second node will receive this exception which
 * will cause a roll-back of the transaction running the job.  
 * 
 * @author Maciej Szefler ( m s z e f l e r @ g m a i l . c o m )
 */
public class JobNoLongerInDbException extends Exception  {

    private static final long serialVersionUID = 1L;

    public JobNoLongerInDbException(String jobId, String nodeId) {
        super("Job no longer in db: "+ jobId + " nodeId=" + nodeId);
    }

}
