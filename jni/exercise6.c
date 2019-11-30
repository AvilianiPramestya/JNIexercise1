#include<jni.h>
#include<string.h>

jstring Java_id_ac_ui_cs_mobileprogramming_aviliani_exercise6_MainActivity_helloWorld(JNIEnv* env, jobject obj) {

    return (*env) ->NewStringUTF(env, "Hello World!");
}