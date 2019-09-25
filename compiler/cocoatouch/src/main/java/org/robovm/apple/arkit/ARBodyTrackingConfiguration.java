/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.apple.arkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARBodyTrackingConfiguration/*</name>*/ 
    extends /*<extends>*/ARConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARBodyTrackingConfigurationPtr extends Ptr<ARBodyTrackingConfiguration, ARBodyTrackingConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARBodyTrackingConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ARBodyTrackingConfiguration() {}
    protected ARBodyTrackingConfiguration(Handle h, long handle) { super(h, handle); }
    protected ARBodyTrackingConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isAutoFocusEnabled")
    public native boolean isAutoFocusEnabled();
    @Property(selector = "setAutoFocusEnabled:")
    public native void setAutoFocusEnabled(boolean v);
    @Property(selector = "initialWorldMap")
    public native ARWorldMap getInitialWorldMap();
    @Property(selector = "setInitialWorldMap:")
    public native void setInitialWorldMap(ARWorldMap v);
    @Property(selector = "environmentTexturing")
    public native AREnvironmentTexturing getEnvironmentTexturing();
    @Property(selector = "setEnvironmentTexturing:")
    public native void setEnvironmentTexturing(AREnvironmentTexturing v);
    @Property(selector = "wantsHDREnvironmentTextures")
    public native boolean wantsHDREnvironmentTextures();
    @Property(selector = "setWantsHDREnvironmentTextures:")
    public native void setWantsHDREnvironmentTextures(boolean v);
    @Property(selector = "planeDetection")
    public native ARPlaneDetection getPlaneDetection();
    @Property(selector = "setPlaneDetection:")
    public native void setPlaneDetection(ARPlaneDetection v);
    @Property(selector = "detectionImages")
    public native NSSet<ARReferenceImage> getDetectionImages();
    @Property(selector = "setDetectionImages:")
    public native void setDetectionImages(NSSet<ARReferenceImage> v);
    @Property(selector = "automaticImageScaleEstimationEnabled")
    public native boolean isAutomaticImageScaleEstimationEnabled();
    @Property(selector = "setAutomaticImageScaleEstimationEnabled:")
    public native void setAutomaticImageScaleEstimationEnabled(boolean v);
    @Property(selector = "automaticSkeletonScaleEstimationEnabled")
    public native boolean isAutomaticSkeletonScaleEstimationEnabled();
    @Property(selector = "setAutomaticSkeletonScaleEstimationEnabled:")
    public native void setAutomaticSkeletonScaleEstimationEnabled(boolean v);
    @Property(selector = "maximumNumberOfTrackedImages")
    public native @MachineSizedSInt long getMaximumNumberOfTrackedImages();
    @Property(selector = "setMaximumNumberOfTrackedImages:")
    public native void setMaximumNumberOfTrackedImages(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}