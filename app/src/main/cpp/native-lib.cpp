#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_fanhl_jnidemo_MainActivity_encode(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
