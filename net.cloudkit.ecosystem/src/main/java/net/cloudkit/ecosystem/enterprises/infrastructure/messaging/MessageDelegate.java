/*
 * Copyright (C) 2015. The CloudKit Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.cloudkit.ecosystem.enterprises.infrastructure.messaging;

import java.io.Serializable;
import java.util.Map;

/**
 * @author hongquanli <hongquanli@qq.com>
 * @version 1.0 2015/11/20 16:03
 */
public interface MessageDelegate {

    void handleMessage(String message);
    void handleMessage(Map message); void handleMessage(byte[] message);
    void handleMessage(Serializable message);
    // pass the channel/pattern as well
    void handleMessage(Serializable message, String channel);
}