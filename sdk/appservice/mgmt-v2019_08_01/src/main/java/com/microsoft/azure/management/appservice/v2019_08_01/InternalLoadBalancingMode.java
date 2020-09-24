/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for InternalLoadBalancingMode.
 */
public enum InternalLoadBalancingMode {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Web. */
    WEB("Web"),

    /** Enum value Publishing. */
    PUBLISHING("Publishing");

    /** The actual serialized value for a InternalLoadBalancingMode instance. */
    private String value;

    InternalLoadBalancingMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InternalLoadBalancingMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InternalLoadBalancingMode object, or null if unable to parse.
     */
    @JsonCreator
    public static InternalLoadBalancingMode fromString(String value) {
        InternalLoadBalancingMode[] items = InternalLoadBalancingMode.values();
        for (InternalLoadBalancingMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
