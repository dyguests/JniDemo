#include <jni.h>
#include <string>

//extern "C" JNIEXPORT jstring JNICALL
//Java_com_fanhl_jnidemo_MainActivity_encode(
//        JNIEnv *env,
//        jobject /* this */) {
//    std::string hello = "Hello from C++";
//    return env->NewStringUTF(hello.c_str());
//}

extern "C" JNIEXPORT jstring JNICALL Java_com_fanhl_jnidemo_JNIUtil_getWorld(
        JNIEnv *env,
        jobject instance
) {
    std::string hello = "中文测试 Hello from C++";

    return env->NewStringUTF(hello.c_str());
}
extern "C" JNIEXPORT jint JNICALL Java_com_fanhl_jnidemo_JNIUtil_add(JNIEnv *env, jclass pThis, jint a, jint b) {
    return a + b;
}