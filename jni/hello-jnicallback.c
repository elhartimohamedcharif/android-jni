
#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_hellojnicallback_MainActivity_stringFromJNI(JNIEnv* env, jobject thiz)
{
    return (*env)->NewStringUTF(env, "Hello World");
}
