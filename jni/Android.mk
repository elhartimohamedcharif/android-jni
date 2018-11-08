
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

# Here we give our module name and source file(s)
LOCAL_SRC_FILES := hello-jnicallback.c
LOCAL_MODULE    := hello-jnicallback
APP_PLATFORM    := android-16

include $(BUILD_SHARED_LIBRARY)
