/*
 * Copyright (C) 2016 The Android Open Source Project
 * Copyright (C) 2016 The Mokee Project
 * Copyright (C) 2016 The CyanogenMod Project
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

package com.validity.fingerprint;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ValidityServiceStarter extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        VLog.v("onCreate");
        Intent serviceintent = new Intent(this, ValidityService.class);
        startService(serviceintent);
    }

}
