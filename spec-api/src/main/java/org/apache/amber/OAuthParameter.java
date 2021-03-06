/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.amber;

/**
 * The OAuth specification defines individual parameters required by a provider
 * at different stages of the authentication and authorisation process.
 *
 * @version $Id$
 */
public enum OAuthParameter {

    /**
     * The callback parameter name.
     *
     * Value: {@code oauth_callback}.
     */
    CALLBACK("oauth_callback"),

    /**
     * The Consumer key parameter name.
     *
     * Value: {@code oauth_consumer_key}.
     */
    CONSUMER_KEY("oauth_consumer_key"),

    /**
     * The nonce parameter name.
     *
     * Value: {@code oauth_nonce}.
     */
    NONCE("oauth_nonce"),

    /**
     * The realm parameter name.
     *
     * Value: {@code realm}.
     */
    REALM("realm", false, false),

    /**
     * The signature parameter name.
     *
     * Value: {@code oauth_signature}.
     */
    SIGNATURE("oauth_signature"),

    /**
     * The signature method parameter name.
     *
     * Value: {@code oauth_signature_method}.
     */
    SIGNATURE_METHOD("oauth_signature_method"),

    /**
     * The timestamp parameter name.
     *
     * Value: {@code oauth_timestamp}.
     */
    TIMESTAMP("oauth_timestamp", true, true),

    /**
     * The token parameter name.
     *
     * Value: {@code oauth_token}.
     *
     * @see org.apache.amber.OAuthToken
     */
    TOKEN("oauth_token"),

    /**
     * The token secret parameter name.
     *
     * Value: {@code oauth_token_secret}.
     *
     * @see org.apache.amber.OAuthToken
     */
    TOKEN_SECRET("oauth_token_secret", false, false),

    /**
     * The verifier parameter name.
     *
     * Value: {@code oauth_verifier}.
     */
    VERIFIER("oauth_verifier", false, false),

    /**
     * The version parameter name.
     *
     * Value: {@code oauth_version}.
     *
     * @see org.apache.amber.Version
     */
    VERSION("oauth_version", false, true);

    private final String label;

    private final boolean optional;

    private final boolean includeInSignature;

    private OAuthParameter(String label) {
        this(label, false, true);
    }

    private OAuthParameter(String label, boolean optional, boolean includeInSignature) {
        this.label = label;
        this.optional = optional;
        this.includeInSignature = includeInSignature;
    }

    public String getLabel() {
        return this.label;
    }

    public boolean isOptional() {
        return this.optional;
    }

    public boolean isIncludeInSignature() {
        return this.includeInSignature;
    }

    @Override
    public String toString() {
        return this.label;
    }

}
