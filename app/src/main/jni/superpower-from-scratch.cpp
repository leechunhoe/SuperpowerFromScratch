#include <jni.h>
#include <stdlib.h>
#include <SuperpoweredFrequencyDomain.h>
#include <AndroidIO/SuperpoweredAndroidAudioIO.h>
#include <SuperpoweredSimple.h>
#include <SLES/OpenSLES.h>
#include <SLES/OpenSLES_AndroidConfiguration.h>

#ifdef __cplusplus
extern "C"
{
#endif
JNIEXPORT jstring JNICALL
Java_com_leechunhoe_superpowerfromscratch_MainActivity_getSuperpower(JNIEnv* env,
                                                                     jobject instance) {

    // TODO
    return (env)->NewStringUTF("diamdiam");
}
#ifdef __cplusplus
}
#endif