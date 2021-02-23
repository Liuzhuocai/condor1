/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.launcher3.config;

import com.android.launcher3.BuildConfig;

/**
 * Defines a set of flags used to control various launcher behaviors.
 *
 * All the flags should be defined here with appropriate default values. To override a value,
 * redefine it in {@link FeatureFlags}.
 *
 * This class is kept package-private to prevent direct access.
 */
abstract class BaseFlags {

    BaseFlags() {}

    public static final boolean IS_DOGFOOD_BUILD = false;
    public static final String AUTHORITY = (BuildConfig.APPLICATION_ID + ".settings").intern();

    // When enabled allows to use any point on the fast scrollbar to start dragging.
    public static final boolean LAUNCHER3_DIRECT_SCROLL = true;
    // When enabled the promise icon is visible in all apps while installation an app.
    public static final boolean LAUNCHER3_PROMISE_APPS_IN_ALL_APPS = false;
    // When enabled allows use of spring motions on the icons.
    public static final boolean LAUNCHER3_SPRING_ICONS = false;

    // Feature flag to enable moving the QSB on the 0th screen of the workspace.
    public static final boolean QSB_ON_FIRST_SCREEN = true;
    // When enabled the all-apps icon is not added to the hotseat.
    public static final boolean NO_ALL_APPS_ICON = true;

    // When true, custom widgets are loaded using CustomWidgetParser.
    public static final boolean ENABLE_CUSTOM_WIDGETS = false;

    // Features to control Launcher3Go behavior
    public static  boolean GO_DISABLE_WIDGETS = false;

    // When enabled shows a work profile tab in all apps
    public static final boolean ALL_APPS_TABS_ENABLED = true;

    // When true, overview shows screenshots in the orientation they were taken rather than
    // trying to make them fit the orientation the device is in.
    public static final boolean OVERVIEW_USE_SCREENSHOT_ORIENTATION = true;



    public static boolean LAUNCHER3_DISABLE_ICON_NORMALIZATION = false;
    public static final boolean ADAPTIVE_ICON_SHADOW = false;
    //liuzuo :add for GMS to adjust widget visibility:start
    public static final boolean GO_PROJECT = false;
    //liuzuo :add for GMS to adjust widget visibility:end


    //Bruce:add to unread message in go project:start
    public final static boolean UNREAD_MESSAGE = false;
    //Bruce:add to unread message in go project:end

    //liuzuo:minus one:start
    public final static boolean MINUS_ONE = true;
    //liuzuo:minus one:end
}