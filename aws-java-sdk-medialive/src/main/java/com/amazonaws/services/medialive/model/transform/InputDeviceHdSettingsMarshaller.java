/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputDeviceHdSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputDeviceHdSettingsMarshaller {

    private static final MarshallingInfo<String> ACTIVEINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeInput").build();
    private static final MarshallingInfo<String> CONFIGUREDINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredInput").build();
    private static final MarshallingInfo<String> DEVICESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceState").build();
    private static final MarshallingInfo<Double> FRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("framerate").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("height").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<String> SCANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanType").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final InputDeviceHdSettingsMarshaller instance = new InputDeviceHdSettingsMarshaller();

    public static InputDeviceHdSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputDeviceHdSettings inputDeviceHdSettings, ProtocolMarshaller protocolMarshaller) {

        if (inputDeviceHdSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputDeviceHdSettings.getActiveInput(), ACTIVEINPUT_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getConfiguredInput(), CONFIGUREDINPUT_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getDeviceState(), DEVICESTATE_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getFramerate(), FRAMERATE_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getScanType(), SCANTYPE_BINDING);
            protocolMarshaller.marshall(inputDeviceHdSettings.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
