#include <jni.h>
#include <string>
#include <iostream>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_fanhl_jnidemo_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";

    std::cout << "Java_com_fanhl_jnidemo_MainActivity_stringFromJNI_cout\n";

    return env->NewStringUTF(hello.c_str());
}
