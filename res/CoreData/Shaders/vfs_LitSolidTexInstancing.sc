�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�5py|pj���Rv��!B1��!�u�'aQ����ؕpՀ��$HH�zQ�cT��G ��X[I��[Te9�	�zZ�4�Vf��܎�x�3LǣcW������z����H漽;��O^O�#����T8��.V�A�͓���4P��m����RU �ܟ�����k�dq5~������Sh����c�wJij�Ê�׌no��a�+H�Pju�{��֢�d!޶E����c?��TS�\�M�(��EUg��-�ig�c@������M@��޳6�Ob�"�3��<(d�ĂZ�+�N����b�2!�/[��������Mzf���=+�t��_߉���H��{�i�h�m��>J��"ӤX�Q��t���9"R��,�~8A9�
�"8қ��<�æ\����Xޡ�Ow�����!~�&�7�d�(tB;Ȇ�ۀ|ro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
 �   #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USIG_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common �uniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"p
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v1normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.�gb,1.0);
}

#endif
