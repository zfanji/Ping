# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/Colin/Android/SDK/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:
-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-repackageclasses ''
-allowaccessmodification
-verbose
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*
-keepattributes *Annotation*

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
