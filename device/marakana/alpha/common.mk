# Since this file can also be referenced by alpha-sdk_addon
# we cannot assume LOCAL_PATH points to the directory where
# this file is located. Instead, we create another variable
# to capture this directory.
MY_PATH := $(LOCAL_PATH)/../alpha

# Include all makefiles in sub-directories (one level deep)
include $(call all-subdir-makefiles)

# Get the emulator-specific support for vold.fstab, which mounts the external storage (sdcard)
PRODUCT_COPY_FILES += system/core/rootdir/etc/vold.fstab:system/etc/vold.fstab

# These are the hardware-specific features
PRODUCT_COPY_FILES += \
        frameworks/native/data/etc/handheld_core_hardware.xml:system/etc/permissions/handheld_core_hardware.xml

# Enable overlays
DEVICE_PACKAGE_OVERLAYS := $(MY_PATH)/overlay


