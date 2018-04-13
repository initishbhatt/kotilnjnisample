#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_initishbhatt_kotilnjnisample_NativeStore_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

