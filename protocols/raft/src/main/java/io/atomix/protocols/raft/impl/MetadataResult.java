/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.protocols.raft.impl;

import io.atomix.protocols.raft.session.RaftSessionMetadata;

import java.util.Set;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Metadata result.
 */
public final class MetadataResult {
  final Set<RaftSessionMetadata> sessions;

  MetadataResult(Set<RaftSessionMetadata> sessions) {
    this.sessions = sessions;
  }

  /**
   * Returns the session metadata.
   *
   * @return The session metadata.
   */
  public Set<RaftSessionMetadata> sessions() {
    return sessions;
  }

  @Override
  public String toString() {
    return toStringHelper(this)
        .add("sessions", sessions)
        .toString();
  }
}
