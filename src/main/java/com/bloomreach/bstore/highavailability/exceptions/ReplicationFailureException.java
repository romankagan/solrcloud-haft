/**
 * Copyright 2014-2015 BloomReach, Inc.
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

package com.bloomreach.bstore.highavailability.exceptions;

/**
 * Exception to indicate that there was a Replication Failure
 *
 * @author nitin
 * @since 6/26/2015
 */
public class ReplicationFailureException extends Exception {


  /**
   * Custom exception to indicate that there was a Replication Failure
   * Exception
   * @param message
   */
  public ReplicationFailureException(String message) {
    super(message);
  }

}
